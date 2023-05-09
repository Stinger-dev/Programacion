package TEST;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.JFrame;

public class Main {
	/*
	public static void main(String[] args) {
		
		System.out.println("Indique una palabra para jugar");
		Scanner teclado = new Scanner(System.in);
		String palabra = teclado.nextLine().toLowerCase().trim();
		StringBuilder resultado = new StringBuilder();
		StringBuilder soluciones = new StringBuilder();
		for (char tmp : palabra.toCharArray()) {
			resultado.append("_ ");
		}
		
		
		boolean ganado = false;
		do {	
			System.out.println("Indique una letra");
			soluciones.append(teclado.nextLine().toLowerCase());
			resultado.delete(0, resultado.length());
			for (char tmp : palabra.toCharArray()) {
				resultado.append((soluciones.indexOf(String.valueOf(tmp))!= -1)? tmp:"_ ");
			}
			System.out.println(resultado.toString());
			if(resultado.indexOf("_") == -1) {
				ganado = true;
			}
			
			
		}while(!ganado);
		System.out.println("has ganado"); 


	}
	*/
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
	}


}
