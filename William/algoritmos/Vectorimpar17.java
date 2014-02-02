package algoritmos�os_algoritmos;
public class Vectorimpar17 {

	
	public static void main(String[] args) {
	
		int[] numeros;
		numeros = new int[100];
		
		 int num =1;
		for (int i = 0; i <numeros.length; i++) {
			numeros[i]= num ;
			num++;
		}
		
		for(int i=numeros.length-1; i>=0; i--){
			
			if((numeros[i]%2)!=0)
				System.out.print(numeros[i]+" ");
		}
		
		
		
			}
	}


