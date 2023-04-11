package com.AlquilerVehiculos;

public class Alquileres {

	private Vehiculo[] coches;
	private static final int NUMERO_MAX_COCHES = 200;

	public Alquileres() {
		this.coches = new Vehiculo[NUMERO_MAX_COCHES];
	}

	private int getSitioLibre() {
		int k;
		boolean encontrado = false;
		for (k = 0; k < NUMERO_MAX_COCHES && !encontrado; k++) {
			if (this.coches[k] == null) {
				encontrado = true;
			}
		}
		return (encontrado) ? k - 1 : -1;
	}

	public void addCoche(Gama gama, Tipo tipo, String matricula, CombustibleCoche combustible) {
		int newPos = getSitioLibre();
		if (newPos != -1 && !existeVehiculo(matricula)) {
			this.coches[newPos] = new Coche(gama, tipo, matricula, combustible);
		}
	}

	public void addMicroBus(Gama gama, Tipo tipo, String matricula, int numeroPlazas) {
		int newPos = getSitioLibre();
		if (newPos != -1 && !existeVehiculo(matricula)) {
			this.coches[newPos] = new MicroBus(gama, tipo, matricula, numeroPlazas);
		}
	}

	public void addFurgonetaDeCarga(Gama gama, Tipo tipo, String matricula, double PMA) {
		int newPos = getSitioLibre();
		if (newPos != -1 && !existeVehiculo(matricula)) {
			this.coches[newPos] = new FurgonetaDeCarga(gama, tipo, matricula, PMA);
		}
	}

	public boolean existeVehiculo(String matricula) {
		boolean encontrado = false;
		for (int i = 0; i < NUMERO_MAX_COCHES && !encontrado; i++) {
			if (this.coches[i] != null && this.coches[i].getMatricula().equals(matricula)) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	public Double getPrecio(String matricula, int dias) {
		/**
		 * -1 sino se encuentra
		 */
		int k;
		boolean encontrado = false;
		for (k = 0; k < NUMERO_MAX_COCHES && !encontrado; k++) {
			if (this.coches[k] != null && this.coches[k].getMatricula().equals(matricula)) {
				encontrado = true;
			}
		}
		return (encontrado) ? this.coches[k - 1].getPrecioDia() * dias : -1;
	}

}
