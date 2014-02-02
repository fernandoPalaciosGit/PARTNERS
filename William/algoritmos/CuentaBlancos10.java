package algoritmos�os_algoritmos;
import java.util.Scanner;

public class CuentaBlancos10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String palabra;
		int contador = 0;

		System.out.println("Ingrese Frase :");
		palabra = teclado.nextLine();

		for (int i = 0; i < palabra.length(); i++) {
			
           		
			if (palabra.charAt(i) ==' ') {

				contador = contador + 1;
			}

		}

		System.out.println("Hay :" +contador+ " espacios en blancos");

	}

}
