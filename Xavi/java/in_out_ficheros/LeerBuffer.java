package in_out_ficheros;

import java.io.*;

public class LeerBuffer {
	public static void main(String[] args) {
		
		//FICHERO: objeto de la clase File
		String arch="file_in.txt";
		File archivo=new File(arch);

		BufferedInputStream br = null;
		try{
		//LEER DESDE FICHERO
		/**A traves de un buffer que almacena un stream (flujo) de bytes
		 * BufferedInputStream br = new BufferedInputStream (new FileInputStream (archivo));*/
			
		/**A traves de un buffer que almacena un stream (flujo) de caracteres
		 * BufferedReader br=new BufferedReader(new FileReader(archivo)); */
		
		br = new BufferedInputStream (new FileInputStream (archivo));
		int tamaño=br.available();
		System.out.println("Lectura de 50bytes del fichero, pero...");
		System.out.println("Tama�o del fichero: "+tamaño+" bytes");
		
		//LEEMOS 50 BYTES DESDE EL FICHERO
		int size=50;
		byte array[]=new byte[size];
		/**
		 * read(), llena su argumento con un array de bytes que llenara leyendo los bytes desde el flujo
		 * devuelve el numero de bnytes que ha leido el flujo
		 */
		br.read(array);
		System.out.println("*****");
		System.out.println(new String(array, 0, size));
		System.out.println("*****");
		/**
		 * el costructor de la clase String crea un string a partir de los buytes del flujo
		 */
		
		for(int i=0;i<array.length;i++){
			br.read(array);
			if(array[i]==0) {
				System.out.println("indice de final de lectura "+i);
				break;
			}
		}
		
		byte array2[]={array[35]};
		System.out.println("el ultimo byte de lectura del fichero es: "+new String(array2, 0, 1));
		
		
		
		
		}catch(IOException e){
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("el indice leido excede de la longitud del array");
			System.out.println(e.getMessage());
		}finally{
			try {
				br.close();
				System.out.println("flujo de bytes cerrado");
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}
}
