package algoritmos�os_algoritmos;
import java.util.Scanner;


public class PalabrasIguales6 {

	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		String palabra;
		String palabra2;
		

		System.out.println("Ingrese Palabra :");
		palabra = teclado.nextLine();
		
		System.out.println("Ingrese Palabra2 :");
		palabra2 = teclado.nextLine();
		
		
		int result = palabra.compareTo( palabra2 );
	      		
	      if(result ==0){
	    	  
	    	  System.out.println("Son iguales");
	    	  
	      }else{
	    	  System.out.println("No son iguales");
	      }

	}

}
