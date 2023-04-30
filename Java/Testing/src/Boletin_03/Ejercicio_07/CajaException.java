package Boletin_03.Ejercicio_07;

public class CajaException extends Exception {

	public CajaException() {
		super();
	}

	public CajaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CajaException(String message, Throwable cause) {
		super(message, cause);
	}

	public CajaException(String message) {
		super(message);
	}

	public CajaException(Throwable cause) {
		super(cause);
	}

}
