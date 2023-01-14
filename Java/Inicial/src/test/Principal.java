	package test;
	
	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.List;

	
	public class Principal {
		
		public static void main(String[] args)
		{	
			
			Scanner sc = new Scanner (System.in);
			
			
			int edad = Integer.valueOf(sc.nextLine());
			 
			if(90 > edad && edad > 18)
			{
				System.out.println("Es mayor de edad");
			}
			else if (edad > 90) {
				System.out.println("tas viejo ");
			}
			else
			{
				System.out.println("Que asco de lenguaje");
			}
		}
	}
		