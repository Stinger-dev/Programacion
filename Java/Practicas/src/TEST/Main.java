package TEST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
	public static Random random = new Random();
	
/*
 * 250 obras
 * 0.15 de 0
 * 0.8 de 1
 * 0.05 de 2
 * 
 * probabilidad de mas de mas de 290
 * 
 */
	public static void main(String[] args) {
		double iteraciones = 100000000;
		boolean paso = false;
		for (int i = 0; i< iteraciones && !paso; i++) {
			if(iteracion()) {
				paso = true;
				System.out.println(i);
			}
		}
		System.out.println("Esto debe estar mal");
				
	}
	
	
	public static boolean iteracion() {
		int suma = 0;
		int max = 250;
		
		for(int i = 0; i< max ; i++) {	
			
			int numeroAleatorio = random.nextInt(0, 100);
			
			if(numeroAleatorio < 80) {
				suma +=1;
			}else if(numeroAleatorio >= 95) {
				suma +=2;
			}
		}
		return suma >= 290;	
	}
	


}
