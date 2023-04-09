package com.BlocDeNotas;

import com.BlocDeNotas.bloc.Bloc;
import com.BlocDeNotas.notas.Nota;

public class Main {

	public static void main(String[] args) {
		Nota nota = new Nota("aoskdjf");
		/*
		 * System.out.println(nota.toString()); System.out.println(nota.isEmpty());
		 * System.out.println(nota.compareTo(nota));
		 * System.out.println(nota.equals(nota)); System.out.println(nota.getCodigo());
		 */

		Bloc bloc = new Bloc("recetas");

		for (int i = 0; i < 12; i++) {
			try {
				bloc.addNote(String.valueOf(i));
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		try {
			bloc.rmNote(10);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			bloc.addNote("nueva");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println(bloc.toString());

	}

}
