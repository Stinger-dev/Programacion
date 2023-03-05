package Boletin_05.Ejercicio_02;

public class Main {
	public static void main(String[] args) {
		Producto ob1 = new Producto("algo to wapo", 10);
		System.out.println(ob1.getValorFinal());
		Producto ob2 = new Producto("algo to wapo", 20);
		System.out.println(ob2.getValorFinal());
		
		Producto.setIva(0.1);
		System.out.println(ob1.getValorFinal());
		System.out.println(ob2.getValorFinal());

	}
}
	