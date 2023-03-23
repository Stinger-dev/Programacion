package Boletin_07.Ejercicio_01;

public class ValorNoVAlido extends Exception {

	public ValorNoVAlido() {
	}

	public ValorNoVAlido(String message) {
		super(message);
	}

	public ValorNoVAlido(Throwable cause) {
		super(cause);
	}

	public ValorNoVAlido(String message, Throwable cause) {
		super(message, cause);
	}

	public ValorNoVAlido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
