package restaurante.model;

import java.time.LocalDate;

import restaurante.Restaurante;

public class Cliente {

	private Alergeno alergia;
	private LocalDate fechaNacimiento;
	private String codigoCliente;
	private Producto[] consumos; // Esto es la cuenta
	private int ultimoPoedido = 0;

	public Cliente(LocalDate fechaNacimiento, Alergeno alergico) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.alergia = alergico;
		this.consumos = new Producto[30];
		this.codigoCliente = this.getClass().getSimpleName().concat(String.valueOf(Restaurante.secuenciaGlobal));
	}

	public boolean solicitarServicio(Producto s) throws ServicioNoDisponibleException {
		boolean resultado = false;
		if (!s.estaCaducado() && ultimoPoedido < this.consumos.length) {
			if (s.getAlergeno() != this.alergia || this.alergia == null) {
				if (this.esMayorEdad() || s instanceof Plato) {
					consumos[ultimoPoedido++] = s;
					resultado = true;
				} else if (!((Bebida) s).esBebidaAlcoholica()) {
					consumos[ultimoPoedido++] = s;
					resultado = true;
				}
			}
		}
		if (!resultado) {
			throw new ServicioNoDisponibleException();
		}
		return resultado;
	}

	public double calcularImporteConsumido() {
		double precioTotal = 0;
		for (Producto p : this.consumos) {
			if (p != null) {
				precioTotal += p.getPrecioProducto();
			}
		}
		return precioTotal;
	}

	public boolean esMayorEdad() {
		return this.fechaNacimiento.plusYears(18).isBefore(LocalDate.now().plusDays(1));
	}

	public int getEdadActual() {
		return this.fechaNacimiento.getYear() - this.fechaNacimiento.getYear(); // todo Mejorar para pillar meses y tal
	}

	public boolean esAlergicoA(Alergeno alergeno) {
		return this.alergia.equals(alergeno);
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	// ToDo
	public boolean esBebedor() {
		boolean resultado = false;
		for (int i = 0; i < this.consumos.length && !resultado; i++) {
			if (this.consumos[i] instanceof Bebida) {
				resultado = ((Bebida) this.consumos[i]).esBebidaAlcoholica();
			}
		}
		return resultado;
	}

	public Alergeno getAlergia() {
		return alergia;
	}

	@Override
	public String toString() {
		return String.format("Cliente con id %s ha consumido %s\n", this.codigoCliente,
				this.calcularImporteConsumido());
	}
}
