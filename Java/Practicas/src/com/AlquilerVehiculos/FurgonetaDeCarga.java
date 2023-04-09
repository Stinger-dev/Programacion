package com.AlquilerVehiculos;

public class FurgonetaDeCarga extends Vehiculo {

	private double PMA;

	public FurgonetaDeCarga(Gama gama, Tipo tipo, String matricula, double PMA) {
		super(gama, tipo, matricula);
		this.PMA = PMA;
	}

	@Override
	public double getPrecioDia() {
		return this.PMA * 0.5 + this.gama.getBase();
	}

}
