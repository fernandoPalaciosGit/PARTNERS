package string_builder;
import java.io.*;


/**
 * <code>class StringBuilder()</code> se utiliza para crear cadenas de texto en las que preveemos que
 * van a modificarse durante su ejecucion</br> IMP preveer que se va a utilizar
 * en un p'rograma SIN subprocesos (sin Threads).</br>
 * <code>class StringReader()</code>
 * <code>class CharArrayWriter()</code>
 * @author fernando
 */
public class StringMutante {
	public static void main(String[] args) throws IOException{
		/**
		 * CADENA DE TEXTO IMMUTABLE
		 */
		String str1=new String ("Cadena texto 1");/*SAME: String str1="cadena";*/
		System.out.println(str1);
		
		//cada vez que modificamos su contenido se crea un nuevo objeto (con la cadena nueva) 
		//y se desecha el anterior
		str1="otra vez la misma cadena 1";
		System.out.println(str1);
		
		/**
		 * CADENA DE TEXTO MUTANTE
		 */
		
		StringBuilder str2=new StringBuilder("Cadena de texto 2"); 
		System.out.println(str2);
		str2.append(" mutable");
		System.out.println(str2);
		
		//devolver el caracter en el string del ultimo, del ultimo indice, 
		//y mostrar su valor (envoltorio de valores primitivos)
		char last=str2.charAt((str2.length())-1);
		String last1=String.valueOf(last);
		System.out.println("INDICE del ultimo caracter en el array 'str2' = "+str2.lastIndexOf(last1));
		
		//lo vaciamos, sera inaccesible 
		str2=null;
		str2=new StringBuilder(50);//lo iniciamos con un espacio para la cadena
		System.out.println("str2 = "+str2);
		
		System.out.print("str2: ");
		str2.append("Modelo de String ");
		str2.append("mutante ");
		str2.append("para un solo hilo de ejecucion");
		System.out.println(str2);
		
		for(int i=0;i<5;i++){
			str2.append("-"+i+"-");
		}
		System.out.println(str2);
		
		//reseteamos otra vez el str2
		str2= new StringBuilder();
		System.out.println("str2 = "+str2);
		
		//como podemos añadir cualquier tipo de datos a append()
		//usaremos (char)read();
		System.out.println("\n\nleer por consola un stream de bytes");
		char ch;
		do{
			ch=(char)System.in.read();
			str2.append(ch);
		}while(ch!='\n');
		System.out.println("str2: "+str2);
		
		//leo el string de datos por consola: flujo de caracteres para poder usarlo despues en algun flujo de salida
		//primero debemos encapsular 'StringBuilder str2' a un string
		int n=0;
		try (StringReader sr=new StringReader (new String(str2))) {
			
			while(n!=-1){
				if(n>0){
					n=sr.read();
					System.out.print((char)n);
				}
			}
			
		} catch (Exception e) {
				e.printStackTrace();
		}

	
	}
}
