package Boletin_01;

public class Ejercicio_06 {
	public static void main(String[] args) {
		int dia = 22;
		String mes = "MARZO";
		System.out.println(temperatura(mes, dia));
	}

	public static int temperatura(String mes, int dia) {

		int resultado = 19;

		if ((mes.equals("DICIEMBRE") && dia >= 21) || mes.equals("ENERO") || mes.equals("FEBRERO")
				|| (mes.equals("MARZO") && dia <= 20)) {
			resultado = 19;
		} else if ((mes.equals("JUNIO") && dia <= 21) || mes.equals("MAYO") || mes.equals("ABRIL")
				|| (mes.equals("MARZO") && dia > 20)) {
			resultado = 20;
		} else if ((mes.equals("JUNIO") && dia > 21) || mes.equals("JULIO") || mes.equals("AGOSTO")
				|| (mes.equals("SEPTIEMBRE") && dia >= 20)) {
			resultado = 24;
		}

		return resultado;
	}

}
