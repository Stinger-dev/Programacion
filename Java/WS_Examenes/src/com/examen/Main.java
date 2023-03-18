package com.examen;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static Usuario[] usuarios = new Usuario[10];
	public static int ultimaPos = 0;

	public static void main(String[] args) {
		
		
		menuPrincipal();
		
	}
	public static void menuPrincipal() {
		System.out.println("1. Crear usuario\n"
						+ "2. Logear usuario\n"
						+ "3. Salir\n"
						+ "Elija la opcion: \n");
		String opcion = teclado.nextLine();
		switch (opcion) {
		case "1":
			crearUsuario();
			
			menuPrincipal();
			break;
		case "2":
			Usuario user = logIn() ;
			if (user == null) {
				System.out.println("login incorrecto");
				menuPrincipal();
			}else {
				menuUsuario(user);
	
			}
			break;
			
		case "3":
			System.out.println("Saliendo");
			break;

		default:
			System.out.println("Opcion no valida");
			menuPrincipal();
			break;
		}
	}
	
	public static void menuUsuario(Usuario user) {
		System.out.println(   "1. Mostrar informacion del usuario\n"
							+ "2. Comprobar si la contraseña es segura\n"
							+ "3. Cambiar contraseña\n"
							+ "4. Volver al menu principal\n"
							+ "5. Salir del programa\n"
							+ "Elija la opcion: \n");
		String opcion = teclado.nextLine();
		switch (opcion) {
		case "1":
			System.out.println(user.toString());
			
			menuUsuario(user);
			break;
		case "2":
		
			System.out.println((user.esPasswordSegura())? "La contraseña es segura" : "La contraseña NO es segura");
			
			menuUsuario(user);
			break;
			
		case "3":
			
			System.out.println(cambiarContrasegna(user)? "La contraseña se ha cambiado" : "La contraseña NO se ha cambiado");
			
			menuUsuario(user);
			break;
			
			
		case "4":
			System.out.println("Volviendo al menu principal");
			
			menuPrincipal();
			break;
			
		case "5":
			
			break;
		
		default:
			System.out.println("Opcion no valida");
			menuUsuario(user);
			break;
		}
		}
	
	
	public static int buscarUsuario(Usuario usuario) {
		int posicion = -1;
		for (int i = 0; i<usuarios.length && posicion == -1 && usuarios[i] != null; i++) {
			if(usuarios[i].equals(usuario)) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static void crearUsuario() {
		if (ultimaPos != usuarios.length) {
			String nombre;
			do {
				System.out.println("Indique el nombre (Debe de tener mas de 3 letras):");
				nombre = teclado.nextLine();
			} while (nombre.length()<3);
			
			String apellido;
			do {
				System.out.println("Indique el apellido (Debe de tener mas de 3 letras):");
				apellido = teclado.nextLine();
			} while (apellido.length()<3);
			
			
			System.out.println("Indique la contraseña:");
			String passwd = teclado.nextLine();
			
			System.out.println("Indique el mail (pulse enter sin escribir nada para dejarlo en blanco):");
			String mail = teclado.nextLine();
			
			if (mail.isEmpty()) {
				usuarios[ultimaPos] = new Usuario(nombre, apellido, passwd)	;
				ultimaPos++;
				
			}else {
				usuarios[ultimaPos] = new Usuario(nombre, apellido, mail, passwd);
				ultimaPos++;
			}
			System.out.println(usuarios[ultimaPos-1].toString());
			
		}else {
			System.out.println("No queda espacio en el sistema, contacte con un admisitrador");
		}
		
	}
	

	public static Usuario logIn() {
		boolean exito = false;
		String nombre;
		do {
			System.out.println("Indique el nombre de usuario");
			nombre = teclado.nextLine();
		}while (nombre.isEmpty() || nombre == null);
		String passwd;
		do {
			System.out.println("Indique el nombre de passwd");
			passwd = teclado.nextLine();
		}while (passwd.isEmpty() || passwd == null);
		int posicion = -1;
		
		for (int i = 0; i< usuarios.length && posicion == -1  && usuarios[i] != null; i++) {
			if (usuarios[i].getUserName().equals(nombre)) {
				posicion = i;
			}
		}
		
		if (posicion != -1) {
			exito = usuarios[posicion].hacerLogin(nombre, passwd);
		}

		return (exito)? usuarios[posicion] : null ;
	}
	
	public static boolean cambiarContrasegna(Usuario user) {
		System.out.println("Indique la contraseña antigua:");
		String oldpass = teclado.nextLine();
		System.out.println("Indique la contraseña nueva:");
		String pass = teclado.nextLine();
		System.out.println("Repita la nueva contraseña:");
		String passverif = teclado.nextLine();
		
		return user.modificarPassword(oldpass, pass, passverif);
	}
	
	

}
