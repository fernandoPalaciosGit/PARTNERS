package herencias_polimorfismo.informaticos;

/*todos los CONSTRUCTORES de una clase abstracta DEBEN ser reemplazados por clas clases que heredan de el*/
public abstract class InformaticoAbs {
	//VARIABLES de instancias
	private String empresa;
	private double sueldo;
	
	//el constructor solo inicializa el nom_empresa
	public InformaticoAbs(String empresa){
		this.empresa=empresa;
	}
	
	//METODOS a reemplazar
	/*getters*/
	public String getEmpresa(){
		return this.empresa;
	}
	public double getSueldo(){
		return this.sueldo;
	}
	
	/*setters*/
	public void setEmpresa(String empresa){
		this.empresa=empresa;
	}
	public void setSueldo(double sueldo){
		this.sueldo=sueldo;
	}

	/*metodo abstracto DEBE SER REEMPLAZADO y COMPLEMENTADO por cada  clase de herencia*/
	/**
	 * devuelve el sueldo para despues poder establecer el sueldo (argumento del setSueldo).
	 * @param horas horario laboral del empleado</br>
	 * @return sueldo que corresponde a cada trabajador enn funcion de su actividad (Analista o programador) 
	 */
	public abstract double pagarSueldo(double horas);//metodo sin cuerpo
	

}
