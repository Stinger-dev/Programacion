package main;

import java.io.FileNotFoundException;
import java.time.LocalDate;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.google.gson.GsonBuilder;

import JSONManager.JsonWritterReader;
import XMLManager.Writter;
import main.model.Departamento;
import main.model.Empleado;
import main.model.Oficina;
import main.model.Rol;
import main.model.exceptions.DepartamentoException;

public class Principal {

	public static void main(String[] args) {
		try {
			Oficina ofi = cargarDatosMuestra();
			
			ofi.guardarDepartamentos("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\ExamenFicheros\\assets");
			ofi.cargarDepartamentos("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\ExamenFicheros\\assets\\Departamento.csv");
			System.out.println(ofi.obtenerEmpleadosConNombre("a"));
			
			try {
				Writter.escribirXMl("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\ExamenFicheros\\assets\\new.xml", JsonWritterReader.cargarDepartamento("C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\ExamenFicheros\\assets\\oficina.json"));
			} catch (ParserConfigurationException | TransformerFactoryConfigurationError | TransformerException e) {
				e.printStackTrace();
			}
		} catch (DepartamentoException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Este método crea una oficina con dos departamentos y 4 empleados cada uno: un jefe de departamento
	//un analista y dos programadores
	private static Oficina cargarDatosMuestra() throws DepartamentoException {
		Oficina oficina = new Oficina("Sevilla", "STI1");
		String[] nombres = {"Ernesto Echevarne", "Rodrigo Rodríguez", "Melania Maldívar", "Jacinto Jiménez", 
							"Gabino Gámez", "Lucrecia Lusa", "Carla Costa", "Fernanda Fernández"};
		int codigo = 1;
		LocalDate fechaBase = LocalDate.now().minusYears(40);
		for(int i =0; i<2; i++) {
			Departamento departamento = new Departamento("SEVDEPT_"+(i+1));
			
			departamento.addEmpleado(new Empleado(nombres[i*(nombres.length/2)], "SEVEMP_"+codigo++, fechaBase.plusYears(i*20).toString(), Rol.JEFE_DEPARTAMENTO));
			departamento.addEmpleado(new Empleado(nombres[i*(nombres.length/2)+1], "SEVEMP_"+codigo++, fechaBase.plusYears(i*20-6).toString(), Rol.ANALISTA));
			departamento.addEmpleado(new Empleado(nombres[i*(nombres.length/2)+2], "SEVEMP_"+codigo++, fechaBase.plusYears(i*20-10).toString(), Rol.PROGRAMADOR));
			departamento.addEmpleado(new Empleado(nombres[i*(nombres.length/2)+3], "SEVEMP_"+codigo++, fechaBase.plusYears(i*20-12).toString(), Rol.PROGRAMADOR));
			oficina.addDepartamento(departamento);
			
		}
		
		
		return oficina;
	}

}





