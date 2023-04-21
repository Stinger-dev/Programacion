package Mock_Exam_Bonoloto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		if(dia != null && combinacion != null  &&  ((dia.getDayOfWeek().getValue() == 2 || dia.getDayOfWeek().getValue() == 5) && !this.sorteos.containsKey(dia) )){
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
		LocalDate  tmp;
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
		LocalDate  tmp;
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
	
	public List<String> listarSorteosDesdeFecha(LocalDate fecha){
		List<String> sorteosDesdeFecha = new ArrayList<>();
		
		for (Map.Entry<LocalDate, Combinacion> tmp : this.sorteos.entrySet()) {
			if (fecha.isBefore(tmp.getKey()))
				sorteosDesdeFecha.add(tmp.getValue().toString());
		}
		return sorteosDesdeFecha;
	}
	
	public List<String> mostrarHistorico(LocalDate fecha){
		List<String> sorteosDesdeFecha = new ArrayList<>();
		
		for (Map.Entry<LocalDate, Combinacion> tmp : this.sorteos.entrySet()) {
				sorteosDesdeFecha.add(tmp.getValue().toString());
		}
		return sorteosDesdeFecha;
	}
	
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws HistorialException {
		Map<String, Integer> resultado =  new HashMap<>();
		if (fecha != null && combinacion != null && this.sorteos.containsKey(fecha)) {
			int aciertos = this.sorteos.get(fecha).comprobarCombinacion(combinacion);
			resultado.put(String.format("Para la combinacion -> %s %n Hay %s aciertos para el dia %s", combinacion.toString(), aciertos, fecha), aciertos);
		}else {
			throw new HistorialException("La fecha no es valida");
		}
		return resultado;
	}
	
}
