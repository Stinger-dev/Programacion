package EsteSi;

import java.util.Arrays;


public class Main {

	public static int[] array = { 1, 2, 3, 4, 5 };
	public static int[] tmp = new int[array.length];
	public static int contador = 0;

	public static void main(String[] args) {

		muestra();

		mandarFinal(2);

		muestra();

		mandarFinal(0);

		muestra();

	}

	public static void muestra() {
		for (int n : tmp) {
			System.out.print(n + ", ");
		}
		System.out.print("\n");
	}

	public static void mandarFinal(int a) {
		tmp[contador] = array[a];
		contador++;
		array[a] = array[array.length - 1];

		array = Arrays.copyOf(array, array.length - 1);
	}

}
