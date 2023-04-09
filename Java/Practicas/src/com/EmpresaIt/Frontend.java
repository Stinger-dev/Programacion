package com.EmpresaIt;

public interface Frontend {
	public static final double WEB_INTERFACE_DESING_COST = 2100;
	public static final double FE_MAINTENANCE_COST = 700;

	public default double computeWebDesingCost() {
		return WEB_INTERFACE_DESING_COST;
	}

	public default double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}

}
