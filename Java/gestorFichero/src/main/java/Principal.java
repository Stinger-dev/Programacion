package main.java;

import main.java.Json.JSONManager;
import main.java.xml.reader.LectorXml;
import main.java.xml.writer.EscritorXML;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println(LectorXml.cargarDatos("./files/casetasferia.xml").toString());
		
		JSONManager manager = new JSONManager();
		
		manager.escribirColleccion(LectorXml.cargarDatos("./files/casetasferia.xml"), "./files/casetasferia.json");
		
		
		EscritorXML.escribirDatos(LectorXml.cargarDatos("./files/casetasferia.xml"), "./files/nuevas_casetas.xml");
	}

}
