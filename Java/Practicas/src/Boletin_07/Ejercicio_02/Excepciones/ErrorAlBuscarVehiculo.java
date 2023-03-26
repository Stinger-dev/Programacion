package Boletin_07.Ejercicio_02.Excepciones;

public class ErrorAlBuscarVehiculo extends Exception {

	public ErrorAlBuscarVehiculo() {
	}

	public ErrorAlBuscarVehiculo(String message) {
		super(message);
	}

	public ErrorAlBuscarVehiculo(Throwable cause) {
		super(cause);
	}

	public ErrorAlBuscarVehiculo(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorAlBuscarVehiculo(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
