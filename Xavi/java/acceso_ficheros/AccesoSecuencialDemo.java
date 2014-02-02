package acceso_ficheros;
import java.io.*;
/** acceso secuencial al stream de datos */
public class AccesoSecuencialDemo {
	public static void main(String[] args) {
		
		/** STREAM CARACTERES */
		/**Leemos deasde consola*/
		/**Escribimos en el archivo*/
		try (BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new FileWriter("secuencia_out.txt", false));	){
			String alumno ="";
			double nota=0.0;
			
			//contabilizamos 4 alumnos
			int n=0;
			for(n=0;n<4;n++){
				System.out.print("nombre: ");
				alumno=br.readLine();
				System.out.print("nota: ");
				nota=Double.parseDouble(br.readLine());//lo que leemos por teclado es un flujo de caracteres,
														// y debemos cambiar la variable de String-->double
				/**Escribimos en el archivo cada variable*/
				
				pw.println(n+" "+alumno+" "+nota);
			}
			System.out.println("numero de alumnos: "+n);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("no se encuentra el archivo de salida");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error al interpretar los datos del flujo de entrada o salida");
		}
		
		
		/**STREAM CARACTERES*/
		/**leemos desde el archivo*/
		String readFile="";
		System.out.println("\n\nLeer las dos primeras lineas del archivo");
		try (BufferedReader br =new BufferedReader (new FileReader("secuencia_out.txt"))){
			
			//contabililzamos 2 alumnos
			for(int n=0;n<2;n++){
				readFile=br.readLine();
				System.out.println(readFile);
			}
		
		} catch (IOException e2) {
			e2.printStackTrace();	
		}
	}
}
