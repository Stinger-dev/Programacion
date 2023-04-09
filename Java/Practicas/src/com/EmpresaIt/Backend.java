package com.EmpresaIt;

public interface Backend {
	static final double WEB_API_DB_COST = 2200;
	static final double BE_MAINETNANCE_COST = 500;

	public default double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}

	public default double maintenanceCost() {
		return BE_MAINETNANCE_COST;
	}
}
