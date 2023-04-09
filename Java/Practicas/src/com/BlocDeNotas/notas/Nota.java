package com.BlocDeNotas.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota>{

	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	public Nota(String texto) {
		super();
		this.texto = texto;
		this.fechaCreacion = LocalDateTime.now();
		this.fechaUltimaModificacion = this.fechaCreacion; //Ponemos que la fecha de modificacion porn defecto sea la de creacion, como el Windows
		this.codigo = codigoSiguiente++;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion = LocalDateTime.now();
	}
	public int getCodigo() {
		return codigo;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		return !this.fechaCreacion.equals(this.fechaUltimaModificacion); // si la fecha es distinta significa que esta modificado
	}
	
	public boolean isEmpty() {
		return this.texto.trim().isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.isBefore(nota.fechaCreacion);
	}
	
	public boolean isModificadoAnterior(Nota nota) {
		return this.fechaUltimaModificacion.isBefore(nota.fechaUltimaModificacion);		
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, fechaUltimaModificacion, texto);
	}
	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Nota) {
			Nota casteado = (Nota) obj;

			esIgual =  this.fechaCreacion.equals(casteado.fechaCreacion) && this.texto.equals(casteado.texto);
		}
		return esIgual;
	}
	@Override
	public String toString() {
		return String.format("Fecha de creacion: %s \n"
				+ "Fecha de modificacion: %s \n"
				+ "%s", this.fechaCreacion.toString(), this.fechaUltimaModificacion.toString(), this.texto);
	}
	@Override
	public int compareTo(Nota nota) {
		return this.fechaCreacion.compareTo(nota.fechaCreacion);
	}
}
