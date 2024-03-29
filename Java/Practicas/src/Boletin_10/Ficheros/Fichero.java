package Boletin_10.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;

public class Fichero {

	private boolean permisoLeer;
	private String ruta;
	private String nombre;
	private String extension;
	private String directoriosHijos;
	private String ficherosHijos;
	private long tamagno;
	private String usuario;
	private FileTime fechaCreacion;

	private File fich;

	public Fichero(String path) throws Exception {
		// usar files para la fecha y el usuario 
		
		this.fich = new File(path);
		if (fich.exists()) {
			this.permisoLeer = this.fich.canRead();
			this.ruta = this.fich.getAbsolutePath();
			this.nombre = this.fich.getName();
			this.extension = (!this.fich.isDirectory() ? generaExtension(this.nombre) : "Es una carpeta");
			this.ficherosHijos = (this.fich.isDirectory() ? generaFicherosHijos(this.fich) : "No es una carpeta");
			this.directoriosHijos = (this.fich.isDirectory() ? generaDirectioriosHijos(this.fich)
					: "No es una carpeta");
			this.tamagno = this.fich.length();
			this.fechaCreacion = Files.readAttributes(fich.toPath(), BasicFileAttributes.class).creationTime();
			this.usuario = Files.getFileAttributeView(fich.toPath(), FileOwnerAttributeView.class).name();
		} else {
			throw new Exception("No se ha podido encontrar");
		}
	}


	private static String generaExtension(String nombreCompleto) {
		return nombreCompleto.substring(nombreCompleto.lastIndexOf('.'));
	}

	private static String generaFicherosHijos(File fichero) {
		StringBuilder resultado = new StringBuilder();
		for (File tmp : fichero.listFiles()) { // El spotbugs avisa de que podria fallar en caso de que sea una carpeta,
												// pero eso estaba ya contemplado en el ternario del metodo
			if (tmp.isFile()) {
				resultado.append(tmp.getName()).append(" + ");
			}
		}
		return resultado.toString();
	}

	private static String generaDirectioriosHijos(File fichero) {
		StringBuilder resultado = new StringBuilder();
		for (File tmp : fichero.listFiles()) { // El spotbugs avisa de que podria fallar en caso de que sea una carpeta,
												// pero eso estaba ya contemplado en el ternario del metodo
			if (tmp.isDirectory()) {
				resultado.append(tmp.getName()).append(" + ");
			}
		}
		return resultado.toString();
	}

	@Override
	public String toString() {
		return String.format("""
				Nombre archivo: %s
						Ruta del archivo: %s
						Extension: %s
						Puede escribirse: %s
						Directorios hijos: %s
						Ficheros hijos: %s
						Tamaño: %s
						Usuario: %s
						Fecha Creacion: %s
					""", this.nombre, this.ruta, this.extension, this.permisoLeer, this.directoriosHijos,
				this.ficherosHijos, this.tamagno, this.usuario, this.fechaCreacion);
	}
	
	
	
	public String getTexto() {
		StringBuilder resultado = new StringBuilder();
		Scanner lector = null;
		try {
			lector = new Scanner(fich);
			while (lector.hasNextLine()) {
				resultado.append(lector.nextLine()).append(System.lineSeparator());
			}
			lector.close();
		} catch (FileNotFoundException e) {
			resultado.append("No se ha podido leer, quiza es una carpeta");
		}
		return resultado.toString();
	}
	
	public String getTexto2() {
		StringBuilder resultado = new StringBuilder();
		try {
			FileReader reader = new FileReader(fich);
			BufferedReader buffer = new BufferedReader(reader);
			String linea = buffer.readLine();
			
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			
		} catch (Exception e) {
			resultado.append("No se ha podido leer, quiza es una carpeta");
		}
		return resultado.toString();
	}

}
