package algoritmos�os_algoritmos;
import java.util.Scanner;

public class Leer2numeros5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1;
		int cuadrado =0;
		int num2;
		int cuadrado2 =0;
		String cadena;
		String cadena2;

		System.out.println("Ingresa primer numero: ");
		num1 = teclado.nextInt();

		System.out.println("Ingresa segundo numero: ");
		num2 = teclado.nextInt();

		cadena = Integer.toString(num1);
		cadena2 = Integer.toString(num2);
		if (cadena.charAt(cadena.length() - 1) != '9'
				&& cadena2.charAt(cadena2.length() - 1) != '9') {
			cuadrado = num1 * num1;
			cuadrado2 = num2 * num2;
		}
		System.out.println(cuadrado);
		System.out.println(cuadrado2);
		
		
		

	}

}
