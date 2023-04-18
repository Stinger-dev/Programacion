package Boletin_09;

public class Persona {

	private String nombre;
	private String apellidos;
	private Genero genero;

	public Persona(String nombre, String apellidos, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Genero getGenero() {
		return genero;
	}

	public String getNombre() {
		return nombre;
	}

}
