package MockExam;

import java.time.LocalDate;

public class Persona  {
	
	private static final int EDAD_MAXIMA = 30;
	private static final int EDAD_MINIMA = 18;
	private static final String BASE_LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private Genero genero;


	
	public Persona() {
	}
	
	public Persona(String nombre, String apellido, String dni) throws PersonaException{
		if(validarDatos(nombre, apellido, dni)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;

		}else {
			throw new PersonaException();
		}
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) throws PersonaException {
		this(nombre, apellido, dni);
		if(validarDatos(nombre, apellido, dni, fechaNacimiento, genero)) {
			this.fechaNacimiento = fechaNacimiento;
			this.genero = Genero.valueOf(genero);
		}else {
			throw new PersonaException();
		}
	}

	
	protected boolean validarDatos(String nombre, String apellido, String dni) {		
		return !(nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty() || dni == null || dni.isEmpty() || !isDniValido(dni));
	}
	
	protected boolean validarDatos(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		return !(!validarDatos(nombre, apellido, dni) || fechaNacimiento == null || genero == null || genero.isEmpty() 
				|| (!Genero.HOMBRE.equals(Genero.valueOf(genero)) && !Genero.MUJER.equals(Genero.valueOf(genero))) || fechaNacimiento.isAfter(LocalDate.now()));
	}
	
	protected boolean isDniValido(String dni) {
		boolean resultado = true;

		if(dni.length() < 9 || Character.isDigit(dni.charAt(8)) || BASE_LETRAS_DNI.charAt(Integer.valueOf(dni.substring(0, 8))%BASE_LETRAS_DNI.length())!= dni.toUpperCase().charAt(8)) {
			resultado = false;
		}
		for(int i=0; i<dni.length()-1 && resultado; i++) 
			if(Character.isAlphabetic(dni.charAt(i))) 
				resultado = false;

		return resultado;		
	}
	

	
	public boolean bonoJovenDisponible() { 
		int edad = LocalDate.now().getYear()-this.fechaNacimiento.getYear();
		return (edad> EDAD_MINIMA && edad < EDAD_MAXIMA);
	}
	
	public int getEdad() {
		return obtenerEdadPara(LocalDate.now().getYear());
	}
	
	public int obtenerEdadPara(int year) {

		return (year>=this.fechaNacimiento.getYear())? year-this.fechaNacimiento.getYear() : -1 ;
	}


	public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public String getDni() {
		return dni;
	}




	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}





	public Genero getGenero() {
		return genero;
	}


	

}
