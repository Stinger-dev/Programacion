package com.EmpresaIt;

public enum ContractType {
	FULLTIME(1), PARTIAL(0.77); // asi lo puedo meter directamente como multiplicador y obtener el salario de
								// cada trabajador

	private double multiplicador;

	private ContractType(double multiplicador) {
		this.multiplicador = multiplicador;
	}

	public double getMultiplicador() {
		return this.multiplicador;
	}
}
