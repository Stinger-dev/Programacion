package restaurante.model;

import restaurante.Restaurante;
import java.time.LocalDate;

public abstract class Producto {
	protected static final double IVA_GENERAL = 15;
	
	protected LocalDate fechaAltaMenu;
	protected LocalDate fechaBajaMenu;
	protected String nombre;
	protected String descripcion;
	protected Alergeno alergeno;
	protected double precioBase;
	protected String codigoProducto;
	public Producto(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super();
		this.fechaAltaMenu = LocalDate.now();
		this.fechaBajaMenu = null;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.alergeno = alergeno;
		this.precioBase = precioBase;
		this.codigoProducto = this.getClass().getSimpleName().concat(String.valueOf(++Restaurante.secuenciaGlobal)); //empieza por 1
	}
	
	public Alergeno getAlergeno() {
		return this.alergeno; //y si algo no tiene alergenos?
	}
	public abstract double getPrecioProducto();

	public LocalDate getFechaBajaMenu() {
		return fechaBajaMenu;
	} 
	
	public abstract boolean estaCaducado();
	
	public void setFechaBajaMenu(LocalDate fechaBajaMenu) {
		this.fechaBajaMenu = fechaBajaMenu;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	@Override
	public String toString() {
		return String.format("%s: %s \n"
						   + "Precio: %s \n"
						   + "Presenta alergenos: %s"
						   , this.getClass().getSimpleName(), this.nombre, this.getPrecioProducto(),(this.alergeno == null)? "No tiene alergenos" :  "Si tiene alergenos");
	}

}
