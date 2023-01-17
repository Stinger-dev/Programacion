package Boletin_01;

public class Ejercicio_07 {

	public static void main(String[] args) {

		// A(for)

		System.err.println("--------------------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}

		System.err.println("--------------------------");

		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		System.err.println("--------------------------");

		for (int i = 0; i <= 100;) {
			i += 5;
			System.out.println(i);
		}

		System.err.println("--------------------------");

		for (int i = 320; i >= 160; i -= 20) {
			System.out.println(i);
		}

		// B (While)

		System.err.println("--------------------------");
		int k = 0;
		while (k < 100) {
			System.out.println(k + 1);
			k++;
		}

		System.err.println("--------------------------");
		k = 100;
		while (k != 0) {
			System.out.println(k);
			k--;
		}

		System.err.println("--------------------------");
		k = 5;
		while (k <= 100) {

			System.out.println(k);
			k += 5;
		}

		System.err.println("--------------------------");

		k = 320;
		while (k >= 160) {
			System.out.println(k);
			k -= 20;
		}

		// C (Do While)

		System.err.println("--------------------------");

		k = 0;
		do {
			System.out.println(k + 1);
			k++;

		} while (k < 100);

		System.err.println("--------------------------");
		k = 100;
		do {
			System.out.println(k);
			k--;
		} while (k != 0);

		System.err.println("--------------------------");
		k = 5;
		do {

			System.out.println(k);
			k += 5;
		} while (k <= 100);

		System.err.println("--------------------------");

		k = 320;
		do {
			System.out.println(k);
			k -= 20;
		} while (k >= 160);

	}

}
