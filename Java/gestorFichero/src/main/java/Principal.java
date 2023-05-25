package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import main.java.Json.JSONManager;
import main.java.model.Caseta;
import main.java.model.Clase;
import main.java.xml.reader.LectorXml;
import main.java.xml.writer.EscritorXML;

public class Principal {
	public static void main(String[] args) {
		
		JSONManager manager = new JSONManager();
		
		manager.escribirColleccion(LectorXml.cargarDatos("./files/casetasferia.xml"), "./files/casetasferia.json");
		
		
		EscritorXML.escribirDatos(LectorXml.cargarDatos("./files/casetasferia.xml"), "./files/nuevas_casetas.xml");
		mostrarTodasCasetasFamiliarPorCalle(LectorXml.cargarDatos("./files/casetasferia.xml"));
	}
	
	public static String mostrarTodasCasetas(List<Caseta> casetas) {
		StringBuilder output = new StringBuilder();
		for(Caseta seta : casetas) {
			output.append(seta.toString()).append("\n");
		}
		
		return output.toString();
	}
	
	public static String mostrarTodasCasetasCalle(List<Caseta> casetas, String calle) {
		StringBuilder output = new StringBuilder();
		for(Caseta seta : casetas) {
			if(seta.getCalle().equals(calle)) {
				output.append(seta.toString()).append("\n");	
			}
		}
		return output.toString();
	}
	
	public static String mostrarTodasCasetasFamiliar(List<Caseta> casetas) {
		StringBuilder output = new StringBuilder();
		for(Caseta seta : casetas) {
			if(seta.getClase().equals(Clase.FAMILIAR)) {
				output.append(seta.toString()).append("\n");	
			}
		}
		return output.toString();
	}
	
	
	public static String mostrarTodasCasetasNoFamiliarNiDistrito(List<Caseta> casetas) {
		StringBuilder output = new StringBuilder();
		for(Caseta seta : casetas) {
			if(!seta.getClase().equals(Clase.FAMILIAR) && !seta.getClase().equals(Clase.DISTRITO)) {
				output.append(seta.toString()).append("\n");	
			}
		}
		return output.toString();
	}
	
	
	
	public static String mostrarTodasCasetasFamiliarPorCalle(List<Caseta> casetas) {
		StringBuilder output = new StringBuilder();	
		Map<String, List<Caseta>>  ordenarPorCAlle= new HashMap<>();
		
		for(Caseta seta : casetas) {
			if(seta.getClase().equals(Clase.FAMILIAR)) {
				if(!ordenarPorCAlle.containsKey(seta.getCalle())) {
					ordenarPorCAlle.put(seta.getCalle(), new ArrayList<>());
				}
				ordenarPorCAlle.get(seta.getCalle()).add(seta);		
			}	
		}
		
		return output.toString();
	}
	
	public static String mostrarTodasCasetasDistritoPorCalle(List<Caseta> casetas) {
		StringBuilder output = new StringBuilder();	
		Map<String, List<Caseta>>  ordenarPorCAlle= new HashMap<>();
		
		for(Caseta seta : casetas) {
			if(seta.getClase().equals(Clase.DISTRITO)) {
				if(!ordenarPorCAlle.containsKey(seta.getCalle())) {
					ordenarPorCAlle.put(seta.	getCalle(), new ArrayList<>());
				}
				ordenarPorCAlle.get(seta.getCalle()).add(seta);		
			}	
		}
		
		for(String seta: ordenarPorCAlle.keySet()) {
			output.append(seta).append(":\n").append(mostrarTodasCasetas(ordenarPorCAlle.get(seta))).append("\n");
		}

		
		return output.toString();
	}
	
	public static void borrarcaseta(List<Caseta> casetas, Caseta casetaABorrar) throws Exception {
		
		if(!casetas.contains(casetaABorrar)) {
			throw new Exception("No existe la caseta");
		}
		
		Map<String, List<Caseta>>  ordenarPorCAlle= new HashMap<>();
		
		for(Caseta seta : casetas) {
			if(seta.getClase().equals(Clase.DISTRITO)) {
				if(!ordenarPorCAlle.containsKey(seta.getCalle())) {
					ordenarPorCAlle.put(seta.	getCalle(), new ArrayList<>());
				}
				ordenarPorCAlle.get(seta.getCalle()).add(seta);		
			}	
		}
		
		double numeroCasetaBorrada = casetaABorrar.getIdCalle();
		double modulos = casetaABorrar.getModulos();
		
		for (Caseta seta : ordenarPorCAlle.get(casetaABorrar.getCalle())) {
			if(seta.getIdCalle()> numeroCasetaBorrada) {
				seta.setIdCalle(seta.getIdCalle()-modulos);
			}
		}

		
	}
	
	
	

}
