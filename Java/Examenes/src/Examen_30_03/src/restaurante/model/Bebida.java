package restaurante.model;

public class Bebida extends Producto {

	private static final double IVA_BEBIDAS_ALC = 7;
	private double graduacion;
	
	public Bebida(String nombre, String descripcion, Alergeno alergeno, double precioBase, double graduacion) {
		super(nombre, descripcion, alergeno, precioBase);
		this.graduacion = graduacion;
	}
 
	@Override
	public double getPrecioProducto() {
		return this.precioBase*(1+(IVA_BEBIDAS_ALC/100));
	}
	public boolean esBebidaAlcoholica() {
		return graduacion>0; //si es mayor que 0 significa que tiene alcohol
	}

	@Override
	public boolean estaCaducado() {
		return false; //las bebidas nunca caducan asi que esto es siempre false
	}

	@Override
	public String toString() {
		return String.format("%s \n"
						   + "Graduacion: %s",super.toString(), this.graduacion );
	}

	
}
