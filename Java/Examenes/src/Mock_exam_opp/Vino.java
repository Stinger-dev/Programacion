package Mock_exam_opp;

public class Vino {

	private String nombre;
	private double graduacion; // -1 equivaldria a un error

	private Vino() {
		setGraduacion(-1);
	}

	public Vino(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Vino(String nombre, double graduacion) {
		this(nombre);
		setGraduacion(graduacion);
	}

	private void setGraduacion(double graduacion) {
		this.graduacion = (graduacion < 0) ? -1 : graduacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}

	@Override
	public String toString() {
		return "El nombre del vino es " + nombre + " y la graduacion=" + graduacion;
	}

	@Override
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Vino) {
			Vino ob2 = (Vino) ob1;

			igual = this.graduacion == ob2.graduacion && this.nombre.equalsIgnoreCase(ob2.nombre);

		}
		return igual;

	}

}
