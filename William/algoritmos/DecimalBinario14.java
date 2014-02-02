package algoritmos�os_algoritmos;
import java.util.Scanner;

public class DecimalBinario14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num, coc = 0, res, i = 0;
		int[] vect = new int[32];

		System.out.println("Ingrese un mumero en decimal:");
		num = teclado.nextInt();
		System.out.println("El numero Binario es:\n ");

		if (num < 2) {
			System.out.println(num);
		} else {
			while (num >= 2) {
				coc = num / 2;
				res = num % 2;
				num = coc;
				vect[i] = res;
				i++;
			}
			System.out.print(coc);
			i--;
		}
		while (i >= 0) {
			System.out.print(vect[i]);
			i--;
		}
		System.out.println("");
	}

}
