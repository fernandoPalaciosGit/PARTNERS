package algoritmos�os_algoritmos;
import java.util.Scanner;


public class CadenaInvertida12 {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		String cadenainvertida ="";

		System.out.println("Ingrese Frase :");
		frase = teclado.nextLine();
		
		for (int x=frase.length()-1;x>=0;x--)
			cadenainvertida = cadenainvertida + frase.charAt(x);
		
		System.out.println("La frase invertida es :\n" +cadenainvertida);


	}
	


}
