
public class Vehiculo {

	String fabricante;
	String mod;
	int ano;
	float consumo;
	String matricula;
	float litros;
	
	public Vehiculo(String fabricante, String mod, int ano, String letras_matr, int num_matr, float consumo, float litros){
		
		this.fabricante = fabricante;
		this.mod = mod;
		this.ano = ano;
		this.consumo = consumo;
		Matricula m= new Matricula(letras_matr,num_matr);
		this.matricula = m.toString();
		this.litros = litros;
	}


	public float autonomia(float litros){
		
		float autonomia = litros / consumo;
		return autonomia;
		
	}
	
}
