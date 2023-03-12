package Boletin_05.Ejercicio_04;

public class Main {
	public static void main(String[] args) {
		Partido ob1 = new Partido(1, "Betis", "Betis");
		ob1.ponerResultado("2-1");
		
		Partido ob2 = new Partido(1, "Betis", "Sevilla");
		ob2.ponerResultado("0-0");
		
		Partido ob3 = new Partido(1, "Barça", "Madrid");
		ob3.ponerResultado("1-2");
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		
		
		
	}

}
