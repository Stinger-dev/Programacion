package Boletin_07.Ejercicio_02;

import java.time.LocalDateTime;

import Boletin_07.Ejercicio_02.Enumerates.Combustibles;
import Boletin_07.Ejercicio_02.Enumerates.TipoVehiculo;
import Boletin_07.Ejercicio_02.Excepciones.MatriculaIncorrecta;

public class Vehiculo implements Comparable<Vehiculo> {

	private String marca;
	private String modelo;
	private String matricula;
	private Combustibles combustible;
	private LocalDateTime entrada;
	private TipoVehiculo tipoVehiculo;

	public Vehiculo(String marca, String modelo, String matricula, Combustibles combustible, LocalDateTime entrada,
			TipoVehiculo tipoVehiculo) throws MatriculaIncorrecta {
		super();
		this.marca = marca;
		this.modelo = modelo;
		setMatricula(matricula);
		this.combustible = combustible;
		this.entrada = entrada;
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setMatricula(String matricula) throws MatriculaIncorrecta {
		int contadorNumeros = 0;
		if (matricula.length() <= 8) {
			for (char n : matricula.toCharArray()) {
				if (Character.isDigit(n)) {
					contadorNumeros++;
				}
			}
		}
		if (contadorNumeros != 4) { // Numero de digitos de la matricula
			throw new MatriculaIncorrecta();
		}
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public Combustibles getCombustible() {
		return combustible;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public int compareMarcaModelo(Vehiculo v) {
		return (this.marca.compareTo(v.getMarca()) == 0) ? this.modelo.compareTo(v.getModelo())
				: this.marca.compareTo(v.getMarca());
	}

	public int compareTipoCombustible(Vehiculo v) {
		return (this.tipoVehiculo.compareTo(v.getTipoVehiculo()) == 0) ? this.combustible.compareTo(v.getCombustible())
				: this.tipoVehiculo.compareTo(v.getTipoVehiculo());
	}

	@Override
	public int compareTo(Vehiculo obj) {
		return this.entrada.compareTo(obj.entrada);
	}

	@Override
	public String toString() {
		return "matricula: " + matricula;
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Vehiculo) {
			Vehiculo casteado = (Vehiculo) obj;

			esIgual = this.matricula.equals(casteado.matricula);
		}
		return esIgual;
	}
}
