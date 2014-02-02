package ejercicios.agenda_telefonos;
import java.io.*;
public class AgendaDemo {
	public static void main(String[] args) throws IOException{
		System.out.println("intoduce el numero de contactos de tu agenda");
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		Telefono tel=new Telefono(Integer.parseInt(br.readLine()));
		tel.menu();
		
		/*NOTA: el metodo escribirAgenda() utiliza la clase DataOutputStream
		 * utiliza un flujo de salida (escribe) de valores primitivos*/
		tel.escribirAgenda();
		tel.leerAgenda();

	}
}
