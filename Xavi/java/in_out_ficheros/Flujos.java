package in_out_ficheros;

import java.io.*;

class Lectura {
	
	//METODOS**********
	public static void leerCodigo() {
		
		//NO puedo intorducir el flujo de bytes de salida por consola (System.out)
		//dentro de un try con recurso, o cerrarlo al final del metodo
		//porque en el main, cuando llamo, despues, vuelvo a utilizar este flujo (syso) en otros metodos o en el propio main
		PrintWriter pw = null;
		pw=new PrintWriter(System.out);
		try {
			
			//write(String s)--void
			pw.write("Escribicos a traves de un flujo de salida de caracteres por consola");
			pw.write("\n");
			char ch[]=new char[10];
			
			for(int i=0;i<ch.length;i++){
				char abc='A';
				abc+=(char)i;
				ch[i]=abc;
			}
			//write(ch[], int off, int length);--void
			pw.write(ch, 0, ch.length);
			pw.write("\n");
			pw.write("El ultimo caracter del vector ch[] = "+ch[ch.length-1]);
			
			//flush();--vacia el buffer de contenido
			//IMP: hay que vaciarlo antes de salir del metodo!!!!!para volver a  utilizarlo en otro
			pw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	
	public static String leerConsola(){
		//inicializamos la variable del metodo antes del try
		String leer="";
		
		//saco fuera el flujo porque lo quiero volver a utilizar
		BufferedReader br=null;
		br=new BufferedReader (new InputStreamReader (System.in));
		try {
			int cad=0;
			char vector[]=new char[20];
			int i=0;
			do{
				cad=br.read();//devuelve un entero (char)
				vector[i]=(char)cad;//almacenamos el caracter en el vector
				i++;
				if(i==vector.length) break;//detenemos el flujo acia el vector  en su longitud
				
			}while(cad!=(char)'\n');
			leer=new String (vector);//encapsulamos el vector en un string 
									//que devolvemos con el metodo
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return leer;
	}
	
	
	public static String leerconsola2(){
		String leer="";
		BufferedReader br=null;
		br=new BufferedReader (new InputStreamReader (System.in));
		try {
			leer=br.readLine();//leo el estring por consola y ya lo controlo en la llamada al metodo
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return leer;
	}

}


//LLAMADAS************
public class Flujos {
	public static void main(String[] args) {
		Lectura.leerCodigo();
		
		String cad="";
		System.out.println("\n\nalmacenamos en un bufer de caracteres un stream de entradad de caracteres por consola");
		System.out.println("************read();--(char)int");
		System.out.println("leer hasta que apretes 'intro'");
		System.out.println("max. un String 20 caracteres");
		cad=Lectura.leerConsola();
		System.out.println(cad);
		
		System.out.println("************readLine();--String");
		System.out.println("leer hasta que apretes 'intro'");
		cad=Lectura.leerconsola2();
		System.out.println(cad);
		
		System.out.println("************readLine();--String");
		System.out.println("leer hasta que digas 'para'");
		
		do{
			cad=Lectura.leerconsola2();
			if(!cad.equals("para"))
				System.out.println(cad);//imprimes cada una de las lineas
										//siempre y cuando no digas "para";
		}while(!cad.equalsIgnoreCase("para"));
		//nota: no llegaremos a cerrar el flujo
		

		
	}
}
