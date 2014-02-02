package algoritmos�os_algoritmos;
import java.util.Scanner;

public class CadenaString11 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		String letras;
		
		
		System.out.println("Ingrese 3 letras :");
		letras = teclado.nextLine();
		
		for (int i = 0; i < letras.length(); i++){
			
			if((letras.charAt(i) == '0') || (letras.charAt(i) == '1') ||(letras.charAt(i) =='2')){
				
				if((letras.charAt(i) == '0') || (letras.charAt(i) == '2') ||(letras.charAt(i) =='1')){
				
					if((letras.charAt(i) == '1') || (letras.charAt(i) == '0') ||(letras.charAt(i) =='2')){
						
					}
				}
			}
			
			System.out.println("Las permutaciones son: "+letras);
		}

	}
}
