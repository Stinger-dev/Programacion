package com.AlquilerVehiculos;

public class MicroBus extends Vehiculo {

	private int numeroPlazas;

	public MicroBus(Gama gama, Tipo tipo, String matricula, int numeroPlazas) {
		super(gama, tipo, matricula);
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public double getPrecioDia() {
		return 5 * numeroPlazas + this.gama.getBase();
	}

}
