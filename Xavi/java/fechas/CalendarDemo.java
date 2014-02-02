package fechas;

/*almacenamiento y manipulacion de fechas*/

import java.text.*;//Date, DateFormat
import java.util.*;//Calendar, GregorianCalendar

/*la clase Calendar es 'abstracta' y NO se puede instanciar
cremos instancias de clases heredadas (GregorianCalendar) de Calendar
<code>Calendar fecha= new GregorianCalendar();</code>*/


public class CalendarDemo {
	public static void main(String[] args) {
		
		
	/**
	 * class Calendar
	 */
	//get.instance(); inicializa todos los valores de los 'Calendar.field'
	Calendar fecha1 = Calendar.getInstance();
	//uasamos el metodo get() de GregorianCalendar
	//y los campos para obtener datos de fechas de Calendar: YEAR-MONTH-DAY_OF_MONTH ...
	int año = fecha1.get(Calendar.YEAR);
	int mes = fecha1.get(Calendar.MONTH);
	int dia_mes = fecha1.get(Calendar.DAY_OF_MONTH);
	int dia_semana = fecha1.get(Calendar.DAY_OF_WEEK);
	int mes_año = fecha1.get(Calendar.WEEK_OF_YEAR);
	int semana_mes = fecha1.get(Calendar.WEEK_OF_MONTH);
	
	int hora = fecha1.get(Calendar.HOUR);
	int hora_dia = fecha1.get(Calendar.HOUR_OF_DAY);
	int min = fecha1.get(Calendar.MINUTE);
	int seg = fecha1.get(Calendar.SECOND);
	int mseg = fecha1.get(Calendar.MILLISECOND);

	/*para obtener la fecha actual
	 * como es una clase abstracta y NO tiene un constructor explicito,,
	 *usaremos un metodo getinstance()
	 */
	Calendar fecha2= Calendar.getInstance();
	System.out.println(fecha2.toString());
	
	System.out.println("\nmisma fecha en dos rangos");
	//seteamos HOUR:0-11
	fecha2.set(Calendar.HOUR, 5);
	//obtenemos la hora en distintos rangos
	System.out.println(fecha2.get(Calendar.HOUR)+" PM");
	System.out.println(fecha2.get(Calendar.HOUR_OF_DAY));
	
	System.out.println("añadimos 2 horas");
	//aumentamos las horas
	fecha2.add(Calendar.HOUR, 2);
	//obtenemos la hora en distintos rangos
	System.out.println(fecha2.get(Calendar.HOUR)+" PM");
	System.out.println(fecha2.get(Calendar.HOUR_OF_DAY));
	
	//aumentamos los minutos sin modificar las horas
	fecha2.roll(Calendar.MINUTE, 25); //add(); modifiac los fields superiores
	
	//comparacion de fechas
	/*Nos devolverá -1 si hora1 es menor que hora2, 
	 * 0 si son iguales, 
	 * y 1 si el primero es mayor que el segundo.*/
	Calendar hora1=Calendar.getInstance();
	Calendar hora2=Calendar.getInstance();
	hora1.add(Calendar.MINUTE, 5);//le añadimos 5 minutos a la hora2
	int comp=hora1.compareTo(hora2);
	if (comp<0) System.out.println("la hora1 es MENOR que la hora2");
	else if(comp==0) System.out.println("las dos horas son IGUALES");
	else if (comp>0) System.out.println("la hora1 es MAYOR que la hora2");
	
	//ejemplo: establecer la fecha del ultimo dia del 2009
	Calendar fecha3 = Calendar.getInstance();
	fecha3.set(Calendar.YEAR, 2009);
	fecha3.set(Calendar.MONTH, 11);//diciembre
	fecha3.set(Calendar.DAY_OF_MONTH, 31);//año nuevo
	int año3=fecha3.get(Calendar.YEAR);
	int mes3=fecha3.get(Calendar.MONTH);
	int dia_mes3=fecha3.get(Calendar.DAY_OF_MONTH);
	System.out.println("Diciembre=11");
	System.out.println(dia_mes3+"/"+mes3+"/"+año3);
	
	//restar fechas
	fecha3.add(Calendar.MONTH, -1);
	mes3=fecha3.get(Calendar.MONTH);
	System.out.println("Noviembre=10");
	System.out.println(dia_mes3+"/"+mes3+"/"+año3);
	
	
	
	/**
	 * class GregorianCalendar
	 * a traves de su constructor podemos setear una fecha
	 */
	//CONSTRUCTOR GREGORIANCALENDAR
	GregorianCalendar finMundo = new GregorianCalendar (2012, Calendar.DECEMBER, 21);
	System.out.println(finMundo.toString());//la fecha esta seteada pero no formateada
	
	//formateamos con DATE  y DATEFORMAT
	Date finMundo_date = finMundo.getTime();//obtenemos la fecha
	DateFormat finMundo_format=DateFormat.getDateInstance();//formato predeterminado
	String fin=finMundo_format.format(finMundo_date);
	System.out.println("El fin del mundo llegaria: "+fin);
	
	//tambien podemos usar el formato completo
	finMundo_format=DateFormat.getDateInstance(DateFormat.FULL);//formato predeterminado
	fin=finMundo_format.format(finMundo_date);
	System.out.println("El fin del mundo llegaria: "+fin);
	
	/**
	 * class GregorianCalendar
	 * manipular fechas add();
	 * obj.add(GregorianCalendar.field, int value) 
	 * </br>constantes de field: DATE, MONTH, YEAR y WEEK_OF_YEAR.
	 */
	GregorianCalendar nuevoMundo = new GregorianCalendar(2012, Calendar.DECEMBER, 21);
	nuevoMundo.add(GregorianCalendar.DAY_OF_MONTH, 11);//AÑADO los dias necesarios para el nuevo año
	Date nuevoMundo_date = nuevoMundo.getTime();//obtenemos la fecha sin formatear
	DateFormat nuevoMundo_format = DateFormat.getDateInstance(DateFormat.FULL);//fecha formateada
	String nuevo = nuevoMundo_format.format(nuevoMundo_date);
	System.out.println("El primer dia del año, despues del fin del mundo llegaria: "+nuevo);
	
	
	}	
}
