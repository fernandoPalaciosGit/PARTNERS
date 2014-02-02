package herencias_polimorfismo.censouni;

import java.text.*;//Date, DateFormat
import java.util.*;//Calendar, GregorianCalendar

/**
 * clase que nos permite setear la fecha del programa 
 * a traves de la sobrecarga de constructores
 * @author fernando
 */
public class Fecha {
	
	//*************VARIABLES DE INSTANCIA*************
	private int año;
	private int mes;
	private int dia_mes;
	private int hora;
	private int minutos;
	private int segundos;
	
	//*************SOBRECARGA DE CONSTRUCTORES*************
	/**
	 * constructor con parametros de fecha
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año){
		this.dia_mes=dia;
		this.mes=mes;
		this.año=año;
		
	
		Calendar actual = new GregorianCalendar(this.dia_mes, this.mes, this.año);
		
		//formateamos con DATE  y DATEFORMAT
		//le damos un formato completo a traves de DateFormat.FULL
		Date actual_date = actual.getTime();//obtenemos la fecha seteada
		DateFormat actual_format=DateFormat.getDateInstance(DateFormat.FULL);//formato completo
		String hoy=actual_format.format(actual_date);
		System.out.println("fecha elegida: "+hoy);

	}
	
	/**
	 * constructor con un parametro de fecha separada por '/' o '-'
	 * @param fecha
	 */
	public Fecha(String fecha) throws fechaErronea{
		String[] strFecha = null;//vector que almacena los campos de la fecha
		if (fecha.indexOf("/") > 0)
			strFecha=fecha.split("/");	
		else if (fecha.indexOf("-") > 0){
			strFecha=fecha.split("-");
		}
		
		//asignamos variales a los elementos del vector
		this.dia_mes=Integer.parseInt(strFecha[0]);
		this.mes=Integer.parseInt(strFecha[1])-1;
		this.año=Integer.parseInt(strFecha[2]);
		

		Calendar actual = new GregorianCalendar(this.dia_mes, this.mes, this.año);
		
		//formateamos con DATE  y DATEFORMAT
		//le damos un formato completo a traves de DateFormat.FULL
		Date actual_date = actual.getTime();//obtenemos la fecha seteada
		DateFormat actual_format=DateFormat.getDateInstance(DateFormat.FULL);//formato completo
		String hoy=actual_format.format(actual_date);
		System.out.println("fecha elegida: "+hoy);

		
	}
	
	/**
	 * FECHA ACTUAL
	 * constructor predetermminado: public Fecha();
	 * constructor: public GregorianCalendar
	 * ( int year, int month, int dayOfMonth, int hourOfDay, int minute, int second)
	 */
	public Fecha(){
		//obtenemos la fecha actual a traves de 'fields' : class Calendar
		Calendar actual=new GregorianCalendar();
		this.dia_mes=actual.get(Calendar.DAY_OF_MONTH);
		this.mes=actual.get(Calendar.MONTH);
		this.año=actual.get(Calendar.YEAR);
		this.hora=actual.get(Calendar.HOUR_OF_DAY);
		this.minutos=actual.get(Calendar.MINUTE);
		this.segundos=actual.get(Calendar.SECOND);
		/**
		 * completar el costructor GregorianCalendar
		 */
		actual= new GregorianCalendar(this.año, this.mes, this.dia_mes, this.hora, this.minutos, this.segundos);
		
		//formateamos con DATE  y DATEFORMAT
		//le damos un formato completo a traves de DateFormat.FULL
		Date actual_date = actual.getTime();//obtenemos la fecha
		DateFormat actual_format=DateFormat.getDateInstance(DateFormat.FULL);//formato completo
		String dia=actual_format.format(actual_date);
		//HH:MM:SS
		String hora = getHoras(this.hora, this.minutos, this.segundos);
		
		System.out.println("fecha actual: "+dia+" a las "+hora);
	}
	
	
	//*************METODOS PROPIOS*************
	
	/**
	 * como no tengo constructor para formatear un afecha entera, 
	 * encapsulo en un metodo getHoras() las HH:MM:SS
	 * @param hora2
	 * @param minutos2
	 * @param segundos2
	 * @return HH:MM:SS accesible solo para esta clase
	 */
	private String getHoras(int hora2, int minutos2, int segundos2) {
		return hora2+":"+minutos2+":"+segundos2;
	}
	
	public String toString (){
		return "FECHA: "+this.dia_mes+"/"+this.mes+"/"+this.año+
				"HORA: "+this.hora+":"+this.minutos+":"+this.segundos;
	}
	
	/*SETTERS*/
	public void setAño(int año) {
		this.año = año;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia_mes(int dia_mes) {
		this.dia_mes = dia_mes;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/*GETTERS*/
	public int getAño() {
		return año;
	}

	public int getMes() {
		return mes;
	}

	public int getDia_mes() {
		return dia_mes;
	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}
	
	/*PROBAR LAS FECHAS*/
	public static void main(String[] args) throws fechaErronea {
		new Fecha(); //fecha actual
		new Fecha("1985/12/11"); //fecha seteada
		new Fecha("1985-12-11");
		new Fecha(1952, 5, 21);
	}
	
	
	
}


/**
 * excepcion que se lanza cuando inicializamos la fecha a traves del contructor
 * @author fernando
 *
 */
class fechaErronea extends Exception{
	public fechaErronea(){
		super("Fecha con argumento incorrecto");
	}
}

