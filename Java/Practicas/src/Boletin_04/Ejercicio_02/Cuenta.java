package Boletin_04.Ejercicio_02;

public class Cuenta {

	private double saldo;
	private int nReintegro; // Contador de cuantas veces se hace cada cosa
	private int nIngresos;

	public Cuenta() {

		super();
		this.saldo = 0;
		this.nReintegro = 0;
		this.nIngresos = 0;
	}

	public Cuenta(double saldo) {
		this();
		this.saldo = saldo;
	}

	public void ingreso(double ingreso) {
		if (ingreso > 0) {
			this.saldo += ingreso;
			nIngresos++;
		}
	}

	public void reintegro(double cantidad) {
		if (cantidad < saldo) {
			this.saldo -= cantidad;
			nReintegro++;
		}
	}

	@Override
	public String toString() {
		return "Saldo=" + saldo + ", Numero de reintegro=" + nReintegro + ", Numero de ingresos=" + nIngresos;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
