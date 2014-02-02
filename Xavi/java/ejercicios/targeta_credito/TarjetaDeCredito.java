package ejercicios.targeta_credito;

import java.io.*;

public class TarjetaDeCredito {
	
	/*****VARIABLES DE INTANCIA*****/
	private int saldoInicial;
	private int claveUsuario;
	private boolean estadoTargeta;
	private int contador=0;
	
	/*****CONSTRUCTORES*****/
	public TarjetaDeCredito(int saldoInicial, int claveUsuario){
		this.saldoInicial=saldoInicial;
		this.claveUsuario=claveUsuario;
	}

	/*****METODOS*****/
	
	static //sacamos fuera de los metodos, el flujo de entrada por consola 
	BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
	
	//GETTERS SETTERS
	public int getSaldoInicial() {
		return this.saldoInicial;
	}
	public int getClaveUsuario() {
		return this.claveUsuario;
	}
	public boolean getEstadoTargeta(){
		return this.estadoTargeta;
	}
	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public void setClaveUsuario(int claveUsuario) {
		this.claveUsuario = claveUsuario;
	}
	
	
	//ESTADOS DE LA TARGETA 
	public boolean isClose(){//estado habitual
		return false;
	}
	public boolean isOpen(){//si el usuario intruduce la contraseña correcta
		return true;
	}
	public boolean isBlock(){//bloquear la tarjeta si se falla 3 veces consecutivas
		return false;
	}
	
	/**
	 * autentificar la clave de la target</br>
	 * si se llama 3 veces a este metodo, se bloque a la targeta</br>
	 * la clase a de llevar el numero de intentos
	 * @param claveUsuario this.claveUsuario
	 * @return true clave correcta
	 * @return false clave erronea
	 * @throws BlockedCardException targeta bloqueada
	 */
	public boolean checkClaveUsuario (int claveUsuario) throws BlockedCardException, IOException
	{
		
		
		String leer="";
		estadoTargeta=isClose();//hasta que no se verifique el estado de la targeta es falso
		
		//leemos la clave secreta mientras sea != a la clave original y max 3 intentos
		System.out.println("introduzca la clave de targeta");
		do{
			try{
				leer=br.readLine();
				contador++;
				if(Integer.parseInt(leer)==claveUsuario){
					estadoTargeta=isOpen();
					System.out.println("TARGETA ABIERTA");
					break;
				}
				if(contador==3) {
					estadoTargeta=isClose();
					System.out.println("DEMASIADOS INTENTOS");
					System.out.println("TARGETA CERRADA");
					break;
				}
				System.out.println("INCORRECTO, intento "+(contador+1));
					
				//quiero controlar los intentos en caso de que salte 
			}catch (NumberFormatException e) {
				//si salta la excepcion por equivocarnos de contraseña, controlamos el numero de accesos
				if(contador<3){
					System.out.print("INCORRECTO, clave de 4 digitos numericos");
					System.out.println(", intento "+(contador+1));
				}
				if(contador==3) {
					//no necesito cerrar la targeta porque ya esta cerrada desde el principIo
					System.out.println("DEMASIADOS INTENTOS");
					System.out.println("TARGETA CERRADA");
				}

			}
			
		}while(contador<3 && Integer.parseInt(leer)!=claveUsuario) ;
		return estadoTargeta;
	}
	
	/**
	 * cerrar programa de targeta de credito
	 */
	public void cerrar(){
		System.out.println("Saliendo del programa....");
		System.exit(0);
	}
	
	
	/**
	 * extraer dinero de la cuenta</br>
	 * primero autentificar targeta
	 * @param cantidad a extraer
	 * @return saldo de la cuenta que resta
	 * @throws InsufficientBalanceException saldo insuficiente
	 * @throws BlockedCardException targeta bloqueada
	 */
	public int extraerDinero(int cantidad) throws BlockedCardException, InsufficientBalanceException 
	{
		
		if (getEstadoTargeta()==isClose()) throw new BlockedCardException();
		else if (getEstadoTargeta()==isOpen() && cantidad<getSaldoInicial()){//primero autentificamos
			setSaldoInicial(getSaldoInicial()-cantidad);//modificamos el saldo
			System.out.println("El saldo actual es: "+getSaldoInicial());
		}
		else if (cantidad>=getSaldoInicial()) throw new InsufficientBalanceException();
		
		return getSaldoInicial();
	}
	
	/**********************************PROBAR LA TARGETA DE CREDITO**********************************/
	/*public static void main(String[] args) throws BlockedCardException, IOException{
		//datos de usuario
		TarjetaDeCredito user = new TarjetaDeCredito(5000, 4316);
		
		//acceder a la cuenta
		boolean control = false;
		do {
			control = false;
			try {
				user.checkClaveUsuario(user.getClaveUsuario());
			} catch (NumberFormatException e) {//siempre que salte la excepcion repetiré el bucle
				control = true;
			}
		} while (control);
		
		
		//comprobar estado de la targeta
		if(user.getEstadoTargeta()==user.isClose()){
			System.out.print("el estado de la targeta es: ");
			System.out.println(user.getEstadoTargeta());	
			user.cerrar();
		}
		if(user.getEstadoTargeta()==user.isOpen()){
			System.out.print("el estado de la targeta es: ");
			System.out.println(user.getEstadoTargeta());	
		}
		
		// extraer cantidad del saldo
		try {
			System.out.println("introduce cantidad a extraer");
			user.extraerDinero(Integer.parseInt(br.readLine()));
		} catch (InsufficientBalanceException e) {
			
		}

	}
	*/
	
}
