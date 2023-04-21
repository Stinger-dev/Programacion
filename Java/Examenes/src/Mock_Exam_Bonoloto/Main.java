package Mock_Exam_Bonoloto;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Historial histo1 = new Historial();

		Combinacion ob1 = null;
		try {
			ob1 = new Combinacion(2, 12, 17, 28, 4, 6, 10);
			System.out.println(ob1.toString());
			
		} catch (CombinacionExeption e) {
			System.out.println("Algo ha salido mal");

		}
		System.out.println(histo1.addSorteo(18,04,2023, ob1));
		
		
		System.out.println(histo1.addSorteo(21,04,2023, ob1));
		System.out.println(histo1.listarSorteosDesdeFecha(LocalDate.now().minusDays(1)));




		
		
		


	}
}
