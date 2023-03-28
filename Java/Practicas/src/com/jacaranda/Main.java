package com.jacaranda;

import com.jacaranda.memoryStorage.MemoryStorage;
import com.jacaranda.memoryStorage.MemoryStorageExeption;
import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.publicacion.PublicacionException;
import com.jacaranda.publicacion.Recomendacion;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;

public class Main {

	public static void main(String[] args) {
		
		
		MemoryStorage ms = new MemoryStorage();
		try {
			ms.addUsuario("gon", "123");
		} catch (MemoryStorageExeption e) {
			e.printStackTrace();
		}
		try {
			ms.addUsuario("gon", "123");
		} catch (MemoryStorageExeption e) {
			System.out.println("Funciona");
		}
		
		try {
			ms.addPublicacion("Este mensaje va a desaparecer",  "gon");
		} catch (MemoryStorageExeption e) {
			System.out.println("Problema :(");		
			
		}
		try {
			ms.addPublicacion("este deberia llenar casi todo",  "gon","furbo");
		} catch (MemoryStorageExeption e) {

			System.out.println("Problema :(");		
		}		
		
		try {
			ms.addPublicacion("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean ma",  "gon",3);
		} catch (MemoryStorageExeption e) {

			System.out.println("Problema :(");		
		}
		
		System.out.println(ms.MostrarListaPublicaciones());
	}

}
