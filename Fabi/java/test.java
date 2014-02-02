

public class test {

	
	public static void main(String[] args) {
		
		
		String fabricante = args[0];
		String mod = args[1];
		int ano = Integer.parseInt(args[2]);
		String letras_matr = args[3];
		int num_matr = Integer.parseInt(args[4]);
		float consumo = Float.parseFloat(args[5]);
		float litros = Float.parseFloat(args[6]);
		
		Vehiculo nuevo = new Vehiculo(fabricante,mod,ano,letras_matr,num_matr,consumo,litros);
	
		
		System.out.println("Fabricante: "+nuevo.fabricante);
		System.out.println("Modelo: "+nuevo.mod);
		System.out.println("A–o: "+nuevo.ano);
		System.out.println("Matricula: "+nuevo.matricula);
		System.out.println("Consumo a los 100km: "+nuevo.consumo);
		System.out.println("Autonomia con "+litros+"L: "+nuevo.autonomia(litros)+" kms");
		
		
	}

}
