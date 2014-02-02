
import java.util.Scanner;

public class VectoresNotaMedia {


	private float[] nota1;
	private float[] nota2;
	
	public void cargarNotas() {
		
		Scanner leer = new Scanner (System.in);
		
		nota1= new float[6];
		nota2 = new float[6];

		for (int i=0;i<nota1.length;i++) {
			System.out.println("Introduza nota1["+i+"]");
			nota1[i] = leer.nextFloat();
		}
		
		
		for (int i=0;i<nota2.length;i++) {
			System.out.println("Introduza nota2["+i+"]");
			nota2[i] = leer.nextFloat();
		}
		
		leer.close();
	}
	
	public void imprimirNotas(){
		
		for (int i=0;i<nota1.length;i++) {
			
			float media = ((nota1[i]+nota2[i])/2);
			float suma = (nota1[i]+nota2[i]);
			
			System.out.println("NOTAS: ["+i+"] = "+nota1[i]+" / ["+i+"] = "+nota2[i]+" ***SUMA: ["+suma+"] *** MEDIA: ["+media+"]");
			
		}
		
	}
	
	public static void main(String[] args) {

		VectoresNotaMedia nuevo = new VectoresNotaMedia();
		
		nuevo.cargarNotas();
		nuevo.imprimirNotas();
		
	}

}
