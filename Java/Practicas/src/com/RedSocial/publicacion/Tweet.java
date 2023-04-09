package com.RedSocial.publicacion;

import com.RedSocial.usuario.Usuario;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) throws PublicacionException {
		super(texto, usuario);
	}

	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if (texto != null && texto.length() < 50) {
			this.texto = texto;
		} else
			throw new PublicacionException("Longitud de tweet incorrecta");

	}

	public boolean valorar(String valoracion) {
		boolean success = false;

		try {
			int tmp = Valoraciones.valueOf(valoracion.toUpperCase()).getValoracion();
			this.valoracion += tmp * 2;
			success = true;
		} catch (Exception e) {
		}

		return success;
	}

	@Override
	public String toString() {
		/**
		 * FORMATO REQUERIDO Tweet. Publicación: <texto de la publicación> Realizada
		 * por: <login del usuario> Valoración: <valoración> Fecha de publicación:
		 * <fecha de publicación> Número de estrellas: <número de estrellas>
		 * 
		 */
		return String.format("%s \n" + "%s \n", this.getClass().getSimpleName(), super.toString());
	}
}
