package com.AlquilerVehiculos;

public class Coche extends Vehiculo {
	private CombustibleCoche combustible;
	
	

	public Coche(Gama gama, Tipo tipo, String matricula, CombustibleCoche combustible) {
		super(gama, tipo, matricula);
		this.combustible = combustible;
	}

	@Override
	public double getPrecioDia() {
		return this.combustible.getBase() + this.gama.getBase();
	}

}
