package Boletin_08.Ejercicio_06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Palabra {
	
	private String pala;
	private Set<String>  significados ;
	
	public Palabra(String palabra) {
		this.pala = palabra;
		this.significados = new HashSet<>();
		
	}
	public Palabra(String palabra, String significado) {
		this(palabra);
		this.addSignificado(significado);
	}
	
	public void addSignificado(String significado) {
		this.significados.add(significado);
	}
	
	public String getPalabra() {
		return pala;
	}
	
	public Set<String> getSignificados() {
		return significados;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append(pala).append(":\n");
		
		this.significados.forEach(tmp -> resultado.append("   ").append(tmp).append("\n"));
		return resultado.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(pala.toLowerCase()); //esto es como si ignorara las mayusculas para el hash, creo
	}
	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Palabra) {
			Palabra casteado = (Palabra) obj;

			esIgual = this.pala.equalsIgnoreCase(casteado.pala);
		}
		return esIgual;
	}

	
	
}
