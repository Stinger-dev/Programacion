package Boletin_08.Ejercicio_07;

public class Cliente {
	private static int numeroCliente = 0;
	private int numeroPropio;
	private int nCaja;
	
	
	public Cliente(int nCaja) {
		this.numeroPropio = ++numeroCliente;
		this.nCaja = nCaja;
	}
	
	public int getnCaja() {
		return nCaja;
	}
	
	
	@Override
	public String toString() {
		return String.format("Es usted el cliente número %s y debe ir a la caja número %s", this.numeroPropio, this.nCaja);
	}

}
