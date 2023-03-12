package Boletin_06.Ejercicio_08;

import java.util.Arrays;

public class Refranes {
	private Refran[] refranes = new Refran[5];
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
			k ++; 
		}
		if (!yaEsta && k+1<=50) {
			this.contador++;
			this.refranes[k] = refran;
			exito = true;
			
		}
		return exito;
	}
	
	

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("");
		for (Refran ob: refranes) {
			resultado.append(ob.toString());
			resultado.append("\n");
		}
		return resultado.toString();
	}
	
	
	
	
	

}
