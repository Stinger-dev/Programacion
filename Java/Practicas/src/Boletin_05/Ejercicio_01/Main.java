package Boletin_05.Ejercicio_01;

public class Main {
	public static void main(String[] args) {
		Linea ob1 = new Linea();
		Linea ob2 = new Linea();
		ob1.moverAbajo(10.0);
		ob2.moverAbajo(10.0);

		System.out.println(ob1.equals(ob2));

	}
}
