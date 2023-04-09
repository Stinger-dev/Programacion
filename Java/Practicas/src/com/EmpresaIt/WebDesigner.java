package com.EmpresaIt;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WebDesigner extends Candidate implements Frontend {

	public WebDesigner() {
		super();
	}

	@Override
	public double computeGrossSalary() {
		double totalMultiplicador = this.getCt().getMultiplicador()
				+ (int) ChronoUnit.YEARS.between(this.getStartDate(), LocalDate.now()) * plusAntiguedad;

		return (this.funcion) ? totalMultiplicador * computeWebDesingCost()
				: totalMultiplicador * computeFEMaintenanceCost();
	}

}
