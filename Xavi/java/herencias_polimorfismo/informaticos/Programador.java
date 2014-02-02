package herencias_polimorfismo.informaticos;

public class Programador extends InformaticoAbs{
	
	private String lenguaje;
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje=lenguaje;
	}

	
	
	/**
	 * proporcion de horas remuneradas
	 */
	public double pagarSueldo(double horas) {
		return horas*6;
	}

}
