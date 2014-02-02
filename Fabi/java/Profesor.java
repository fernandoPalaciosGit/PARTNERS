

public class Profesor extends persona {

	public String especialidad;
	
	public Profesor(String nombre, String apellidos, String fechaNacimiento,String especialidad) {
		super(nombre, apellidos, fechaNacimiento);
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String toString() {
		
		return nombre+" "+apellidos+" "+fechaNacimiento+" "+especialidad;
		
	}
	
	


}
