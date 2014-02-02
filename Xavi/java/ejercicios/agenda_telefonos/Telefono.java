package ejercicios.agenda_telefonos;
import java.io.*;
/** acceso secencial al stream de datos en un archivo */
public class Telefono {
		
		int contactos;
		protected Telefono(int contactos){
			this.contactos=contactos;
		}
		
		/**metodo MENU*/
		protected void menu(){
			System.out.println("Agenda "+contactos+" contactos");
			System.out.println("\t\tInstrucciones");
			System.out.println("\tintroducir nombres y numeros de telefonos para para crear la agenda");
			
		}
		
		
		String arch="evaluacion2.txt";
		File archivo =new File (arch);

		/** metodo STREAM CARACTERES */
		/**Leemos deasde consola*/
		/**Escribimos en el archivo*/
		protected void escribirAgenda(){
			try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dataout = new DataOutputStream
						(new BufferedOutputStream (new FileOutputStream(archivo, true)))) {//vamos a introducir los datos en el archivo DATO*DATO
				boolean telf=false;
				String leer="";
				for(int n=0;n<contactos*2;n++){
					if (!telf) {
						telf=true;
						System.out.println("introduce un nombre");
						leer=br.readLine();
						dataout.writeUTF(leer);
						
					} else {
						try {
							telf=false;
							System.out.println("introduce telefono");
							leer=br.readLine();
							long l=Long.parseLong(leer);
							dataout.writeLong(l);							
						} catch (NumberFormatException e) {
							System.out.println("valor numerico para el telefono");
						}

					}
				}
					
			} catch (FileNotFoundException e) {
				System.out.println("Error, el archivo no se encuentra");
			}catch (IOException e) {
				System.out.println("Error de lectura en consola");
			}	
		}
		
		/**leemos desde archivo
		 * escribimos en consola con PrintWriter*/
		protected void leerAgenda(){
			try(DataInputStream datain=new DataInputStream
					(new BufferedInputStream(new FileInputStream(archivo)));
				PrintWriter pw =new PrintWriter(System.out);){
				
				if(archivo.exists()){
					System.out.println("Agenda de telefonos:");
					while(true){
						String nombre=datain.readUTF();
						long telefono=datain.readLong();
						pw.println(nombre+"-"+telefono);
						
					}
					
				}
				
				
				
			}catch(EOFException e2){
				System.out.println("Error de lectura de archivo");
			}catch(IOException e2){
				System.out.println("Error de escritura en consola");
			}
			
		}
		
		
	}

