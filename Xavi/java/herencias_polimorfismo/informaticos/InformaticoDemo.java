package herencias_polimorfismo.informaticos;

public class InformaticoDemo {
	public static void main(String[] args) {
		/*creamos una referencia de la superclase y 
		 * creamos objetos de las clases que heredan*/
		InformaticoAbs friki1=new Analista("IBM", "Base de Datos, DBA");
		InformaticoAbs friki2=new Programador("Fernando Placios", "Java");
		
		//sueldos de cada empleado f/ de su actividad mpresarial
		friki1.setSueldo(friki1.pagarSueldo(160));
		friki2.setSueldo(friki2.pagarSueldo(180));
		
		System.out.println("Sueldo del Analista: "+friki1.getSueldo());
		System.out.println("Sueldo del Analista: "+friki2.getSueldo());
		
		
	}
}
