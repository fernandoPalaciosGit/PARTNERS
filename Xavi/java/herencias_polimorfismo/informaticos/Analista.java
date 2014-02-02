package herencias_polimorfismo.informaticos;

public class Analista extends InformaticoAbs{
	
	/*variables de instancia privadas de la clase que se añadenn al "constructor heredado"*/
	private String especialidad;
	
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad=especialidad;
	}

	/**
	 * proporcion de horas remuneradas
	 */
	public double pagarSueldo(double horas) {
		return horas*12;
	}

}
