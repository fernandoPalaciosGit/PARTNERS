

public class Alumno extends persona {

	String curso;
	
	public Alumno(String nombre, String apellidos, String fechaNacimiento,String curso) {
		super(nombre, apellidos, fechaNacimiento);
	}
	//FIN ATRIBUTOS
	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
