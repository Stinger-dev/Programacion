package Boletin_04.Ejercicio_03;


public class Cafetera {
	private int cCafe;
	private final int maxCafe = 50;
	private int cLeche;
	private final int maxleche= 50;
	private int cVasos;
	private final int maxVasos = 80;
	
	
	private final double precioLeche = 0.8;
	private final double precioCafe = 1.0;
	private final double precioCafeLeche = 1.5;
	
	
	
	

	private double monedero;
	public Cafetera() {
		super();
		this.cCafe = 50;
		this.cLeche = 50;
		this.cVasos = 80;
		this.monedero = 50.0;
	}
	
	public void llenarDepositos() {
		this.cCafe = maxCafe;
		this.cLeche = maxleche;
		this.cVasos = maxVasos;	
	}
	public void vaciarMonedero() {
		this.monedero = 0;
	}
	public String getEstado() {
		return String.format("La maquina tiene %s dosis para leche, %s dosis para cafe, %s vasos y en el monedero hay %s €", this.cLeche, this.cCafe, this.cVasos, this.monedero);
	}

	public String servirCafe(double dinero) {
		String resultado = "Error, no es suficiente dinero";
		if (dinero>=precioCafe) {
			if (dinero-precioCafe <= monedero) {
				if (cVasos > 0 && cCafe > 0) {
					this.cCafe--;
					this.cVasos--;
					this.monedero+=precioCafe;
					resultado = String.format("Recoge tu cambio de %s", dinero-precioCafe);
				}else {
					resultado = "Error, no hay suficientes recursos";
				}
			}else {
				resultado = "Error, no hay suficiente cambio";
			}
		}
		return resultado;
	}
	public String servirLeche(double dinero) {
		String resultado = "Error, no es suficiente dinero";
		if (dinero>=precioLeche) {
			if (dinero-precioLeche <= monedero) {
				if (cVasos > 0 && cLeche > 0) {
					this.cLeche--;
					this.cVasos--;
					this.monedero+=precioLeche;
					resultado = String.format("Recoge tu cambio de %s", dinero-precioLeche);
				}else {
					resultado = "Error, no hay suficientes recursos";
				}
			}else {
				resultado = "Error, no hay suficiente cambio";
			}
		}
		return resultado;
	}
	public String servirCafeLeche(double dinero) {
		String resultado = "Error, no es suficiente dinero";
		if (dinero>=precioCafeLeche) {
			if (dinero-precioCafeLeche <= monedero) {
				if (cVasos > 0 && cLeche > 0 && cCafe > 0) {
					this.cLeche--;
					this.cVasos--;
					this.cCafe--;
					this.monedero+=precioLeche;
					resultado = String.format("Recoge tu cambio de %s", dinero-precioCafeLeche);
				}else {
					resultado = "Error, no hay suficientes recursos";
				}
			}else {
				resultado = "Error, no hay suficiente cambio";
			}
		}
		return resultado;
	}
}
