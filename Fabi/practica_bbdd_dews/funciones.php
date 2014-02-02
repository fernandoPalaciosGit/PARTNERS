<?php

function conectaDB()
{

    $conn = null;
    $host = 'localhost';
    $db =   'dwes';
    $user = 'root';
    $pwd =  '4316';
    try {
        $conn = new PDO('mysql:host='.$host.';dbname='.$db, $user, $pwd);
        echo 'Connected succesfully.<br>';
    }
    catch (PDOException $e) {
        echo '<p>Cannot connect to database !!</p>';
        exit;
    }
    return $conn;

}

$db = conectaDB();

?>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

<title>PDO</title>
<style>

#wrapper {
  width: 800px;
  margin: 0 auto;
}

.formulario {
	position:absolute;
	padding:10px;
	margin-top:100px;
	width:360px;
	height:310px;
	background-color:#CCC;
	border:1px solid #000;
}

.tablon {
	position:absolute;
	margin-top:100px;
	margin-left:500px;
	width:300px;
	border:1px solid #000;
}

.checkbox {

	font-size:24px;
}

.btn.btn-info  {
	margin-left:65px;
}


.btbutton {
	margin-left:4px;


}


</style>


</head>

<body>

<div id="wrapper">
<?
$consulta_familia = "SELECT * FROM familias";
$result = $db->query($consulta_familia);

    $rows = $result->fetchAll();

?>


	<select>
	<option value="Todas">Todas</option>
<?
foreach ($rows as $row) {
	echo '<option value="'.$row['familia'].'">'.$row['familia'].'</option>';
}
?>
</select>
    <div class="formulario">
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
$consulta_productos = "SELECT * FROM productos";
$result = $db->query($consulta_productos);
    // Extract the values from $result
    $rows = $result->fetchAll();
    // Since the values are an associative array we use foreach to extract the values from $rows
    foreach ($rows as $row) {
		echo '<tr>';
        echo '<td>'.$row['id'].'</td>';
		echo '<td>'.$row['nombre'].'</td>';
        echo '<td>'.$row['nombre_corto'].'</td>';
		echo '<td>'.$row['PVP'].'</td>';
		echo '<td><a href="#">Editar</a></td>';
		echo '</tr>';
    }


?>
        </tbody>
      </table>


    </div>


    <div class="tablon" id="tablon">


</div>
</body>
</html>