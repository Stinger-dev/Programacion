package main.java.xml.writer;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import main.java.model.Estudiante;

public class EscritorXML {

	public static void escribirDatos(List<Estudiante> estudiantes, String rutaFichero) {
		
		
		
		try {
			//1
			Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
			//2 Creamos estructura		
			Element nodoRaiz = documento.createElement("estudiantes");			
			documento.appendChild(nodoRaiz);		
			
			for (Estudiante estu : estudiantes) {
				Element nodoHijo = documento.createElement("estudiante");
				nodoRaiz.appendChild(nodoHijo);
				

				nodoHijo.setAttribute("identificador", String.valueOf(estu.getId())); 
					
					Element nombre = documento.createElement("nombre");
					nombre.appendChild(documento.createTextNode(estu.getNombre()));
					nodoHijo.appendChild(nombre);
					
					Element apellido = documento.createElement("apellido");
					apellido.appendChild(documento.createTextNode(estu.getApellidos()));
					nodoHijo.appendChild(apellido);
					
					Element fechaNacimiento = documento.createElement("fechaNacimiento");
					fechaNacimiento.appendChild(documento.createTextNode(estu.getFechaNacimiento()));
					nodoHijo.appendChild(fechaNacimiento);
					
					
					Element genero = documento.createElement("genero");
					genero.appendChild(documento.createTextNode(estu.getGenero().toString()));
					nodoHijo.appendChild(genero);	
					
				
			}
				

			
			
			//3 Volcamos a fichero		
			Transformer optimus = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(documento);
			StreamResult result = new StreamResult(new File(rutaFichero));
			
			
			optimus.setOutputProperty(OutputKeys.INDENT, "yes");
			optimus.transform(source, result);//Esto es lo que lo crea
			
			
			
			
		} catch (ParserConfigurationException | TransformerException | TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
		
	}
}