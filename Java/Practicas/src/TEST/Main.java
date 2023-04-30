package TEST;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	static Stream<Integer> numeros(){
		Integer[] numeros = {1,2,3,4};
		return Stream.of(numeros);
	}
	
	

	public static void main(String[] args) {
		
		File ficherito = new File("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\TEST\\Assets");
		System.out.println(ficherito.isDirectory());


		
	}
	
	

}
