package Boletin_06.Ejercicio_08;

public class Refranes {
	private Refran[] refranes = new Refran[50];
	private int contador;

	public Refranes() {
		super();
		this.contador = 0;
	}

	public boolean guardarRefran(Refran refran) {
		boolean yaEsta = false, exito = false;
		int k = 0;
		for (int i = 0; i < contador && !yaEsta; i++) {
			yaEsta = this.refranes[i].equals(refran);
			k++;
		}
		if (!yaEsta && k + 1 <= 50) {
			this.contador++;
			this.refranes[k] = refran;
			exito = true;

		}
		return exito;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("");

		for (int i = 0; i < this.contador; i++) {
			resultado.append(this.refranes[i].toString());
			resultado.append("\n");
		}
		return resultado.toString();
	}

	public int buscarPorPalabra(String palabra) {
		int k = -1;
		for (int i = 0; i < this.refranes.length && k == -1; i++) {
			if (this.refranes[i].estaPalabra(palabra)) {
				k = i;
			}
		}
		return k;
	}

	public Refran getRefranParticular(int k) {
		return this.refranes[k];
	}

}
