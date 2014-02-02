package almacen_ficheros;
import java.io.*;

public class DirParam {
	
	/**
	 * metodo al que le pasamos como  parametro el direcdtorio o archivo </br>
	 * empezaremos a buscar dentro del conteniido de la raiz (particion) de un disco duro
	 * @param leer directorio o archivo que buscamos desde la raiz del disco
	 */
	static void showDir(String leer){
	String root="G:\\";//ROOT
	File archivo=new File(root);//encapsulas el root	
	String listadoArchivos[]=archivo.list();//recorremos los archivos y directorios del root

		for(int i=0;i<listadoArchivos.length;i++){
			if(listadoArchivos[i].equals(leer)){
				System.out.print("\nEn la ruta "+archivo.getPath()+" se ha encontrado: "+leer);
				
				archivo=new File(root, listadoArchivos[i]);//encapsulamos el archivo/directorio encontrado
				System.out.println("\nRUTA ABSOLUTA: "+archivo.getAbsolutePath());
				listadoArchivos=archivo.list();
				
				System.out.println("DIRECTORIOS/ARCHIVOS");
				for(int j=0;j<listadoArchivos.length;j++){
					System.out.println("\t\t"+listadoArchivos[j]);
				}
				break;				
			}
			else {
				//si es el ultimo directorio sin encontrar
				if(listadoArchivos[i]==listadoArchivos[listadoArchivos.length-1]){
					System.out.println("No se ha encontrado el directoio o archivo: "+leer+" en la ruta: "+archivo.getPath());
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		try(BufferedReader br=new BufferedReader (new InputStreamReader(System.in))){
			System.out.println("indica el directorio");
			String leer=br.readLine();
			DirParam.showDir(leer);
		}
		
	}
}
