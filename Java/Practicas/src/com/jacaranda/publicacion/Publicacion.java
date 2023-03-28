package com.jacaranda.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import com.jacaranda.usuario.Usuario;

public abstract  class Publicacion implements Comparable<Publicacion>, Valorable {

	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private static int codigoSiguiente = 0;
	private Usuario usuario;
	
	
	
	public Publicacion(String texto, Usuario usuario) throws PublicacionException {
			setTexto(texto);
			this.usuario = usuario;
			this.codigo = codigoSiguiente++; //Recordar esto para la prox vez que lo necesite, "bastante util"
			this.fechaCreacion = LocalDateTime.now(); //Fecha de creacion de la publicacion
		
		
	}
	
	protected String getTexto() {
		return this.texto;
	}
	
	protected abstract void setTexto(String texto) throws PublicacionException;

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, usuario, valoracion);  //No se que especificamente quiere en el hash, asi que tp' pa' éntro
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Publicacion) {
			Publicacion casteado = (Publicacion) obj;

			esIgual = this.getClass().equals(casteado.getClass()) && this.texto.equals(casteado.texto);
		}
		return esIgual;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public int getValoracion() {
		return valoracion;
	}
	
	public boolean valorar(String valoracion) {
		boolean success = false;
		
		try {
			int tmp = Valoraciones.valueOf(valoracion.toUpperCase()).getValoracion();
			this.valoracion+=tmp;
			success = true;
		} catch (Exception e) {
		}

		return success; //Supongo que es una bandera de exito, pq en el uml lo pone pero no he encontrado aun el 
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getLoginUsuario() {
		return this.usuario.getLogin();
	}

	@Override
	public String toString() {
		/** FORMATO REQUERIDO
		Publicación: <texto de la publicación>
		Realizada por: <login del usuario>
		Valoración: <valoración>
		Fecha de publicación: <fecha de publicación>
		 */
		
		return String.format("Publicacion: %s \n"
						   + "Realizada por: %s \n"
						   + "Valoracion: %s \n"
						   + "Fecha de publicacion: %s", this.texto, this.usuario.getLogin(), this.valoracion, this.getFechaCreacion());
	} 
	@Override
	public int compareTo(Publicacion obj) {
		return (this.valoracion == obj.valoracion)? this.fechaCreacion.compareTo(obj.fechaCreacion) : this.valoracion-obj.valoracion ;
	}
	
	public boolean isAnterior(Publicacion obj) {
		return this.fechaCreacion.isBefore(obj.fechaCreacion); //Recordar para un futuro, tiene pinta de que lo voy a necesitas
	}
	
		
}
