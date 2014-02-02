package algoritmos�os_algoritmos;
import java.util.Scanner;


public class Multiplo1_10 {

	
	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero:");
		num = teclado.nextInt();
		
		for(int i=1;i <= 10;i++){
			if (num % i == 0){
			System.out.println("El numero  " + num + " entre el 1 al 10 es multiplo  " +i);
				
			}
		}

	}

}
