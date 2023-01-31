package Boletin_03;

public class Ejercicio_01 {
	
	public static void main(String[] agrs) {	
		System.out.println(parImpar("0123456789", false));
		System.out.println(parImpar("0123456789", true));
	}
	//true es par false impar
	public static String  parImpar(String a, boolean bandera) {
		
		String resultado = "";
		if (bandera) {
			for (int i = 0; i<a.length(); i+=2) {
				resultado +=a.charAt(i);
			}
			int k  = 0;
			while (a.length() > k) {
				resultado +=a.charAt(k);
				k +=2;
			}		
			int j = 0;
			 do {
				resultado +=a.charAt(j);
				j+=2; 
				
			 }while (j<a.length());
			
			
		}else {
			for (int i = 1; i<a.length(); i+=2) {
				resultado +=a.charAt(i);
			}
			int k  = 1;
			while (a.length() > k) {
				resultado +=a.charAt(k);
				k +=2;
			}
			int j = 1;
			 do {
				resultado +=a.charAt(j);
				j+=2; 	
			 }while (j<a.length());
		}
		return resultado;
	}
}
