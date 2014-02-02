
import java.util.Date;

public class persona {

	//ATRIBUTOS
	String nombre;
	String apellidos;
	String fechaNacimiento;
	//FIN ATRIBUTOS
	
	//GETS Y SETS
	public String getApellidos() {return apellidos;}
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}
	public String getFechaNacimiento() {return fechaNacimiento;}
	public void setFechaNacimiento(String fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
	public persona(String nombre) {this.nombre = nombre;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	//FIN GETS Y SETS
	
	//CONSTRUCTOR
	public persona(String nombre,String apellidos,String fechaNacimiento){	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	//FIN CONSTRUCTOR
	
	
	public String toString() {
		
		return nombre +" "+apellidos+" "+fechaNacimiento;
		
		
	}
	
	
	
	
}
