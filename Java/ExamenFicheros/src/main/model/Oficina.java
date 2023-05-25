package main.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import main.model.Comparators.ComparatorCodigoDepartamento;
import main.model.exceptions.DepartamentoException;

public class Oficina {

	private List<Departamento> departamentos;
	private String ubicacion;
	private String codigoOficina;
	private final String CABECERA = "DEPARTAMENTO,NOMBRE_COMPLETO,CODIGO_EMP,FECHA_NACIMIENTO,ROL";
	
	public Oficina() {
		super();
	}
	
	public Oficina(String ubicacion, String codigoOficina) {
		this.ubicacion=ubicacion;
		this.codigoOficina=codigoOficina;
		departamentos=new ArrayList<>();
	}
	
	
	public void addDepartamento(Departamento departamento) throws DepartamentoException {		
		
		if (!this.departamentos.add(departamento)) {
			throw new DepartamentoException("Ya existe ese departamento");
		}
	}
	
	
	public Collection<String> obtenerEmpleadosConNombre(String nombre){
		List<String> output = new ArrayList<>();
		for(Departamento dept: this.departamentos) {
			output.addAll(dept.obtenerEmpleadosConNombre(nombre));
		}
		
		return output;
	}
	
	public List<String> obtenerEmpleadosPorDepartamentoYRol(){
		List<Departamento> tmp1 = new ArrayList<>(this.departamentos);
		tmp1.sort(new ComparatorCodigoDepartamento());
		List<String> output = new ArrayList<>();
		
		for(Departamento dept : this.departamentos) {
			output.addAll(dept.obtenerEmpleadosOrdenadoPorRol());
		}
		
		
		return output;
	}

	public void cargarDepartamentos(String rutaArchivo) {
		File fichero =  new File(rutaArchivo);
		
		
		try {
			Scanner lector = new Scanner(fichero);
			lector.nextLine(); //me salto la cabecera
			while(lector.hasNext()) {
				String[] datos = lector.nextLine().split(",");
				if (datos.length == 5) {
					if(!this.departamentos.contains(new Departamento(datos[0]))) {
						this.departamentos.add(new Departamento(datos[0]));
						
					}
					this.departamentos.get(this.departamentos.indexOf(new Departamento(datos[0]))).addEmpleado(new Empleado(datos[1], datos[2], datos[3], Rol.valueOf(datos[4])));
					
				}

			}
			lector.close();
			
		} catch (FileNotFoundException | DepartamentoException e) {
			e.printStackTrace();
		} 
		
		
		
		
	}
	
	public void guardarDepartamentos(String rutaArchivo) throws FileNotFoundException {
		String ruta = rutaArchivo +"\\"+this.codigoOficina+".csv";
		File fichero = new File(ruta);
		PrintWriter printer = new PrintWriter(fichero);
		printer.println(CABECERA);
		for(Departamento dept : this.departamentos) {
			printer.println(dept.toString());
		}
		printer.close();
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

}
