package Boletin_08.Ejercicio_07;

public class GranAlmacen {

	private Caja[] cajas;
	private static final int NUMERO_DE_CAJAS = 20;

	public GranAlmacen() {
		this.cajas = new Caja[NUMERO_DE_CAJAS];
		this.preprarCajas();
		this.cajas[0].abrirCaja(); // Doy por hecho que para que este operativo debe tener al menos una caja
	}

	private void preprarCajas() {
		for (int i = 0; i < NUMERO_DE_CAJAS; i++) {
			this.cajas[i] = new Caja();
		}
	}

	private int getMejorCaja() {

		/**
		 * En caso de que no haya ninguna caja disponible, delvolvera un -1, en caso
		 * contrario, devolvera el numero de la caja con la menor cola y en caso de
		 * empate, la que tenga un numero mejor
		 * 
		 */
		int menor = Integer.MAX_VALUE;
		int resultado = -1;

		for (int i = 0; i < NUMERO_DE_CAJAS; i++) { // poniendo que sea estrictamente mayor y empezando desde los
													// numeros mas bajos me aseguro de, en caso de empate, se quede la
													// que tiene el numero menor
			if (this.cajas[i].isAbierto() && this.cajas[i].getTamagnoCola() < menor) {
				menor = this.cajas[i].getTamagnoCola();
				resultado = i;
			}
		}

		return resultado;
	}

	public void abrirCaja(int nCaja) throws CajaException {
		if (nCaja > 0 && nCaja < NUMERO_DE_CAJAS && !this.cajas[nCaja].isAbierto()) {
			this.cajas[nCaja].abrirCaja();
		} else {
			throw new CajaException("La caja ya esta abierta");
		}
	}

	public Cliente nuevoCliente() throws GranAlmacenException {
		int posRecomendada = getMejorCaja();
		Cliente tmp;
		if (posRecomendada != Integer.MAX_VALUE) {
			tmp = new Cliente(posRecomendada);
			this.cajas[posRecomendada].nuevoCliente(tmp);
			;
		} else {
			throw new GranAlmacenException("No se ha podido asignar el cliente a una cola");
		}
		return tmp;
	}

	public String atenderCliente(int nCaja) throws CajaException {
		String resultado;
		if (nCaja >= 0 && nCaja < NUMERO_DE_CAJAS && this.cajas[nCaja].isAbierto()
				&& this.cajas[nCaja].getTamagnoCola() != 0) {
			resultado = "Se ha atendido al cliente" + this.cajas[nCaja].getSiguienteCliente().getnCaja();
			this.cajas[nCaja].clienteAtendido();
		} else {
			throw new CajaException("La caja seleccionada no existe, no tiene clientes o no esta abierta");
		}
		return resultado;
	}
}
