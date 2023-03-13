package Boletin_07.Ejercicio_00;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private LocalDate fechaNacimiento;
	private double altura;
	private double peso;
	private Nacionalidad pais;
	private Genero sexo;
	
	public Persona(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setSexo(String sexo) {
		
			this.sexo = Genero.valueOf(sexo.toUpperCase());
		
	}
	
	public void setNacion(String pais) {
	
		this.pais = Nacionalidad.valueOf(pais.toUpperCase());
		
	}
	public void setPeso(double peso) {
		
		this.peso = peso;
		
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
