package Boletin_06.Ejercicio_07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Cuantos alumnos hay en la clase?");
		Scanner teclado = new Scanner(System.in);
		int cantidad = Integer.valueOf(teclado.nextLine());
		
		Alumno[] alumnos = new Alumno[cantidad];
		String nombre;
		double nota;
		
		for (int i = 0; i< alumnos.length; i++) {
			System.out.println("Indique el nombre del alumno " + (i+1));
			nombre = teclado.nextLine();
			System.out.println("Indique la nota del alumno " + (i+1));
			nota = Double.valueOf(teclado.nextLine());
			alumnos[i] = new Alumno(nombre, nota);
		}
		
		for (Alumno alu : alumnos) {
			if (!alu.esAprobado(5)) {
				System.out.println(alu.toString());
			}
		}
		int k = 0;
		double suma = 0;
		
		for (Alumno alu : alumnos) {
			suma += alu.getNota();
			k++;
		}
		System.out.printf("La nota media es %s", suma/k);
		for (Alumno alu : alumnos) {
			if (!alu.esAprobado(9)) {
				System.out.println(alu.toString());
			}
		}
		
		Alumno alumax = alumnos[0], alumin = alumnos[0];
		
		for (Alumno alu : alumnos) {
			if (alu.getNota() > alumax.getNota()) {
				alumax = alu;
			}
			if (alu.getNota() < alumin.getNota()) {
				alumin = alu;
			}
		}
		System.out.printf("El alumno con la nota maxima: %s \n", alumax.toString());
		System.out.printf("El alumno con la nota minima: %s \n", alumin.toString());
		
		
		
		mostrarAlumnos(menorMayor(alumnos));
		
		
		
		
		
	}
	
	
	public static Alumno[] menorMayor(Alumno[] alumnos) {
		Alumno[] alumnosTmp = new Alumno[alumnos.length] ;
		Alumno[] alumnosFinal = new Alumno[alumnos.length];
		System.arraycopy(alumnos, 0, alumnosTmp, 0, alumnos.length);
		int minimo;
		for (int i = 0; i < alumnosTmp.length; i++) {
			minimo = minimo(alumnosTmp);
			alumnosFinal[i] = alumnosTmp[minimo];
			alumnosTmp[minimo] = new Alumno("placeholder", Double.MAX_VALUE);
			 
		}
		return alumnosFinal;
	}
	
	public static int minimo(Alumno[] alumnos) {
		int min = 0;
		
		for (int i = 0; i< alumnos.length; i++) {
			if (alumnos[i].getNota() < alumnos[min].getNota() ) {
				min = i;
			}
		}
		return  min;
	}
	
	
	public static void mostrarAlumnos(Alumno[] alumnos) {
		for (Alumno n : alumnos) {
			System.out.println(n.toString());
		}
	}
	
	
}
	
