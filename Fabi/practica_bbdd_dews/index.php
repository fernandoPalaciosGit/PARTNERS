<?php

include 'funciones.php';

?>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;  charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/style.css" rel="stylesheet" >
<title>PDO</title>

</head>

<body>

<div id="wrapper">
<?

$db = conectaDB();

$consulta_familia = "SELECT * FROM familias";
$result = $db->query($consulta_familia);

    $rows = $result->fetchAll();

?>
	  <form class="filtrado" name="formmi" method="GET">
	  	<p class="text-info">Seleccione una familia</p>
			<select name="familia">
			<option value="Todas">Todas</option>
					<?
					foreach ($rows as $row) {

						echo '<option value="'.$row['id'].'" "'.$seleccionado.'">'.$row['familia'].'</option>';
					}

					echo $seleccionado;
					echo $row
					?>
		</select>
		<br/>
		<input class="btn btn-info" type='submit' value='Filtrar'/>

	</form>

    <div class="formulario">

	<?php

		if ($_GET['familia'] == 1) {

			echo '<h2>FAMILIA INDICA</h2>';

		} else if ($_GET['familia'] == 2) {

			echo '<h2>FAMILIA SATIVA</h2>';

		} else {

			echo '<h2>TODAS LAS FAMILIAS</h2>';

		}

	?>
			<table class="table table-hover">
        <thead>
          <tr>
            <th>#</th>
            <th>Nombre</th>
            <th>Nombre Corto</th>
            <th>PVP</th>
			<th>Opciones</th>
          </tr>
        </thead>
        <tbody>
<?

if (empty($_GET['familia']) || $_GET['familia'] =='Todas') {

	$consulta_productos = 'SELECT * FROM productos';

} else {

	$consulta_productos = 'SELECT * FROM productos WHERE id_familia='.$_GET['familia'].'';

}

$result = $db->query($consulta_productos);

    $rows = $result->fetchAll();

    foreach ($rows as $row) {
		echo '<tr>';
        echo '<td>'.$row['id'].'</td>';
		echo '<td>'.$row['nombre'].'</td>';
        echo '<td>'.$row['nombre_corto'].'</td>';
		echo '<td>'.$row['PVP'].'</td>';
		echo '<td><a href="index.php?familia='.$_GET['familia'].'&action=editar&id='.$row['id'].'">Editar</a></td>';
		echo '</tr>';
    }


?>
        </tbody>
      </table>

    </div>


    <div class="tablon" id="tablon">

	<?php
		if ($_GET['action'] == 'editar') {

			$consulta_editar = 'SELECT * FROM productos WHERE id='.$_GET['id'].'';
			$result = $db->query($consulta_editar);

			$rows = $result->fetch();

		}
	?>
	<form method="post" name="form1" action="" enctype="multipart/form-data">
	<input type="hidden" name="action" value="actualizar" />
	Nombre<br/>
	<input type="text" name="nombre" value="<? echo $rows['nombre']; ?>" /><br/>
	Nombre corto<br/>
	<input type="text" name="nombre_corto"  value="<? echo $rows['nombre_corto']; ?>"/><br/>
	Descripción<br/>
	<input type="text" name="descripcion"  value="<? echo $rows['desc']; ?>"/><br/>
	PVP<br/>
	<input type="text" name="PVP"  value="<? echo $rows['PVP']; ?>"/><br/>
	<input class="btn btn-success" type="submit" value="Actualizar"/>
	<a href="index.php" class="btn btn-danger" >Cancelar</a>

	</form>

		<?php

			if ($_POST['action'] == 'actualizar'){

				$nombre = $_POST['nombre'];
				$nombre_corto = $_POST['nombre_corto'];
				$de = $_POST['descripcion'];
				$PVP = $_POST['PVP'];
				$id = $_GET['id'];


				$consulta_update = 'UPDATE productos SET nombre = :name,nombre_corto = :shortname, PVP = :nPVP WHERE id= :id';

				$stm = $db->prepare($consulta_update);
				$stm->execute(array(
										':name' => $nombre,
										':shortname' => $nombre_corto,
										':nPVP' => $PVP,
										':id' 	   =>	$id
										));

				echo '<p class="text-danger">Actualizando registro...</p>';
				echo '<meta http-equiv="refresh" content="1">';
			}


		?>
	</div>
</body>
</html>