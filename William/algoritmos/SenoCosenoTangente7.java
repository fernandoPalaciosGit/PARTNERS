package algoritmos�os_algoritmos;
import java.util.Scanner;


public class SenoCosenoTangente7 {

	
	public static void main(String[] args) {
	
		 Scanner teclado = new Scanner(System.in);
		 
		 
		 double valor;
		 
		 System.out.println("Ingrese angulo: ");
		 valor=teclado.nextDouble();
		
		 double anguloRadianes = Math.toRadians(valor);
		 
		 valor = Math.sin(anguloRadianes);
		 System.out.println("EL SENO ES  = " + valor);
		 
		 
		 valor = Math.cos(anguloRadianes);
		 System.out.println("EL COSENO ES = " + valor);
		 
		 valor = Math.tan(anguloRadianes);
		 System.out.println("LA TANGENTE ES = " + valor);

		 
		 
	}

}
