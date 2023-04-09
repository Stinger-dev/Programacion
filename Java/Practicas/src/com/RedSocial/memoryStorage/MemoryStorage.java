package com.RedSocial.memoryStorage;

import com.RedSocial.publicacion.Post;
import com.RedSocial.publicacion.Publicacion;
import com.RedSocial.publicacion.PublicacionException;
import com.RedSocial.publicacion.Recomendacion;
import com.RedSocial.publicacion.Tweet;
import com.RedSocial.usuario.Usuario;

public class MemoryStorage {
	private final static int NUM_MAXIMO_USUARIOS = 15;
	private final static int NUM_MAXIMO_PUBLICACIONES = 50;

	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	private Usuario[] usuarios;
	private Publicacion[] publicaciones;
	

	
	public MemoryStorage() {
		super();
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones = new Publicacion [NUM_MAXIMO_PUBLICACIONES];
		}
	
	private int posicionUsuario(String login) {
		int cont ;
		boolean encontrado = false;
		for (cont = 0; cont < usuarios.length && !encontrado && usuarios[cont] != null; cont++) {
			encontrado = usuarios[cont].getLogin() == login;
		}
		if (!encontrado)
			cont = 0;
			
		
		return cont -1;
	}
	public void addUsuario(String login, String pass) throws MemoryStorageExeption { //Añadir usuario
		if(this.numUsuariosActuales <NUM_MAXIMO_USUARIOS) {
			if (login != null && !login.trim().isBlank() && pass != null && !pass.trim().isEmpty()  ) {
				if(posicionUsuario(login) == -1) {
					this.usuarios[numUsuariosActuales++] = new Usuario(login, pass);
				}else
					throw new MemoryStorageExeption("Ya existe un usuario con ese nombre");

				
			}else
				throw new MemoryStorageExeption("Error con los datos de usuarip");

		}else
			throw new MemoryStorageExeption("Espacio insuficiente");
	}
	
	public void addPublicacion(String txt, String login) throws MemoryStorageExeption { //Añadiendo tweet
		if (txt != null && !txt.trim().isBlank() && login != null && !login.trim().isEmpty()) {
			int posicion = this.posicionUsuario(login);
			if(posicion != -1) {
				Usuario user = this.usuarios[posicion];	
				Tweet pu;
				try {
					pu = new Tweet(txt, user);
					this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = pu;
				} catch (PublicacionException e) {
					throw new MemoryStorageExeption("Error al añadir el tweet");
				}
			}	
		}
	}
	

	public void addPublicacion(String txt, String login, String tema) throws MemoryStorageExeption { //Añadir Post
		if (txt != null && !txt.trim().isEmpty() && login != null && !login.trim().isEmpty() && tema != null && !tema.trim().isEmpty()) {
			int posicion =  this.posicionUsuario(login);
			if(posicion != -1) {
				Usuario user = this.usuarios[posicion];
				Post pu;
				try {
					pu = new Post(txt, user, tema);
				} catch (PublicacionException e) {
					throw new MemoryStorageExeption("Error al añadir post");
				}
				this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = pu;
			}	
		}	
	}

	public void addPublicacion(String txt, String login, int estellas) throws MemoryStorageExeption { //Añadir recomendacion
		if (txt != null && !txt.trim().isEmpty() && login != null && !login.trim().isEmpty()) {
			int posicion =  this.posicionUsuario(login);
			if(posicion != -1) {
				Usuario user = this.usuarios[posicion];
				Recomendacion pu;
				try {
					pu = new Recomendacion(txt, user, estellas);
				} catch (PublicacionException e) {
					throw new MemoryStorageExeption("Error al añadir recomendacion");
				}
				this.publicaciones[numPublicacionesActuales++%NUM_MAXIMO_PUBLICACIONES] = pu;
			}	
		}	
	}
	
	public String MostrarListaPublicaciones() {
		StringBuilder ob1 = new StringBuilder()	;
		for (Publicacion pu : this.publicaciones) {
			if (pu != null) {
				ob1.append(pu.toString()).append("\n").append("------").append("\n");
			}
		}
		
		return ob1.toString();
	}
	
	
}
