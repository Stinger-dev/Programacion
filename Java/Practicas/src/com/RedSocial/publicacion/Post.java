	package com.RedSocial.publicacion;

import com.RedSocial.usuario.Usuario;

public class Post extends Publicacion {

	private int numeroLecturas;
	private String tema;
	
	public Post(String texto, Usuario usuario, String tema) throws PublicacionException {
		super(texto, usuario);
		this.tema = tema;
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if (texto != null && !texto.trim().isEmpty()) {
			this.texto = texto;
		}else
			throw new PublicacionException("Longitud de post incorrecta");
		
	}

	public boolean valorar(String valoracion) {
		boolean success = super.valorar(valoracion);
		
		if (success) {
			this.numeroLecturas++;
		}

		return success; 
	}
	public int getNumLectureas() {
		return this.numeroLecturas;
	}
	

	@Override
	public String toString() {
		/**FORMATO REQUERIDO 
		 * 	Post.
			Publicación: <texto de la publicación>
			Realizada por: <login del usuario>
			Valoración: <valoración>
			Fecha de publicación: <fecha de publicación>
			Número de estrellas: <número de estrellas>

		 */
		return String.format("%s \n"
						   + "%s \n", this.getClass().getSimpleName(), super.toString());
	}
	
	
}
