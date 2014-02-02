package algoritmos�os_algoritmos;
import java.util.Scanner;

public class Permutacionesabc11 {

	public static void Permuta(String s) {
		// Iniciamos este array auxiliar para
		// marcar los caracteres que ya combinamos
		boolean[] marcas = new boolean[s.length()];
		// Llamamos al m�todo recursivo
		System.out.println("La permutacion es:");
		Permuta(s, "", marcas);
	}

	static void Permuta(String original, String permutacion, boolean[] marcas) {
		// Imprimimos la combinaci�n si ya cambiamos
		// todas las letras una vez
		if (original.length() == permutacion.length())
			System.out.println("\t"+permutacion);

		for (int i = 0; i < marcas.length; i++) {
			// Vemos si est� marcada para no volverla a permutar
			if (marcas[i]==false) {
				// Marcamos el caracter que vamos a permutar
				marcas[i] = true;
				// Invocamos al metodo recursivo a�adiendo
				// un caracter al string que permutamos
				Permuta(original, permutacion + original.charAt(i), marcas);
				// Desmarcamos el caracter para poder usarlo
				// en otras combinaciones
				marcas[i] = false;
			}
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese por teclado la cadena");
		Permuta(teclado.nextLine());
		
	}

}
