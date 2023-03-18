package Boletin_07.Ejercicio_02;

public interface Backend {
	static final double WEB_API_DB_COST = 2200;
	static final double BE_MAINETNANCE_COST = 500;

	Double createWebAOIAndDBConenectionCost();

	Double maintenanceCost();
}
