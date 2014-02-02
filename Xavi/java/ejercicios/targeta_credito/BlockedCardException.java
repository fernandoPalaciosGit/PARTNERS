package ejercicios.targeta_credito;

public class BlockedCardException extends Exception {
	
	//constructor sobreccargado
	public BlockedCardException(){
		super("Targeta bloqueada");//getMessage();
		System.out.println("Targeta bloqueada");
	}
	
	public BlockedCardException(String mensaje){
		System.out.println(mensaje);
	}
	
}
