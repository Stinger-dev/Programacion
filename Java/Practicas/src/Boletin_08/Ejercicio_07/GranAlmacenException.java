package Boletin_08.Ejercicio_07;

public class GranAlmacenException extends Exception {

	public GranAlmacenException() {
		super();
	}

	public GranAlmacenException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GranAlmacenException(String message, Throwable cause) {
		super(message, cause);
	}

	public GranAlmacenException(String message) {
		super(message);
	}

	public GranAlmacenException(Throwable cause) {
		super(cause);
	}

}
