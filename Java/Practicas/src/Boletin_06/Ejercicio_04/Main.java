package Boletin_06.Ejercicio_04;

public class Main {
	public static void main(String[] args) {
		Fecha ob1 = new Fecha(29, 2, 2024);
		System.out.println(ob1.esFechaValida());
		System.out.println(ob1.toFormatoLargo());
	}
}
