package acceso_ficheros;
import java.io.*;
public class AccesoAleatorioDemo {
	public static void main(String[] args) throws IOException{
		
		String arch="G:\\secuencia_out.txt";//URI del archivo en disco
		File archivo=new File (arch);
		
		//sacamos fuera del try<proceso> el 'flujo de entrada por teclado (BufferedReader)' para que no se ciere al final del bloque try
		//enonces lo podemos utilizar en cualquier bloque porque sigue abierto
		BufferedReader br=null;
		
		//LEEMOS POR CONSOLA DATOS PRIMITIVOS
		//ESCRIBIMOS DATOS PRIMITIVOS EN ARCHIVO
		try (RandomAccessFile eof=new  RandomAccessFile(archivo,"rw")){
			br=new BufferedReader (new InputStreamReader(System.in));	
			
			System.out.println("Numero de registros de alumnos:");
			int cont=Integer.parseInt(br.readLine());
			for(int i=0;i<cont;i++){
				String nombre="";//almaceno el nombre
				double nota=0.0;//almaceno la nota
				
				//leemos desde consola
				eof.writeInt(i+1);//escribimos
				System.out.println("Nombre: ");
				nombre=br.readLine();
				
				//restringimos el nombre del alumno a 30 caracteres
				int size=30;
				if(nombre.length()>size)
					nombre=nombre.substring(0, size);
				else {
					for(int j=nombre.length();j<size;j++){
						nombre+=" ";
					}
				}
				
				System.out.println("Nota: ");
				nota=Double.parseDouble(br.readLine());
				
				//escribimos en el archivo
				eof.writeUTF(nombre);
				eof.writeDouble(nota);
				
				}
		
				
			}catch(EOFException e){
				e.printStackTrace();
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
		
		
		try(RandomAccessFile eof_read=new  RandomAccessFile(archivo,"r")){
		
			//leemos desde el archivo de manera aleatoria
			String alumno="";
			System.out.println("que linea qieres leer:???");
			long n=Long.parseLong(br.readLine());
			
			
			eof_read.seek( (4+(30+2)+8) * (n-1));//seek(long n)
			
			
			//leemos en la linea (de posion del puntero) lo almacenado por el 'tipo de dato'
			//IMP: deben ir en orden de lectura (dentro de la linea), los literales pueden ser cualquiera
			alumno="posicion: "+eof_read.readInt()+": "+eof_read.readUTF()+": "+eof_read.readDouble();
			System.out.println(alumno);

		}catch(IOException e2){
			e2.printStackTrace();
			
		//acabe como sea el bloque try, este se cerrara, los siguientes intentos de usar el flujo, generaran ERROR	
		}finally{
			try{
				br.close();
				System.out.println("se cierra el flujo");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
			
		
	}
}
