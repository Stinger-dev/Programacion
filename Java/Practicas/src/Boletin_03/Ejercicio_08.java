package Boletin_03;

public class Ejercicio_08 {

	public static void main(String[] args) {
		System.out.println(reemplazar_b_en_a_por_c("hola a todos", "todos", "todas"));
		
	}
	
	public static String reemplazar_b_en_a_por_c(String a, String b, String c) {
		
		if(a !=null && !a.isEmpty() && b !=null && !b.isEmpty() && c !=null && !c.isEmpty()) {
			StringBuilder a_ = new StringBuilder(a);
			int tmp = 0;
			while (a_.indexOf(b) != -1) {
				tmp = a_.indexOf(b);
				a_.delete(tmp, tmp+b.length());
				a_.insert(tmp, c);
			}
			return a_.toString();
		}
		else
			return null;
	}
}
