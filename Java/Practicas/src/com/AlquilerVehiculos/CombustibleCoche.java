package com.AlquilerVehiculos;

public enum CombustibleCoche {
	GASOLINA(3.5), DIESEL(2);
	
	
	private double base;
	CombustibleCoche(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
}
