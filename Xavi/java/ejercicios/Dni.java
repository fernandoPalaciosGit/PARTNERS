package ejercicios;

import java.io.*;
public class Dni {
	/**
	 * numDNI: sin la letra</br>
	 * el numero del DNI se calculará
	 */
	private int numDNI;

	public Dni() {
		this.numDNI=43167787;//mi dni
	}

	public Dni(int numDNI){
		this.numDNI=numDNI;
	}
	


	//get / set this.numDNI
	public int obtenerDNI(){
		return this.numDNI;
	}
	
	public void establecer(int numDNI) throws ErrorDNI{
		this.numDNI=numDNI;
	}
	
	//get NIF (numDNI con numero) a partir de this.numDNI
	public String obtenerNIF(){
		String numNIF = this.numDNI+""+Dni.calcularLetraNIF(this.numDNI);//le añadimos la letra calculada en calcularLetraNIF()
		return numNIF;
	}
	
	//set numDNI a partir del NIF
	public void establecer(String NIF) throws ErrorDNI{
		this.numDNI=Integer.parseInt(NIF.substring(0,7));//extraigo el valor numerico del dni (los primeros 8 digitos)
		
	}

	
	//calcular la letra de un dni
	private static char calcularLetraNIF(int numDNI){
		
		String letras="TRWAGMYFPDXBNJZSQVHLCKET";//codigo oficial de letras dni
		int formateoDNI = numDNI % 23;//formateammos el argumento xa sacar la letra
		char letraDNI = letras.charAt(formateoDNI);//letra del dni
		
		return letraDNI;
	}
	
	//comprobar si un NIF (dni con su letra) es valido
	private boolean validarNIF(String NIF){
		char letra_NIF= NIF.charAt(8);//letra del NIF pasado por argumento
		
		String DNI=NIF.substring(0, 8);//numero del NIF pasado por argumento
		char OKletra_NIF=calcularLetraNIF(Integer.parseInt(DNI));//letra del NIF calculada		
		
		if (letra_NIF==OKletra_NIF && DNI.length()==8) return true;
		else return false;
	}
	
	//pasar como argumento el dni con el numero
	//y extraer la letra del dni
	private static char extraerLetraNIF(String NIF){
		NIF=NIF.substring(8);//extraigo la letra
		char arr[] = NIF.toCharArray();//la meto en un vector unidimenisonal
		char letra = arr[0];
		return letra;
		/**
		 * return NIF.chatAt(8);
		 */
	}
	
	//pasas como argumento una cadena que contiene el dni con el numero: "mi dni es 43167787F"
	//extraer el dni con el numero (NIF)
	private static String extraerNumeroNIF(String cadenaNIF){
		String dni = "";
		for(int i =0;i<cadenaNIF.length();i++){
			//comprobamos si en la cadena hay digitos numericos, y los añadimos al dni
			if (Character.isDigit(cadenaNIF.charAt(i))) dni=dni+""+cadenaNIF.charAt(i);
		}
		
		//calculo la letra del dni
		char letra_dni=calcularLetraNIF(Integer.parseInt(dni));
		String NIF=dni+""+letra_dni;
		return NIF;
	}
	
	/**********************************PROBAR EL DNI**********************************/
	/*public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader (new InputStreamReader(System.in))){
			
			//calcularLetraNIF(int dni)
			System.out.println("introduce un dni. 8 digitos numericos");
			String dni=br.readLine();
			dni=dni.substring(0, 8);//para eliminar la letra
			
			System.out.println("El dni es: "+dni);
			System.out.println("La letra del dni es: "+calcularLetraNIF(Integer.parseInt(dni)));
			
			//validarNIF(String NIF)
			System.out.println("ahora introduce un dni con la letra: ");
			dni=br.readLine();
			Dni obj = new Dni() ;
			if(obj.validarNIF(dni))System.out.println("dni correcto: "+dni);
			else System.out.println("dni incorrecto");
			
			//extraerLetraNIF(String NIF)
			System.out.println("ahora introduce un dni con la letra: ");
			dni=br.readLine();
			System.out.println("letra: "+Dni.extraerLetraNIF(dni));
					
			//extraerNumeroNIF(String cadenaNIF)
			System.out.println("introduce una frase que contenga tu dni");
			String cadena_dni=br.readLine();
			System.out.println("el dni en la frase es: "+Dni.extraerNumeroNIF(cadena_dni));
			
		} catch (Exception e) {
			System.out.println("Dni inaccesible");
		} 
			
	}
	*/
	
}

class ErrorDNI extends Exception{
	public ErrorDNI(){
		super("DNI inaccesible");
	}
}
