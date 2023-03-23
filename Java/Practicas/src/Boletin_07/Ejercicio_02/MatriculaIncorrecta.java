package Boletin_07.Ejercicio_02;

public class MatriculaIncorrecta extends Exception {

	public MatriculaIncorrecta() {
	}

	public MatriculaIncorrecta(String message) {
		super(message);
	}

	public MatriculaIncorrecta(Throwable cause) {
		super(cause);
	}

	public MatriculaIncorrecta(String message, Throwable cause) {
		super(message, cause);
	}

	public MatriculaIncorrecta(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
