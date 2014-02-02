package algoritmos�os_algoritmos;
import java.util.Scanner;


public class Mayuscula8 {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabra;

		System.out.println("Ingrese Palabra :");
		palabra = teclado.nextLine();
		
		System.out.println("La convierte toda en Mayuscula====>    " +palabra.toUpperCase());

	}

}
