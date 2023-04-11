package com.EmpresaIt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FullStackDeveloper extends Candidate implements Frontend, Backend {

	@Override
	public double computeGrossSalary() {
		double totalMultiplicador = this.getCt().getMultiplicador()
				+ (int) ChronoUnit.YEARS.between(this.getStartDate(), LocalDate.now()) * PLUS_ANTIGUEDAD;

		return (this.funcion) ? totalMultiplicador * (computeWebDesingCost() + createWebAPIAndDBConnectionCost())
				: totalMultiplicador * (computeFEMaintenanceCost() + maintenanceCost());
		// sinceramente, si no lo hago asi, ni idea de como estructurar esto
	}

}
