package restaurante.model;

import java.time.LocalDate;

public class Plato extends Producto {

	protected LocalDate fechaConsumoPreferente;

	public Plato(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super(nombre, descripcion, alergeno, precioBase);
		this.fechaConsumoPreferente = LocalDate.now().plusDays(15);
	}

	@Override
	public double getPrecioProducto() {
		return this.precioBase * (1 + (IVA_GENERAL / 100));
	}

	@Override
	public boolean estaCaducado() {
		return LocalDate.now().isAfter(this.fechaConsumoPreferente);
	}

	public LocalDate getFechaConsumoPreferente() {
		return fechaConsumoPreferente;
	}

	public void setFechaConsumoPreferente(LocalDate fechaConsumoPreferente) {
		this.fechaConsumoPreferente = fechaConsumoPreferente;
	}

	@Override
	public String toString() {
		return String.format("%s \n" + "Fecha de consumo preferente: %s \n" + "Ingredientes: %s", super.toString(),
				this.fechaConsumoPreferente, this.descripcion);
	}
}
