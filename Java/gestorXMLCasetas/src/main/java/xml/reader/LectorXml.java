package main.java.xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.java.model.Caseta;
import main.java.model.Clase;



public class LectorXml {
	
	public static List<Caseta> cargarDatos(String ruta) {
		List<Caseta> casetas = new ArrayList<>();
		File fichero = new File(ruta);
		try {
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();	
			 
			NodeList hijos = documento.getElementsByTagName("DatosLeidos");
			
			for (int i = 0; i< hijos.getLength(); i++) {
				Element hijo = (Element)hijos.item(i);
				
				String titulo = "-";
				try {
					titulo = hijo.getElementsByTagName("TITULO").item(0).getTextContent();
				} catch (NullPointerException e) {
					//No existe esa categoria
				}
				
				String calle = "-";
				try {
					calle = hijo.getElementsByTagName("CALLE").item(0).getTextContent();
				} catch (NullPointerException e) {
					//No existe esa categoria

				}
				
				String clase = null;
				try {
					clase = hijo.getElementsByTagName("CLASE").item(0).getTextContent();
				} catch (NullPointerException e) {
					//No existe esa categoria

				}
				
				String entidad = "-";
				try {
					entidad = hijo.getElementsByTagName("ENTIDAD").item(0).getTextContent();
				} catch (NullPointerException e) {
					//No existe esa categoria
				}				
				
				double numero = -1;
				try {
					numero = Double.valueOf(hijo.getElementsByTagName("NUMERO").item(0).getTextContent()) ;
				} catch (NullPointerException e) {
					//No existe esa categoria
				} 
				
				double modulos = -1;
				try {
					numero = Double.valueOf(hijo.getElementsByTagName("MODULOS").item(0).getTextContent()) ;
				} catch (NullPointerException e) {
					//No existe esa categoria

				} 
				
				double id = -1;
				try {
					numero = Double.valueOf(hijo.getElementsByTagName("ID").item(0).getTextContent()) ;
				} catch (NullPointerException e) {
					//No existe esa categoria

				} 
				
				double idCalle = -1;
				try {
					numero = Double.valueOf(hijo.getElementsByTagName("ID_CALLE").item(0).getTextContent()) ;
				} catch (NullPointerException e) {
					//No existe esa categoria

				} 

				casetas.add(new Caseta(titulo, calle, numero, modulos, Clase.valueOf(clase), entidad, id, idCalle));
			}
			

		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		return casetas;
	}
	

}
