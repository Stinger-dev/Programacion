package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Estudiante;
import main.java.xml.reader.LectorXml;
import main.java.xml.writer.EscritorXML;

public class Principal {

	public static void main(String[] args) {
		List<Estudiante> estudiantes = new ArrayList<>();
		for(Estudiante est : LectorXml.cargarDatos("./files/estudiantes.xml")) {
			estudiantes.add(est);
		}
		System.out.println(estudiantes.toString());
		
		EscritorXML.escribirDatos(estudiantes, "./files/nuevo_fichero_estudiantes.xml");
	}
	
	
}
