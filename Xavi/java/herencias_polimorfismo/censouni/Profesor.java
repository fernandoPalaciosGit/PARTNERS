package herencias_polimorfismo.censouni;

public class Profesor extends Persona{

	private String departamento;
	private double sueldo;
	
	//CONSTRUCTOR
	public Profesor(String dni, String nombre, String apellido1,
			String apellido2, Fecha fechaNac, String direccion, short cp,
			int telefono, String departamento, double sueldo) {
		super(dni, nombre, apellido1, apellido2, fechaNac, direccion, cp, telefono);
		this.departamento=departamento;
		this.sueldo=sueldo;
	}

	/*GETTERS Y SETTERS de variables propias de la clase*/
	public String getDepartamento() {
		return departamento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	/*TO_STRING*/
	public String toString(){
		return super.toString()+"\n# Profesor # - departamento: "+this.departamento+"\t- sueldo: "+this.sueldo;
	}

	
	
	
}
