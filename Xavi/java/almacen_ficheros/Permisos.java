package almacen_ficheros;
import java.io.*;
/**
 *clase que analice si un directoro  existe</br>
 *mostrará si se tiene permiso de lectura y escritura y se listarán los ficheros y directorios que contiene. 
 * @author fernando
 */
public class Permisos {
	public static void main(String[] args) {
		
		
		String root="G:\\";//ruta absoluta del directorio
		File archivo=new File(root); 
		
		//indicamos cual es el directorio/archivo a comprobar
		//NOTA: el indicado DEBE descender directamente de la ruta absoluta de ficheros (root) encapsulada en File
		String dir= "workspace_JAVA";
		System.out.print("Archivo a buscar: "+dir);
		String listadoArchivos[]=archivo.list();//vector todos los directorios y ficheros de la raiz
		
		
			for(int i=0;i<listadoArchivos.length;i++){
				if(listadoArchivos[i].equals(dir)){
					System.out.print("\nEn la ruta "+archivo.getPath()+" se ha encontrado: "+dir);
					
					if(archivo.canRead()){
						System.out.print("; con permisos de lectura");
					}
					if(archivo.canWrite()){
						System.out.println("; y con permisos de escritura");
					}
					
					archivo=new File(root, listadoArchivos[i]);//encapsulamos de nuevo el archivo encontrado
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
						System.out.println("\nNo se ha encontrado el directoio o archivo: "+dir+" en la ruta: "+archivo.getPath());
					}
				}
				}
				}
			}
	

