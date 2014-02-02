package algoritmos;
public class ArrayInverso16 {

	public static void main(String[] args) {

		

		char[] abecedario;
		abecedario = new char[26];
		for (int i = 0; i < 26; i++) {
			abecedario[i] = (char) ('A' + i);
		}
			String cadenainvertida = "";

		
			System.out.println("Invertida es :\n" + cadenainvertida);
			for (int j = abecedario.length-1; j >= 0; j--) {
				
				if(abecedario[j] % 2 ==0)
				
				System.out.print(abecedario[j]+" ");
			}
		}
	
}
