package main.java.model;

import java.util.Objects;

public class Estudiante {

	private int id;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private Genero genero;
	
	
	public Estudiante(int id, String nombre, String apellidos, String fechaNacimiento, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}


	public String toString() {
		return String.format(
				"Estudiante con id %s nombre %s y apellidos %s con fecha de nacimiento"
				+ " %s y género %s"
				, this.id, this.nombre, this.apellidos, this.fechaNacimiento, this.genero);
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaNacimiento, id, nombre);
	}



	@Override
	public boolean equals(Object obj) {
		return this == obj || obj!= null && obj instanceof Estudiante && this.hashCode() == obj.hashCode();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	


}
