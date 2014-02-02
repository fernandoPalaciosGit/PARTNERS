package algoritmos�os_algoritmos;
import java.util.Scanner;

public class BinarioDecimal13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String num;
		

		System.out.println("Ingrese un mumero Binario====> escribir 0 y 1:");
		num = teclado.next();
		System.out.println("En Decimal es:\n ");
		
		int resul = Integer.parseInt(num,2);
		
		System.out.println(resul);
		
		
		
		
			}

}
