package Boletin_10.Euromillones;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import Boletin_09.Genero;
import Boletin_09.Persona;

public class Historial {
	private HashMap<LocalDate, Combinacion> sorteos;

	public Historial() {
		this.sorteos = new HashMap<>();
	}

	public boolean addSorteo(LocalDate dia, Combinacion combinacion) {
		/**
		 * Devuelve true si se ha podido añadir y false en caso contrario
		 */
		boolean resultado = false;
		if (dia != null && combinacion != null
				&& ((dia.getDayOfWeek().getValue() == 2 || dia.getDayOfWeek().getValue() == 5)
						&& !this.sorteos.containsKey(dia))) {
			this.sorteos.put(dia, combinacion);
			resultado = true;
		}

		return resultado;
	}

	public boolean addSorteo(int day, int month, int year, Combinacion combinacion) {
		/**
		 * Devuelve true si se ha podido añadir y false en caso contrario
		 */
		boolean resultado;
		LocalDate tmp;
		try {
			tmp = LocalDate.of(year, month, day);
			resultado = this.addSorteo(tmp, combinacion);
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}

	public boolean actualizarSorteo(LocalDate dia, Combinacion combinacion) {
		/**
		 * Devuelve true si se ha podido actualizar y false en caso contrario
		 */
		return this.sorteos.replace(dia, this.sorteos.get(dia), combinacion);
	}

	public boolean actualizarSorteo(int day, int month, int year, Combinacion combinacion) {
		/**
		 * Devuelve true si se ha podido actualizar y false en caso contrario
		 */
		boolean resultado;
		LocalDate tmp;
		try {
			tmp = LocalDate.of(year, month, day);
			resultado = this.actualizarSorteo(tmp, combinacion);
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}

	public boolean borrarSorteo(LocalDate dia) {
		return this.sorteos.remove(dia) != null;
	}

	public List<String> listarSorteosDesdeFecha(LocalDate fecha) {
		List<String> sorteosDesdeFecha = new ArrayList<>();

		for (Map.Entry<LocalDate, Combinacion> tmp : this.sorteos.entrySet()) {
			if (fecha.isBefore(tmp.getKey()))
				sorteosDesdeFecha.add(tmp.getValue().toString());
		}
		return sorteosDesdeFecha;
	}

	public List<String> mostrarHistorico() {
		List<String> sorteosDesdeFecha = new ArrayList<>();

		for (Map.Entry<LocalDate, Combinacion> tmp : this.sorteos.entrySet()) {
			sorteosDesdeFecha.add(tmp.getKey().toString().concat("     ").concat(tmp.getValue().toString()));
		}
		return sorteosDesdeFecha;
	}

	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws HistorialException {
		Map<String, Integer> resultado = new HashMap<>();
		if (fecha != null && combinacion != null && this.sorteos.containsKey(fecha)) {
			int aciertos = this.sorteos.get(fecha).comprobarCombinacion(combinacion);
			resultado.put(String.format("Para la combinacion -> %s %n Hay %s aciertos para el dia %s",
					combinacion.toString(), aciertos, fecha), aciertos);
		} else {
			throw new HistorialException("La fecha no es valida");
		}
		return resultado;
	}

	
	public void agnadirArchivo(String url) throws HistorialException {
		Combinacion ob1 = null;
		
		File datos = new File(url);
		try {
			Scanner lector = new Scanner(datos);
			lector.nextLine();
			while (lector.hasNext()) {			
			String [] tmp = lector.nextLine().split(","); 				
		
			ob1 = new Combinacion(Integer.valueOf(tmp[1]), Integer.valueOf(tmp[2]), Integer.valueOf(tmp[3]), Integer.valueOf(tmp[4]), Integer.valueOf(tmp[5]), Integer.valueOf(tmp[7]), Integer.valueOf(tmp[8]));
			
			this.addSorteo(LocalDate.parse(tmp[0], DateTimeFormatter.ofPattern("d/MM/yyyy")), ob1);
			}
		} catch (FileNotFoundException e) {
			throw new HistorialException("No se ha podido encontrar el archivo");
		} catch (NumberFormatException e) {
			throw new HistorialException("Error ");			
		} catch (CombinacionExeption e) {
			throw new HistorialException("No se ha podido añdir una fecha");			
		}
	}
	
	public String getDatosCuriosos() {
		StringBuilder resultado = new StringBuilder();
		Map<Integer, Integer> tmpNumeros = new HashMap<>();
		Map<Integer, Integer> tmpEstrellas = new HashMap<>();

		
		for(Combinacion tmpComb : this.sorteos.values()) {
			for(int num : tmpComb.getNumeros()) {
				if(!tmpNumeros.containsKey(num)) {
					tmpNumeros.put(num, 0);
				}
				tmpNumeros.put(num, tmpNumeros.get(num)+1);					
			}
			for(int est : tmpComb.getEstrellas()) {
				if(!tmpEstrellas.containsKey(est)) {
					tmpEstrellas.put(est, 0);
				}
				tmpEstrellas.put(est, tmpEstrellas.get(est)+1);					
			}
		}

		int maximoEstrellas = -1; //No va a tener un valor que sea menor a -1
		int minimoEstrellas = Integer.MAX_VALUE;
		for (Integer tmp : tmpEstrellas.values()) {
			if(maximoEstrellas<tmp) {
				maximoEstrellas = tmp;
			}
			if(tmp<minimoEstrellas) {
				minimoEstrellas = tmp;
			}
		}
		
		int maximoNumeros = -1;
		int minimoNumeros = Integer.MAX_VALUE;
		
		for (Integer tmp : tmpNumeros.values()) {
			if(maximoNumeros<tmp) {
				maximoNumeros = tmp;
			}
			if(tmp<minimoNumeros) {
				minimoNumeros = tmp;
			}
		}
		
		resultado.append("Las estrellas que mas aparecen son: ");
		for(Entry<Integer, Integer> tmp : tmpEstrellas.entrySet()) {

			if(tmp.getValue() == maximoEstrellas) {
				resultado.append(tmp.getKey()).append(" ").append(" y aparecen ").append(maximoEstrellas);
			}
		}
		resultado.append("\nLas estrellas que menos aparecen son: ");
		for(Entry<Integer, Integer> tmp : tmpEstrellas.entrySet()) {
			if(tmp.getValue() == minimoEstrellas) {
				resultado.append(tmp.getKey()).append(" ").append(" y aparecen ").append(minimoEstrellas);
			}
		}
		
		resultado.append("\nLos numeros que mas aparecen son: ");
		for(Entry<Integer, Integer> tmp : tmpNumeros.entrySet()) {
			if(tmp.getValue() == maximoNumeros) {
				resultado.append(tmp.getKey()).append(" ").append(" y aparecen ").append(maximoNumeros);
			}
		}
		resultado.append("\nLos numeros que menos aparecen son: ");
		for(Entry<Integer, Integer> tmp : tmpNumeros.entrySet()) {
			if(tmp.getValue() == minimoNumeros) {
				resultado.append(tmp.getKey()).append(" ").append(" y aparecen ").append(minimoNumeros);
			}
		}
		
		return resultado.toString();
	}
	
	public String getNumerosMayorConsecutivo() {
		StringBuilder resultado = new StringBuilder();
		int mayor = -1;
		for(Combinacion comb : this.sorteos.values()) {
			if (comb.getMayorConsecutivo()>mayor) {
				mayor = comb.getMayorConsecutivo();
			}	
		}
		resultado.append("El numero maximo de consecutivos es: ").append(mayor);
		resultado.append(" y los que lo cumple son: \n");
		for(Entry<LocalDate, Combinacion> tmp : this.sorteos.entrySet()) {
			if(tmp.getValue().getMayorConsecutivo() == mayor) {
				resultado.append(tmp.toString());
			}
		}
		
		return resultado.toString();
	}
	
	
	public int getMaximoAciertosHistorico(Combinacion comb) {
		int resultado = 0;
		for (Combinacion tmpCombinacion : this.sorteos.values()) {
			
			if(tmpCombinacion.comprobarCombinacion(comb) > resultado) {
				resultado = tmpCombinacion.comprobarCombinacion(comb);
			}
		}
		
		return resultado;
	}
	
	
	

}
