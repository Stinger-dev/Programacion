package com.RedSocial.publicacion;

import com.RedSocial.usuario.Usuario;

public class Recomendacion extends Publicacion {

	private int numeroEstrellas;
	
	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) throws PublicacionException {
		super(texto, usuario);
		if (numeroEstrellas >= 1 && numeroEstrellas <=5) {
			this.numeroEstrellas = numeroEstrellas;
		}else
			throw new PublicacionException("Numero de estrellas incorrecto");

	}

	/**
	 * Minimo de 100 y maximo de 500 
	 * @throws PublicacionException 
	 */
	@Override
	protected void setTexto(String texto) throws PublicacionException {
		if (texto != null && texto.length()>100 && texto.length()<200) {
			this.texto = texto;
		}else
			throw new PublicacionException("Longitud de recomendacion incorrecta");
	}

	@Override
	public String toString() {
		/**FORMATO REQUERIDO (Esto se podria poner en la superclase pero como el uml pide un to string en cada subclase, alla vamos)	
		 * 	Recomendación.
			Publicación: <texto de la publicación>
			Realizada por: <login del usuario>
			Valoración: <valoración>
			Fecha de publicación: <fecha de publicación>
			Número de estrellas: <número de estrellas>

		 */
		return String.format("%s \n"
						   + "%s \n"
						   + "Número de estrellas: %s", this.getClass().getSimpleName(), super.toString(), this.numeroEstrellas);
	}
	
	public int getNumeroestrellas() {
		return this.numeroEstrellas;
	}
	

}
