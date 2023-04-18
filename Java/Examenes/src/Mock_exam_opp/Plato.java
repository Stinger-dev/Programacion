package Mock_exam_opp;

public class Plato {
	private String nombre;
	protected static double iva;
	private double precio;
	private Vino recomendado;

	public Plato() {
		this.nombre = "Plato placeholder";
		iva = 0.21;
		setPrecio(-1);
		this.recomendado = new Vino("Sin recomendaciones de vino");

	}

	public Plato(String nombre) {
		this();
		this.nombre = nombre;

	}

	public Plato(String nombre, double precio) {
		this(nombre);
		setPrecio(precio);
	}

	public void setPrecio(double precio) {
		this.precio = (precio <= 0) ? -1 : precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getPrecioBase() {
		return this.precio;
	}

	public double getPrecioVentaPublico() {
		return this.precio * (1 + getIva());
	}

	public String getVinoRecomendado() {
		return this.recomendado.getNombre();
	}

	public static double getIva() {
		return iva;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();

		resultado.append(String.format("El plato se llama %s", this.nombre));
		if (this.precio > 0) {
			resultado.append(String.format(", tiene un precio sin iva de %s y de %s con iva incluido\n", this.precio,
					this.getPrecioVentaPublico()));
		} else {
			resultado.append(" y aun no tiene precio\n");
		}

		if (this.recomendado.getNombre().equalsIgnoreCase("Sin recomendaciones de vino"))
			resultado.append("No tiene recomendaciones de vino");

		else
			resultado.append(String.format("El vino recomendado es %s y tiene una graduacion de %s",
					this.recomendado.getNombre(), this.recomendado.getGraduacion()));

		return resultado.toString();
	}

	@Override
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Plato) {
			Plato ob2 = (Plato) ob1;

			igual = this.nombre.equals(ob2.nombre);
		}
		return igual;
	}

}
