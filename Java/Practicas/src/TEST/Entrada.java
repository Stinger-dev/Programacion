package TEST;

public class Entrada<K, V extends Number> {

	private K clave;
	private V valor;

	public Entrada(K clave, V valor) {
		this.valor = valor;
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Entrada [clave=" + clave + ", valor=" + valor + "]";
	}

}
