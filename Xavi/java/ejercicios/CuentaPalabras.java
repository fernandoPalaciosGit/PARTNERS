package ejercicios;
/**
 * Crea un programa en Java que lea un archivo.txt, </br>
 * cuente las palabras que hay en cada linea del archivo y muestre cada linea.</br>
 * Copia el archivo origen a un archivo destino.
 * @author fernando
 */
import java.io.*;

class Palabras{
	
	/**
	 * metodo que lee las palabras de un archivo 'file_in.txt'</br>
	 * muestra el numero de palabras y la frase de cada linea.
	 * @throws FileNotFoundException 
	 */
	public static void leerArchivo() throws FileNotFoundException{
		String arch_in="file_in.txt";
		File archivo_in=new File(arch_in);

		//usamos flush() en vez de close() para escribir [write()] lo que se lleva en el flujo de salida
		//1- sacamos fuera del try{} la clase output, 2--flush() al final del try{}
		PrintWriter pw=new PrintWriter(System.out);
		BufferedReader br=new BufferedReader(new FileReader(archivo_in));
		
		try{			
			StreamTokenizer token;//clase que lee un objeto de tipo StreamReader
			
			String linea="";
			int contador=1;
			int palabra=0;
			do{
				//leemos linea por linea del fichero
				linea=br.readLine();	
				
				//hay que encapsular el fichero en un StreamTokenizer
				//que reparte en tokens cada linea del fichero
				token=new StreamTokenizer(new StringReader(String.valueOf(linea)));
				
				//se extrae cada uno de los tokens de cada linea con el id de cada tipo (TT_WORD / TT_NUMBER) 
				if(linea!=null){
					pw.write("LINEA "+contador+": ");
					while(token.nextToken() != StreamTokenizer.TT_EOF){
							//ttype ---devuelve el valor leido por el objeto
							//sval ---si el valor devuelto es un string
							//nval ---si el valor devuelto es un numero
							if	(token.ttype == StreamTokenizer.TT_WORD) {
								palabra++;
								pw.write(token.sval);
							}
							
							else if (token.ttype == StreamTokenizer.TT_NUMBER) pw.write(String.valueOf(token.nval));
							pw.write(" ");//cada vez que encuentre un token, espacio
						}
					pw.write("\t\tPALABRAS: "+palabra);
					palabra=0;
					pw.write("\n");//al final de cada linea (TT.EOF), saltamos de linea
					contador++;
					
				}
				
			}while(linea!=null);
			
			}catch(IOException e){
				e.printStackTrace();
			}
		pw.flush();	
		
	}
	
	
	
	
	/**
	 * metodo que copia un numero determinado de lineas</br>
	 * de un fichero de lectura (entrada) a otro de escritura (salida)
	 * @throws FileNotFoundException 
	 */
	public static void copiarArchivo() throws FileNotFoundException{
		String arch_in="file_in.txt";
		File archivo_in=new File(arch_in);

		String arch_out="file_out.txt";
		File archivo_out=new File(arch_out);
		
		
		//ahora ya podemos cerrar los flujos---sin flush()
		try(	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br=new BufferedReader(new FileReader(archivo_in));	
				PrintWriter pw = new PrintWriter (new FileWriter(archivo_out, false)); ){				
		
			String leer="";
			
			System.out.println("\n*******Elige el numero de lineas a copiar en el archivo*******");
			int contador=0;
			int lineas=Integer.parseInt(read.readLine());
			for(int i=0;i<lineas;i++){
				leer=br.readLine();//leemos linea
				if(leer!=null){
					contador++;
					pw.write("\n"+leer);//copiamos linea
					System.out.println(leer);//imprimimos lineas
				}
				if(leer==null){
					System.out.println("\n*******Solo hay "+contador+" lineas copiadas*******");
					break;
				}
			}
		
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
				
}
}

public class CuentaPalabras {
	public static void main(String[] args) throws FileNotFoundException{
		
		Palabras.leerArchivo();
		Palabras.copiarArchivo();
			
	
	}
}
