package main.java.model;

import java.util.Objects;

public class Caseta {
	private String titulo;
	private String calle;
	private double numero;
	private double modulos;
	private Clase clase;
	private String entidad;
	private double id;
	private double idCalle;
	
	
	public Caseta(String titulo, String calle, double numero, double modulos, Clase clase, String entidad, double id,
			double idCalle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulos = modulos;
		this.clase = clase;
		this.entidad = entidad;
		this.id = id;
		this.idCalle = idCalle;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, entidad, id, idCalle, modulos, numero, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		return this == obj || obj instanceof Caseta && this.hashCode() == obj.hashCode();
	}



	@Override
	public String toString() {
		return "Caseta [titulo=" + titulo + ", calle=" + calle + ", numero=" + numero + ", modulos=" + modulos
				+ ", clase=" + clase + ", entidad=" + entidad + ", id=" + id + ", id_calle=" + idCalle + "]";
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getCalle() {
		return calle;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public double getNumero() {
		return numero;
	}



	public void setNumero(double numero) {
		this.numero = numero;
	}



	public double getModulos() {
		return modulos;
	}



	public void setModulos(double modulos) {
		this.modulos = modulos;
	}



	public Clase getClase() {
		return clase;
	}



	public void setClase(Clase clase) {
		this.clase = clase;
	}



	public String getEntidad() {
		return entidad;
	}



	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}



	public double getId() {
		return id;
	}



	public void setId(double id) {
		this.id = id;
	}



	public double getIdCalle() {
		return idCalle;
	}



	public void setIdCalle(double idCalle) {
		this.idCalle = idCalle;
	}
	

}
