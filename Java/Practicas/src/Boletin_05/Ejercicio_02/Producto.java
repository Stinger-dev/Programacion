package Boletin_05.Ejercicio_02;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precioSinIva;
	private static double iva = 0.20;

	public Producto(String descripcion, double precioSinIva) {
		super();
		this.codigo = hashCode();
		this.descripcion = descripcion;
		this.precioSinIva = precioSinIva;
	}

	public double getValorFinal() {
		return this.precioSinIva * (1 + iva);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(double precio) {
		this.precioSinIva = precio;
	}

	public static double getIva() {
		return iva;
	}

	public static void setIva(double iva) {
		Producto.iva = iva;
	}

}
