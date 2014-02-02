package fechas;
import java.text.DateFormat;
import java.util.*;

//a traves del constructor de la clase Date(), crea un objeto Date que almacena muchos fields de fecha
public class DateDemo {
	public static void main(String[] args) {
	
	//El método getTime() devuelve un valor Long de un objeto Date
	Date fecha1_date = new Date();
	long ahora_date=fecha1_date.getTime();//SIN FORMATO
	System.out.println("la fecha de hoy es: "+ahora_date);
	
	//tenemos que filtrar el valor obtenido por getTime() --> class DateFormat()
	//Un propósito de la clase DateFormat es crear Strings en formas en que los humanos puedan entenderlas y manejarlas fácilmente.
	DateFormat fecha1_format=DateFormat.getDateInstance();//SIN FORMATO
	String ahora_format = fecha1_format.format(ahora_date);
	System.out.println("la fecha de hoy es: "+ahora_format);

	//tambien podemos obtener fechas en formatos mas agradables
	fecha1_format=DateFormat.getDateInstance(DateFormat.SHORT);
	ahora_format=fecha1_format.format(fecha1_date);
	System.out.println("formato (SHORT): "+ahora_format);

	fecha1_format=DateFormat.getDateInstance(DateFormat.MEDIUM);
	ahora_format=fecha1_format.format(fecha1_date);
	System.out.println("formato (MEDIUM): "+ahora_format);

	fecha1_format=DateFormat.getDateInstance(DateFormat.LONG);
	ahora_format=fecha1_format.format(fecha1_date);
	System.out.println("formato (LONG): "+ahora_format);
	
	fecha1_format=DateFormat.getDateInstance(DateFormat.FULL);
	ahora_format=fecha1_format.format(fecha1_date);
	System.out.println("formato (FULL): "+ahora_format);

	}
	
}
