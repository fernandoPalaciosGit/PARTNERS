


import java.util.ArrayList;
import java.awt.List;
import java.util.Iterator;

public class Principal {
	
	static ArrayList<persona>alumnos = new ArrayList<persona>();
	static ArrayList<persona>profesores = new ArrayList<persona>();

	public void introducirDatos(){
		
		Alumno fabio = new Alumno("Fabio", "Munar Mas", "28/04/1990","DAW");
		Alumno pedro = new Alumno("Pedro", "Gonzalez Mas", "08/12/1992","DAW");
		Alumno estefi = new Alumno("Estefi", "Espino Castillo", "12/10/1992","DAW");
		
		Profesor xavi = new Profesor("Xavi","Nolo Se","10/05/1959","Programaci—n");
		Profesor david = new Profesor("David","Gelpi Coru–a","13/07/1980","Lenguajes");
		Profesor miquel = new Profesor("Miquel","Nolo Se","10/05/1959","BBDD");
		
		alumnos.add(fabio);
		alumnos.add(pedro);
		alumnos.add(estefi);
		
		profesores.add(miquel);
		profesores.add(david);
		profesores.add(xavi);

	}
	
	
	private void imrpimir(){
	
		persona p = new persona("Fabio","Lunas Menos","29/10/1990");
		System.out.println(p.toString());
	
	}
	
	public void mostrarDatos(){
		
		Iterator<persona> it1 = profesores.iterator();
		Iterator<persona> it2 = alumnos.iterator();
		System.out.println("********************************");
		System.out.println("Profesores...");
		while (it1.hasNext()){
			System.out.println(((persona)it1.next()).toString());
		}
		
		
		System.out.println("********************************");
		System.out.println("Alumnos...");
		while (it2.hasNext()){
			System.out.println(((persona)it2.next()).toString());
		}
		
	}


	public static void main(String[] args) {
	
		Principal si = new Principal();
		si.introducirDatos();
		si.mostrarDatos();
		System.out.println("**********************");
		si.imrpimir();	
	
		
	}

}
