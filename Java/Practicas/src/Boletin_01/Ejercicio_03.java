package Boletin_01;

import java.util.Scanner;

public class Ejercicio_03 
{
	public static void main(String[] args)
	{
		
		System.out.println("Indique un caracter:");
		
		
		
		Character a = Character.valueOf(new Scanner (System.in).next().charAt(0));
		
		System.out.println(letra(a));
		
	}
	public static String letra(Character a)
	
	{
		String resultado = "";
		
		
		if (Character.isDigit(a))
		{
			resultado = "Es un digito";
		}else if (Character.isUpperCase(0))
		{
			resultado = "Es una mayuscula";
		}else if (Character.isLowerCase(a))
		{
			resultado = "Es un minuscula";
		}else if (Character.isWhitespace(a))
		{
			resultado = "Es un espacio";
		}else if (a.equals('{') || a.equals('}') || a.equals('(') || a.equals(')'))
		{
			resultado = "Es parentesis o llave";
		}else if (a.equals('.') || a.equals(',') || a.equals(':') || a.equals(';') || a.equals('?') || a.equals('¿') || a.equals('¡')|| a.equals('!'))
		{
			resultado = "Es signo de puntuacion";
		}
		else
		{
			resultado = "Es otro caracter";
		}
		
		
		return resultado;
	}

}
