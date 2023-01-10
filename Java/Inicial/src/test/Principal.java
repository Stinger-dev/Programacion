	package test;
	
	import java.util.Scanner;
	
	public class Principal {
		
		public static void main(String[] args)
		
		{	
			
			
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Introduce algo: ");
			String cadena =  sc.nextLine();
			
			System.out.println("hola a todos"+ cadena);
			
			
			cadena =  sc.nextLine();
	
			System.out.println("hola a todos"+ cadena);	
			
			
			for (int i=0;i<10;i++)
			{
				System.out.println(i);
			}
			
		}
	}
		