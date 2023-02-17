package Mock_Exam;

public class Ejercicio_03 {

	public static void main(String[] args) {
		System.out.println(getNota("mi", true));
	}

	public static float getNota(String nota, Boolean sostenido) {
		nota = nota.toUpperCase();
		float resultado = 0.0f;

		switch (nota) {
		case "DO":
			resultado = 523.25f;
			break;

		case "RE":
			resultado = 587.33f;
			break;

		case "MI":
			resultado = 659.26f;
			break;

		case "FA":
			resultado = 698.46f;
			break;

		case "SOL":
			resultado = 783.99f;
			break;

		case "LA":
			resultado = 880f;
			break;

		case "SI":
			resultado = 987.77f;
			break;

		default:

			break;
		}

		if (sostenido)
			resultado = resultado * 1.03f;

		return resultado;
	}

}
