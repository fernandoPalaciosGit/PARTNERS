package algoritmos�os_algoritmos;
import java.util.Scanner;

public class SumaVector18 {

	public static void main(String[] args) {

		Scanner  teclado = new Scanner(System.in);
		
		float [] valor1 = new float [2];
		float [] valor2 = new float [2];
		float [] suma = new float [2];
		
		for(int a = 0;a < valor1.length; a++){
			System.out.println("Ingrese valores:");
			valor1[a] = teclado.nextFloat();
			valor2[a] = teclado.nextFloat();
		}
										
		for (int b =0;b < valor2.length ;b++){
			suma[b] = ((valor1[b] + valor2[b]));
			}
		for (int b =0;b < suma.length;b++){
			System.out.println("La suma es:"+suma[b]);
		
	}

	}
}
