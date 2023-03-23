package TEST;

public class Persona implements Comparable<Persona>{
	private String nombre;
	@Override
	/**
	 * Como String tienw su propio compare, asi que podemos usar eso
	 * En caso que no tenga su propio compare to ya implementado hay que implementar tu propia comapracion dando 3 tipos de valores
	 * negativo 0 positivo
	 * 0 en caso que sean iguales y positivo o negativo segun cual de las dos entradas sea el mayor, si el primero o el segundo  
	 */
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.nombre);  //Como string tiene su propio compare tu tu puedes usar eso, 
	}

	
}
