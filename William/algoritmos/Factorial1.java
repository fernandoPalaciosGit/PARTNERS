package algoritmos�os_algoritmos;
import java.util.Scanner;


public class Factorial1 {

	
	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		
		int fa;
		int resul=1;
		System.out.println("Ingrese un mumero:");
		fa = teclado.nextInt();
		
       for (int i =1;i <= fa;i++){
			
			resul=resul * i;
		}
System.out.println("El factorial de :" + fa + " es: " +resul);
		
}
		

	}
	
	

