package com.jacaranda.memoryStorage;

import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.usuario.Usuario;

public class MemoryStorage {

	private int numUsuaripsActuales;
	private int numPublicacionesActuales;
	
	private Usuario[] usuarios;
	private Publicacion[] publicaciones;
	
	private final static int NUM_MAXIMO_USUARIOS = 15;
	private final static int NUM_MAXIMO_PUBLICACIONES = 50;

	
	public MemoryStorage() {
		super();
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones = new Publicacion [NUM_MAXIMO_PUBLICACIONES];
		}
	
	private int posicionUsuario(String login) {
		
		return -1;
	}
	public void addUsuario(String login, String pass) {
		
	}
	
	public void addPublicacion(String tweet, String usuario) {
		
	}
	

	public void addPublicacion(String tweet, String usuario, String tema) {
			
	}

	
	
}
