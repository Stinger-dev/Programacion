package main.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import main.model.Comparators.ComparatorEmpleadoEdad;
import main.model.Comparators.ComparatorEmpleadoRol;
import main.model.exceptions.DepartamentoException;
import main.model.exceptions.EmpleadoException;


public class Departamento {

	private Set<Empleado> empleados;
	private String codigoDepartamento;
	
	public Departamento() {
		super();
		empleados=new HashSet<>();
	}
	
	public Departamento(String codigoDepartamento) {
		this();
		this.codigoDepartamento=codigoDepartamento;
	}
	//Añade un empleado a la colección de empleados. Si ya existe o no es posible se lanzará excepción
	public void addEmpleado(Empleado empleado) throws DepartamentoException{
		
		if (!this.empleados.add(empleado)) {
			throw new DepartamentoException("Ya existe ese empleado");
		}
		
	}
	public void fusionarDepartamentos(Departamento dept2) {
		for(Empleado emp : dept2.empleados) {
			this.empleados.add(emp);
		}
		
	}
	
	//Cambia el rol al empleado cuyo código coincide con el indicado.
	//Lanza excepción si el empleado no existe, o bien, no se puede cambiar su rol
	public void cambiarRolAEmpleado(String codigoEmpleado, Rol rol) throws DepartamentoException{
		Iterator<Empleado> itEmpleados = this.empleados.iterator();
		boolean encontrado = false;
		Empleado tmp = null;
		while(itEmpleados.hasNext() && !encontrado) {
			tmp = itEmpleados.next();
			if(tmp.getCodigoEmpleado().equals(codigoEmpleado)) {
				encontrado = true;
			}
		}
		if(!encontrado) {
			throw new DepartamentoException("NO se ha podido encontrar al empleado");

		}
		
		try {
			tmp.modificarRol(rol);
		} catch (EmpleadoException e) {
			throw new DepartamentoException("NO se ha podido cambiar el rol al empleado");
		}		
	}
	
	public Collection<String> obtenerEmpleadosConNombre(String nombre){
		List<Empleado> tmp = new ArrayList<>(this.empleados);
		List<String> output = new ArrayList<>();
		
		tmp.sort(new ComparatorEmpleadoEdad());
		
		for(Empleado emp : tmp) {
			if(emp.contieneNombre(nombre)) {
				output.add(emp.toString()); 
			}
		}	
		return output;
	}
	
	
	
	public Collection<String> obtenerEmpleadosOrdenadoPorRol() {

		List<Empleado> tmp = new ArrayList<>(this.empleados);
		tmp.sort(new ComparatorEmpleadoRol());
		List<String> output = new ArrayList<>();
		
		for(Empleado emp: this.empleados) {
			output.add(emp.toString());
		}

		return output;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(codigoDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj ||obj!=null && obj instanceof Departamento dep && dep.codigoDepartamento.equals(this.codigoDepartamento);
	}
	
	
	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}
	
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		for(Empleado emp: this.empleados) {
			output.append(this.codigoDepartamento).append(",").append(emp.toString()).append("\n");
		}
		return output.toString();
	}
	
	
	public Set<Empleado> getEmpleados() {
		return empleados;
	}
	
}