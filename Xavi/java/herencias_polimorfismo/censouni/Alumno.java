package herencias_polimorfismo.censouni;

public class Alumno extends Persona{
	
	private String titulacion;
	private String asignaturas;
	
	public Alumno(String dni, String nombre, String apellido1,
			String apellido2, Fecha fechaNac, String direccion, short cp,
			int telefono, String titulacion, String asignaturas) {
		super(dni, nombre, apellido1, apellido2, fechaNac, direccion, cp, telefono);
		this.titulacion= titulacion;
		this.asignaturas=asignaturas;
	}
	
	/*GETTERS Y SETTERS de variables propias de la clase*/
	public String getTitulacion() {
		return titulacion;
	}

	public String getAsignaturas() {
		return asignaturas;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	/*TO_STRING*/
	public String toString(){
		return super.toString()+"\n# Alumno # - Titulación: "+this.titulacion+"\t- Titulación: "+this.asignaturas;
	}
	
	
	
	
}
