package Boletin_07.Ejercicio_02;


public class Parking {
	private Vehiculo[] vehiculos = new Vehiculo[50];
	
	
	
	
	public Parking() {
		super();
		
	}
	
	
	public void agnadirVehiculo(Vehiculo nuevo)  {
		this.vehiculos[encontrarPlaza()] = nuevo;		
	}
	
	private int encontrarPlaza(){
		int resultado = -1;
		for (int i = 0; i< this.vehiculos.length && resultado == -1; i++) {
			if (vehiculos[i] == null) {
				resultado = i;
			}
		}
		return resultado;
	}
	
	

	public Vehiculo[] ordenarPorFecha() {
		Vehiculo[] tmp_array = this.vehiculos;
		Vehiculo tmp;
		
		for (int i = 0; i< tmp_array.length; i++) {
			for (int j = i; j < tmp_array.length; j++) {	
				if (tmp_array[j]!= null && tmp_array[i].getEntrada().compareTo(tmp_array[j].getEntrada()) > 0 ) {
					tmp = tmp_array[j];
					tmp_array[j] = tmp_array[i];
					tmp_array[i] = tmp;
				} 
			}
		}
		this.vehiculos = tmp_array;
		return tmp_array;
	}
	
	public Vehiculo[] ordenarPorMatricula() {
		Vehiculo[] tmp_array = this.vehiculos;
		Vehiculo tmp;
		
		for (int i = 0; i< tmp_array.length; i++) {
			for (int j = i; j < tmp_array.length; j++) {	
				if (tmp_array[j]!= null && tmp_array[i].getMatricula().compareTo(tmp_array[j].getMatricula()) > 0 ) {
					tmp = tmp_array[j];
					tmp_array[j] = tmp_array[i];
					tmp_array[i] = tmp;
				} 
			}
		}
		this.vehiculos = tmp_array;
		return tmp_array;
	}
	public void ordenarPorMarcaModelo() {
		Vehiculo[] tmp_array = this.vehiculos;
		Vehiculo tmp;
		
		for (int i = 0; i< tmp_array.length; i++) {
			for (int j = i; j < tmp_array.length; j++) {	
				if (tmp_array[j]!= null && tmp_array[i].compareMarcaModelo(tmp_array[j]) > 0 ) {
					tmp = tmp_array[j];
					tmp_array[j] = tmp_array[i];
					tmp_array[i] = tmp;
				} 
			}
		}
		this.vehiculos = tmp_array;
	}
	
	
	public void ordenarPorTipoCombustible() {
		Vehiculo[] tmp_array = this.vehiculos;
		Vehiculo tmp;
		
		for (int i = 0; i< tmp_array.length; i++) {
			for (int j = i; j < tmp_array.length; j++) {	
				if (tmp_array[j]!= null && tmp_array[i].compareTipoCombustible(tmp_array[j]) > 0 ) {
					tmp = tmp_array[j];
					tmp_array[j] = tmp_array[i];
					tmp_array[i] = tmp;
				} 
			}
		}
		this.vehiculos = tmp_array;
	}
	
	

	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		for (Vehiculo v : vehiculos) {
			
			resultado.append((v != null)? "| " + v.toString()+ " |" : "| plaza vacia |");
		}
		return resultado.toString();
	}


	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	
	
	
}
