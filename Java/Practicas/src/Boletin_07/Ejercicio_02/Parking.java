package Boletin_07.Ejercicio_02;

import java.time.LocalDateTime;
import java.util.Arrays;

import Boletin_07.Ejercicio_02.Comparadores.CompararFecha;
import Boletin_07.Ejercicio_02.Comparadores.CompararMarcaModelo;
import Boletin_07.Ejercicio_02.Comparadores.CompararMatricula;
import Boletin_07.Ejercicio_02.Comparadores.CompararTipoyCombustible;
import Boletin_07.Ejercicio_02.Enumerates.Combustibles;
import Boletin_07.Ejercicio_02.Enumerates.TipoVehiculo;
import Boletin_07.Ejercicio_02.Excepciones.ErrorAlBuscarVehiculo;

public class Parking {
	private Vehiculo[] vehiculos = new Vehiculo[50];

	public Parking() {
		super();
		resetParking();
	}

	private void resetParking() {
		for (int i = 0; i < vehiculos.length; i++)
			try {
				this.vehiculos[i] = new Vehiculo("Marca", "Modelo", "9999zzzz", Combustibles.electrico,
						LocalDateTime.of(0, 0, 0, 0, 0), TipoVehiculo.automovil);
			} catch (Exception e) {
			}
	}

	public void agnadirVehiculo(Vehiculo nuevo) {
		this.vehiculos[encontrarPlaza()] = nuevo;
	}

	private int encontrarPlaza() {
		int resultado = -1;
		for (int i = 0; i < this.vehiculos.length && resultado == -1; i++) {
			if (vehiculos[i] == null) {
				resultado = i;
			}
		}
		return resultado;
	}

	public void ordenarPorFecha() {
		Arrays.sort(this.vehiculos, new CompararFecha());
	}

	public void ordenarPorMatricula() {
		Arrays.sort(this.vehiculos, new CompararMatricula());
	}

	public void ordenarPorMarcaModelo() {
		Arrays.sort(this.vehiculos, new CompararMarcaModelo());
	}

	public void ordenarPorTipoCombustible() {
		Arrays.sort(this.vehiculos, new CompararTipoyCombustible());
	}

	public void salirCoche(Vehiculo v) throws ErrorAlBuscarVehiculo {
		boolean encontrado = false;
		int k;
		for (k = 0; k < this.vehiculos.length && !encontrado; k++) {
			encontrado = this.vehiculos[k].equals(v);
		}
		if (encontrado) {
			this.vehiculos[k - 1] = null;
		} else {
			throw new ErrorAlBuscarVehiculo();
		}
	}

	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < this.vehiculos.length; i++) {
			resultado.append(
					(this.vehiculos[i] != null) ? "| " + this.vehiculos[i].toString() + " |" : "| plaza vacia |");
			if (i % 3 == 0)
				resultado.append("\n");
		}
		return resultado.toString();
	}

}
