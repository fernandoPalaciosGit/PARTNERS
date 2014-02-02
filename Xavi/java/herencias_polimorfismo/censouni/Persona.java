package herencias_polimorfismo.censouni;

import java.io.*;

import javax.xml.transform.OutputKeys;


public class Persona {
	/*variables de instancia s privadas*/
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Fecha fechaNac;
	private String direccion;
	private short cp;
	private int telefono;/*sera necesario crear un metodo que lo valide*/
	
	/*constructor, inicializar todas las variables*/
	
	public Persona(String dni, String nombre, String apellido1,
			String apellido2, Fecha fechaNac, String direccion, short cp,
			int telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.cp = cp;
		this.telefono = telefono;
	}

	/*getters y setters*/
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public short getCp() {
		return cp;
	}

	public void setCp(short cp) {
		this.cp = cp;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", fechaNac="
				+ fechaNac + ", direccion=" + direccion + ", cp=" + cp
				+ ", telefono=" + telefono + "]";
	}
	
	
	/*validar telefono*/
	public boolean OKtelefono(int telf) throws telefonoErroneo{
		String str_telf=String.valueOf(telf);//pasar de int --> string
		
		if (str_telf.startsWith("981") || str_telf.startsWith("945")
				|| str_telf.startsWith("967") || str_telf.startsWith("96")
				|| str_telf.startsWith("924") || str_telf.startsWith("971")
				|| str_telf.startsWith("927") || str_telf.startsWith("956")
				|| str_telf.startsWith("942") || str_telf.startsWith("964")
				|| str_telf.startsWith("972") || str_telf.startsWith("958")
				|| str_telf.startsWith("959") || str_telf.startsWith("950")
				|| str_telf.startsWith("98") || str_telf.startsWith("920")
				|| str_telf.startsWith("93") || str_telf.startsWith("947")
				|| str_telf.startsWith("956") || str_telf.startsWith("926")
				|| str_telf.startsWith("957") || str_telf.startsWith("969")
				|| str_telf.startsWith("949") || str_telf.startsWith("943")
				|| str_telf.startsWith("974") || str_telf.startsWith("953")
				|| str_telf.startsWith("941") || str_telf.startsWith("928")
				|| str_telf.startsWith("987") || str_telf.startsWith("91")
				|| str_telf.startsWith("95") || str_telf.startsWith("948")
				|| str_telf.startsWith("988") || str_telf.startsWith("979")
				|| str_telf.startsWith("923") || str_telf.startsWith("922")
				|| str_telf.startsWith("921") || str_telf.startsWith("977")
				|| str_telf.startsWith("978") || str_telf.startsWith("96")
				|| str_telf.startsWith("973") || str_telf.startsWith("982")
				|| str_telf.startsWith("95") || str_telf.startsWith("968")
				|| str_telf.startsWith("986") || str_telf.startsWith("95")
				|| str_telf.startsWith("975") || str_telf.startsWith("925")
				|| str_telf.startsWith("94") || str_telf.startsWith("980")
				|| str_telf.startsWith("976") && str_telf.length()==9) return true;
		
		else throw new telefonoErroneo();
	}
	
	/**********************************PROBAR TELEFONOS**********************************/
	/*public Persona(int telefono){
		this.telefono= telefono;
	}

	
	public static void main(String[] args) throws telefonoErroneo {
		try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in))){
			System.out.println("introduzca telefono a comprobar");
			
			Persona obj = new Persona(Integer.parseInt(br.readLine()));
			
			boolean comp = obj.OKtelefono(obj.getTelefono());
			
			if (comp) System.out.println("telefono fijo correcto");
			
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	*/
	
}

	class telefonoErroneo extends Exception{
		public telefonoErroneo(){
			super("El telefono fijo provincial no corresponde con la enumeracion española, no se admiten numeros moviles");
		}
	}
