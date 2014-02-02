

public class testPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		persona nuevo = new persona("Fabio","Munar Mas","28/04/1990");
		Alumno alumno = new Alumno("Pedro","Nu–ez","21/01/1992","");
		Profesor profesor = new Profesor("Xavi","Gelpi","07/05/1959","Inform‡tica");
		
		//ALUMNO
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellidos());
		System.out.println(alumno.getFechaNacimiento());
		System.out.println(alumno.toString());
		
		//PROFESOR
		System.out.println(profesor.getNombre());
		System.out.println(profesor.getApellidos());
		System.out.println(profesor.getFechaNacimiento());
		System.out.println(profesor.getEspecialidad());
		System.out.println(profesor.toString());
		
	}

}
