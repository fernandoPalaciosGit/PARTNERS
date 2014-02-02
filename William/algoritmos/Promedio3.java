package algoritmos�os_algoritmos;
import java.util.Scanner;

public class Promedio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador=0;
		double promedio;
		int resul = 0;
		int num;

		

		do {

			System.out.println("Ingrese tantos numeros hasta teclear 0");
			num = teclado.nextInt();
			contador = contador +1;
			resul = resul + num;
			if (num == 0) {
												
				promedio = (double)resul/(contador -1);
                 
				System.out.println("El promedio es  " +promedio);

			}
		} while(num != 0);

	}

}
