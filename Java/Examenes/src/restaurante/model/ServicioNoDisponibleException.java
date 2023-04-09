package restaurante.model;

public class ServicioNoDisponibleException extends Exception {

	public ServicioNoDisponibleException() {
	}

	public ServicioNoDisponibleException(String message) {
		super(message);
	}

	public ServicioNoDisponibleException(Throwable cause) {
		super(cause);
	}

	public ServicioNoDisponibleException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServicioNoDisponibleException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
