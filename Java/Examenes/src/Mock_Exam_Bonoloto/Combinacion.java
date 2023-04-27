package Mock_Exam_Bonoloto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Combinacion {
	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	private Set<Integer> numeros;
	private Set<Integer> estrellas;

	public Combinacion(int n1, int n2, int n3, int n4, int n5, int e1, int e2) throws CombinacionExeption {
		/**
		 * De n1 a n5 son los numeros y de e1 a e2 son las estrellas
		 */
		this(new int[] {n1, n2, n3, n4, n5}, new int[] {e1,e2});
		
	}

	/*
	 * Esto no es util pq encontre otra forma de hacerlo, pero es util
	private static int[] arrayVariable(int ... a) {
		return a;
	}
	*/

	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionExeption {
		
		this.numeros = new HashSet<>();
		this.estrellas = new HashSet<>();

		for (int n : numeros) {
			this.numeros.add(n);
		}
		for (int n : estrellas) {
			this.estrellas.add(n);
		}
		if (!this.validarNumeros()) {
			throw new CombinacionExeption("Valores de numeros no validos");
		}

		if (!this.validarEstrellas()) {
			throw new CombinacionExeption("Valores de estrellas no validos");
		}
		
		

	}

	private boolean validarNumeros() {
		boolean validoNumeros = this.numeros.size() == TOTAL_NUMEROS;
		if (validoNumeros) {
			for (Integer tmp : this.numeros) {
				if (tmp < VALOR_MINIMO || tmp > VALOR_MAXIMO_NUMEROS) {
					validoNumeros = false;
				}
			}
		}
		return validoNumeros;
	}

	private boolean validarEstrellas() {
		boolean validoEstrellas = this.estrellas.size() == TOTAL_ESTRELLAS;
		if (validoEstrellas) {
			for (Integer tmp : this.estrellas) {
				if (tmp < VALOR_MINIMO || tmp > VALOR_MAXIMO_ESTRELLAS) {
					validoEstrellas = false;
				}
			}
		}
		return validoEstrellas;
	}

	public Set<Integer> getNumeros() {
		return this.numeros;
	}
	
	public Set<Integer> getEstrellas() {
		return this.estrellas;
	}
	
	public int comprobarCombinacion(Combinacion ob1) {
		int resultado = 0;
		if(ob1 != null) {
			Set<Integer> numerostmp = new HashSet<>(this.numeros) ;
			Set<Integer> estrellastmp = new HashSet<>(this.estrellas);
			numerostmp.retainAll(ob1.getNumeros());
			estrellastmp.retainAll(ob1.getEstrellas());
			resultado =  numerostmp.size()+estrellastmp.size();	
		}
		return resultado;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Combinacion) {
			Combinacion casteado = (Combinacion) obj;

			esIgual = this.numeros.equals(casteado.numeros) && this.estrellas.equals(casteado.estrellas);
		}
		return esIgual;
	}

	@Override
	public String toString() {
		Integer[] tmp = this.numeros.toArray(new Integer[0]), tmp2 = this.estrellas.toArray(new Integer[0]);
		//Creo que lo que se hace es iterar por cada una de las cosas del array y meterlo dentro 
		Arrays.sort(tmp);
		Arrays.sort(tmp2);

		return String.format("Numeros: %s - Estrellas: %s %n", Arrays.toString(tmp), Arrays.toString(tmp2));
	} 

}
