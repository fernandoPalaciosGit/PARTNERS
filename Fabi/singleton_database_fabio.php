<?php

class MySqlDatabase
{

    public $link;
    private $conexion;
    private static $instancia;

    // Constructor privado como parte de los patrones singleton
    private function __construct() {}

    public function connect($host, $user, $password, $database)
    {

        $this->link = @mysql_pconnect($host, $user, $password);

        if (!$this->link)
        {
            throw new Exception('Imposible conectar con la base de datos: ' .mysql_error());
        }

		 if ($database) $this->useDatabase($database);

        return $this->link;
    }

    //  Instancia de Singleton.  Debe ser estatico para poder utilizarlo como objeto

    public static function getInstance()
    {
        if (!isset(self::$instancia))
        {
            self::$instancia = new MySqlDatabase();
        }

        return self::$instancia;
    }

	//CONFIRMACIÓN DE CONEXION A LA BBDD
	public function useDatabase($database)
    {
        if (!@mysql_select_db($database, $this->link))
        {
            throw new Exception('Imposible conectar con la base de datos: ' . mysql_error($this->link));
        }
    }

	//CONSULTA A LA BBDD
	public function query($sql)
    {
		$result = mysql_query($sql);

		if(!$sql)
        {
			die('Consulta no satisfactoria' .mysql_error($this->link));
		}
        return $result;
    }
}

?>
