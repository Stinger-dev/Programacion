package TEST;


public class Main {

	
	public static void main(String[] args) {
		
		EnumerateGenerico enu = null;
		
		try {
			enu = EnumerateGenerico.valueOf("lsdha");
		} catch (Exception e) {
			System.out.println("salio mal");
		}
		
		System.out.println(enu);
		
		
	}

	
}

