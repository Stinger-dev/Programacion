package com.AlquilerVehiculos;

public enum Gama {
	BAJA(30), MEDIA(40), ALTA(50);

	private int base;

	Gama(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

}
