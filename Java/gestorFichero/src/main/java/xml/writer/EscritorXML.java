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

import main.java.model.Caseta;


public class EscritorXML {

	public static void escribirDatos(List<Caseta> casetas, String rutaFichero) {
		
		
		
		try {
			//1
			Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
			//2 Creamos estructura, esta es la parte que cambia en cada ejercicio
			
			Element nodoRaiz = documento.createElement("casetas");			
			documento.appendChild(nodoRaiz);	 //El nodo raiz va fuera del bucle	
			
			for (Caseta caset : casetas) {
				
				Element nodoHijo = documento.createElement("caseta");
				nodoRaiz.appendChild(nodoHijo);
				
				nodoHijo.setAttribute("id", String.valueOf(caset.getId())); 
				nodoHijo.setAttribute("idCalle", String.valueOf(caset.getIdCalle())); 
					
					Element titulo = documento.createElement("titulo");
					titulo.appendChild(documento.createTextNode(caset.getTitulo()));
					nodoHijo.appendChild(titulo);
					
					Element calle = documento.createElement("calle");
					calle.appendChild(documento.createTextNode(caset.getCalle()));
					nodoHijo.appendChild(calle);
					
					Element numero = documento.createElement("numero");
					numero.appendChild(documento.createTextNode(String.valueOf(caset.getNumero())));
					nodoHijo.appendChild(numero);
					
					Element modulos = documento.createElement("modulos");
					modulos.appendChild(documento.createTextNode(String.valueOf(caset.getModulos())));
					nodoHijo.appendChild(modulos);
					
					Element clase = documento.createElement("clase");
					clase.appendChild(documento.createTextNode(caset.getClase().toString()));
					nodoHijo.appendChild(clase);
					
					Element entidad = documento.createElement("entidad");
					entidad.appendChild(documento.createTextNode(caset.getEntidad()));
					nodoHijo.appendChild(entidad);
					
				
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