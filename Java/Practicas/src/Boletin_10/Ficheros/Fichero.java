package Boletin_10.Ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;

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
	
	public Fichero(String path) throws IOException {
		//usar files para la fecha y el usuario
		this.fich = new File(path);
		if(fich.exists()) {
			this.permisoLeer = this.fich.canRead();
			this.ruta = this.fich.getAbsolutePath();
			this.nombre = this.fich.getName();
			this.extension = generaExtension(this.nombre);
			this.ficherosHijos = (this.fich.isDirectory()? generaFicherosHijos(this.fich): "No es una carpeta");
			this.directoriosHijos = (this.fich.isDirectory()? generaDirectioriosHijos(this.fich): "No es una carpeta");
			this.tamagno = this.fich.length();
			this.fechaCreacion = Files.readAttributes(fich.toPath(), BasicFileAttributes.class).creationTime();
			this.usuario = Files.getFileAttributeView(fich.toPath(), FileOwnerAttributeView.class).name();
			
		}
	}
	
	
	private static String generaExtension(String nombreCompleto) {
		String[] tmp = nombreCompleto.split(".");
		String resultado = "";
		if(tmp.length>0) {
			resultado = tmp[tmp.length-1];
		}
		
		return resultado;
	}
	
	private static String generaFicherosHijos(File fichero) {
		StringBuilder resultado = new StringBuilder();
		for (File tmp : fichero.listFiles()) {
			if (tmp.isFile()) {
				resultado.append(tmp.getName()).append(" + ");
			}
		}
		return resultado.toString();
	}

	
	private static String generaDirectioriosHijos(File fichero) {
		StringBuilder resultado = new StringBuilder();
		for (File tmp : fichero.listFiles()) {
			if (tmp.isDirectory()) {
				resultado.append(tmp.getName()).append(" + ");
			}
		}
		return resultado.toString();
	}


	@Override
	public String toString() {
		return "Fichero [permisoLeer=" + permisoLeer + ", ruta=" + ruta + ", nombre=" + nombre + ", extension="
				+ extension + ", directoriosHijos=" + directoriosHijos + ", ficherosHijos=" + ficherosHijos
				+ ", tamagno=" + tamagno + ", usuario=" + usuario + ", fechaCreacion=" + fechaCreacion + ", fich="
				+ fich + "]";
	}
	
	
	
	
	
}
