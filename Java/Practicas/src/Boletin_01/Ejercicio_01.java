package Boletin_01;

public class Ejercicio_01 {
	
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		
		
		System.out.println(iguales(a,b));
		
	}

	public static boolean iguales(int a, int b)
	{
		boolean resultado;
		if (a == b)
		{
			resultado = true;
		}
		else
		{
			resultado = false;
		}
		return resultado;
	}
}
