package XMLManager;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import main.model.Departamento;
import main.model.Empleado;
import main.model.Oficina;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Writter {

	public static void escribirXMl(String url, Oficina ofi) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		Document documento = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();
		
		Element raiz = documento.createElement("oficina");
		documento.appendChild(raiz);
		
		for(Departamento dept : ofi.getDepartamentos()) {
			Element hijo = documento.createElement("departamento");
			raiz.appendChild(hijo);
			
			Attr atributo = documento.createAttribute("idDepartamento");
			atributo.setValue(dept.getCodigoDepartamento());
			hijo.setAttributeNode(atributo);
			
			
			
			
			Element empleados = documento.createElement("empleados");
			hijo.appendChild(empleados);
			
			for(Empleado emp : dept.getEmpleados()) {
				Element empleado = documento.createElement("empleado");
				empleados.appendChild(empleado);
				
				Element nombreCompleto = documento.createElement("nombreCompleto");
				nombreCompleto.appendChild(documento.createTextNode(emp.getNombreCompleto()));
				empleados.appendChild(nombreCompleto);
				
				Element fechaNacimiento = documento.createElement("fechaNacimiento");
				fechaNacimiento.appendChild(documento.createTextNode(emp.getFechaNacimiento()));
				empleados.appendChild(fechaNacimiento);
				
				Element rol = documento.createElement("rol");
				rol.appendChild(documento.createTextNode(emp.getRol().toString()));
				empleados.appendChild(rol);
				
				Element codigoEmpleado = documento.createElement("codigoEmpleado");
				codigoEmpleado.appendChild(documento.createTextNode(emp.getCodigoEmpleado()));
				empleados.appendChild(codigoEmpleado);		
			}			
		}
		
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(new DOMSource(documento), new StreamResult(new File(url)));
		
	}
}
