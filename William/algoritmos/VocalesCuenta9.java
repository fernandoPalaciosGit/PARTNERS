package algoritmos�os_algoritmos;
import java.util.Scanner;

public class VocalesCuenta9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String vocal;

		System.out.println("Ingrese Palabra :");
		vocal = teclado.nextLine();

		int contador = 0;
		for (int x = 0; x < vocal.length(); x++) {
			if ((Character.toLowerCase(vocal.charAt(x)) == 'a')
					|| (Character.toLowerCase(vocal.charAt(x)) == 'e')
					|| (Character.toLowerCase(vocal.charAt(x)) == 'i')
					|| (Character.toLowerCase(vocal.charAt(x)) == 'o')
					|| (Character.toLowerCase(vocal.charAt(x)) == 'u')) {
				contador =contador + 1;
			}
		}

		System.out.println( " Contiene: " + contador + " vocales");
	}

}
