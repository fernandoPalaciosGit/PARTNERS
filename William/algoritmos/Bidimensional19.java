package algoritmos�os_algoritmos;
import java.util.Scanner;


public class Bidimensional19 {

	
	public static void main(String[] args) {
	
		
		Scanner  teclado = new Scanner(System.in);
		
		
		int[][] numeros = new int[5][5];
		
		int[] promedios = new int[5];
		int aux=0;
		
		for(int a = 0;a < numeros.length; a++){
			for (int i = 0; i < numeros[a].length; i++) {
				
			
			System.out.println("Ingrese :");
			System.out.println("matriz ["+a+"]["+i+"] = ");
			numeros[a][i] = teclado.nextInt();
						}
		}
		for(int b= 0;b < numeros.length;b++){
			
			for( int c=0;c < numeros.length;c++){
				aux+=numeros[b][c];
			}
			promedios[b]=aux/numeros[b].length;
			aux=0;
		}

		for(int a=0;a < promedios.length;a++){
			
			System.out.println("El promedio es :\n "+promedios[a]);
		}
	}

}
