package com.AlquilerVehiculos;

public abstract class Vehiculo {

	protected Gama gama;
	protected Tipo tipo;
	protected String matricula;
	
	
	
	public Vehiculo(Gama gama, Tipo tipo, String matricula) {
		super();
		this.gama = gama;
		this.tipo = tipo;
		this.matricula = matricula;
	}



	public String getMatricula() {
		return matricula;
	}
	public Gama getGama() {
		return gama;
	}
	public Tipo getTipo() {
		return tipo;
	}
	
	
	public abstract double getPrecioDia();
	
	

}
