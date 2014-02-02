package ejercicios.targeta_credito;

public class InsufficientBalanceException extends Exception {

	// constructor sobrecargado
	public InsufficientBalanceException() {
		super("Targeta bloqueada");//getMessage();
		System.out.println("Saldo Insuficiente");
	}

	public InsufficientBalanceException(String mensaje) {
		System.out.println(mensaje);
	}

}
