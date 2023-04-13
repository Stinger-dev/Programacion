package Boletin_08.Ejercicio_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	private List<PaginaWeb> registro ;
	private String nombreUsuario;

	public Historial(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.registro  = new ArrayList<>();
	}

	public void newPaginaVisitada(String url) {
		this.registro.add(new PaginaWeb(url));
	}
	public String getHistorialCompleto() {
		StringBuilder resultado = new StringBuilder();
		
		this.registro.forEach(tmp -> resultado.append(tmp.toString()+"\n"));
		return resultado.toString();
	}
	
	public String getHistorialDia(LocalDate dia) {
		StringBuilder resultado = new StringBuilder();
		
		for (PaginaWeb tmp : this.registro) {
			if(tmp.getTimeStamp().toLocalDate().equals(dia)) {
				resultado.append(tmp.toString()+"\n");
			}
		}
		return resultado.toString();
	}
	
	public void clearHistorial() {
		this.registro.clear();
	}
	
	
	public void rmVisitasUrl(String url) {
		for (int i = 0; i< this.registro.size(); i++) {
			if(this.registro.get(i).getUrl().equals(url)) {
				this.registro.remove(i);
			}
		}
		/*
		 * Teoria de pq no funciona, al hacer un forEach no se puede modificar pq si no seria un cacao?
		 * 
		List<Visita> tmp0 = new ArrayList<>();
		for (Visita tmp : this.registro) {
			if(tmp.getUrl().equals(url)) {
				tmp0.add(tmp);
			}
		}
		
		this.registro.removeAll(tmp0);
		*/
		
	}
	
}
