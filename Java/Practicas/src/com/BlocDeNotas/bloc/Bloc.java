package com.BlocDeNotas.bloc;

import java.util.Arrays;
import java.util.Objects;

import com.BlocDeNotas.notas.CompararDefaultNotas;
import com.BlocDeNotas.notas.Nota;
import com.BlocDeNotas.notas.NotaAlarma;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMAS = 10;
	private int numNotas;
	private String nombre;

	private Nota[] notas;

	public Bloc(String nombre) {
		this.nombre = nombre;
		this.numNotas = 0;
		this.notas = new Nota[NUMERO_NOTAS_MAXIMAS];
	}

	public String getNota(int pos) throws BlocException {
		String resultado = "";
		if (this.notas[pos] != null) {
			resultado = this.notas[pos].toString();
		} else {
			throw new BlocException("No se ha encontrado");
		}
		return resultado;
	}

	public void updateNota(int pos, String newText) throws BlocException {
		if (this.notas[pos] != null) {
			this.notas[pos].setTexto(newText);
		} else {
			throw new BlocException("No se ha encontrado");
		}
	}

	public void activa(int pos) throws BlocException {
		if (this.notas[pos] != null && this.notas[pos] instanceof NotaAlarma) {
			NotaAlarma tmp = (NotaAlarma) this.notas[pos];
			tmp.activar();
			this.notas[pos] = tmp;

		} else {
			throw new BlocException("No se ha encontrado una alarma");
		}
	}

	public void desactiva(int pos) throws BlocException {
		if (this.notas[pos] != null && this.notas[pos] instanceof NotaAlarma) {
			NotaAlarma tmp = (NotaAlarma) this.notas[pos];
			tmp.desactivar();
			this.notas[pos] = tmp;

		} else {
			throw new BlocException("No se ha encontrado una alarma");
		}
	}

	public static int getNumeroNotasMaximas() {
		return NUMERO_NOTAS_MAXIMAS;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(nombre, numNotas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Bloc) {
			Bloc casteado = (Bloc) obj;
			esIgual = this.nombre.equals(casteado.nombre);
		}
		return esIgual;
	}

	public String toString() {
		StringBuilder resultado = new StringBuilder();
		Arrays.sort(this.notas, new CompararDefaultNotas());
		for (Nota tmp2 : this.notas) {
			if (tmp2 != null) {
				resultado.append(tmp2.toString()).append("\n").append("---------").append("\n");
			}
		}
		return resultado.toString();
	}

	public void addNote(String text) throws BlocException {
		Arrays.sort(this.notas, new CompararDefaultNotas());
		if (text != null && !text.trim().isEmpty() && this.notas[NUMERO_NOTAS_MAXIMAS - 1] == null) {
			notas[this.numNotas++] = new Nota(text);
		} else {
			throw new BlocException("No hay espacio o el texto es no valido");
		}
	}

	public void rmNote(int pos) throws BlocException {
		if (pos > 0 && pos < NUMERO_NOTAS_MAXIMAS && this.notas[pos] != null) {
			this.notas[pos] = null;
			this.numNotas--;
		} else {
			throw new BlocException("Posicion no valida o no existe la nota");
		}
	}

}
