package Boletin_04.Ejercicio_01;

public class Rectangulo {
	private double longitud;
	private double ancho;
	
	
	
	public Rectangulo()
	{
		this.longitud = 1;
		this.ancho = 1;
	}
	
	public Rectangulo(double ancho, double longitud)
	{ 
		this();
		this.setAncho(ancho);
		this.setLongitud(longitud);
	}
	


	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if (longitud>0 && longitud <20)

			this.longitud = longitud;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if (ancho>0 && ancho <20)
			this.ancho = ancho;
	}
	
	public double getPerimetro() {
		return 2*(ancho+longitud);
	}
	
	public double getArea() {
		return ancho*longitud;
	}
	
	
	

}
