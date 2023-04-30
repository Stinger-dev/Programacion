package Boletin_03.Ejercicio_06;

public class Main {

	public static void main(String[] args) {
		Palabra pala = new Palabra("pasa");
		pala.addSignificado("que a sucedido algo");
		System.out.println(pala.toString());
		Diccionario dicc = new Diccionario("Diccionaripo");
		dicc.addPalabra("Coche", "brumbrum");
		dicc.addPalabra("pistola", "bumbum");
		dicc.addPalabra("Joseju", "me debe 10€ de polen");
		dicc.addPalabra("gato", "miau");

		System.out.println(dicc.buscarSignificadosPalabra("joseju"));

	}
}
