package Mock_Exam_Bonoloto;

public class Main {
	public static void main(String[] args) {
		Combinacion ob1;
		try {
			ob1 = new Combinacion(2, 12, 17, 28, 46, 6, 10);
			System.out.println(ob1.toString());
		} catch (CombinacionExeption e) {
			System.out.println("Algo ha salido mal");
			e.printStackTrace();
		}
		
		try {
			ob1 = new Combinacion(new int[] {2,12,17,28,46}, new int[] {6,10});
			System.out.println(ob1.toString());
		} catch (CombinacionExeption e) {
			System.out.println("Algo ha salido mal");
			e.printStackTrace();
		}


	}
}
