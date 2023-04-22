package Boletin_08.Ejercicio_08;

public class ExceptionEquipo extends Exception {

	public ExceptionEquipo() {
	}

	public ExceptionEquipo(String message) {
		super(message);
	}

	public ExceptionEquipo(Throwable cause) {
		super(cause);
	}

	public ExceptionEquipo(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionEquipo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
