package main.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import main.model.exceptions.EmpleadoException;



public class Empleado {

	private String nombreCompleto;
	private String codigoEmpleado;
	private String fechaNacimiento;
	private Rol rol;
	
	
	public Empleado() {
		super();
	}
	
	
	public Empleado(String nombreCompleto, String codigoEmpleado, String fechaNacimiento, Rol rol) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.codigoEmpleado = codigoEmpleado;
		this.fechaNacimiento = fechaNacimiento;
		this.rol = rol;
	}



	//Cambia el rol si es diferente al actual, si no es posible lanza excepción
	public void modificarRol(Rol rol) throws EmpleadoException {
		if(rol != null && !this.rol.equals(rol)) {
			this.rol = rol;
		}else {
			throw new EmpleadoException("El rol no ha podido cambiarse");
		}
		
	}
	
	public boolean contieneNombre(String nombre) {
		return this.nombreCompleto.contains(nombre);
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoEmpleado);
	}
	

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj instanceof Empleado && obj.hashCode()==this.hashCode();
	}


	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	
	public int getEdad() {
		return (int)ChronoUnit.YEARS.between(
					LocalDate.parse(this.fechaNacimiento, DateTimeFormatter.ISO_DATE),
					LocalDate.now());
	}
	
	
	public Rol getRol() {
		return rol;
	}


	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s", this.nombreCompleto, this.codigoEmpleado, this.fechaNacimiento, this.rol);
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
}
