package EsteSi;

public class main {

	public static void main(String[] args) {
		String prueba = "todos todostodostodostodos todos";
		
		
		System.out.println(contar1(prueba, "todos"));
		
		
	}
	
	public static int contar1(String palabra, String busca) {
		int resultado = 0, k = 0;
		
		while (palabra.indexOf(busca,k)!= -1)  {
			k = palabra.indexOf(busca,k) + 1 ;
			resultado++;
		}		
		return resultado;
	}
	public static int contar2(String palabra, String busca) {
		int resultado = 0, k = 0;
		StringBuilder cadena_ = new StringBuilder();
		

		return resultado;

	}

}
