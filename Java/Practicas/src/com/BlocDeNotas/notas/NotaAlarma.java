package com.BlocDeNotas.notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable {
	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;
	private int minutosRepetir;
	private boolean activado;
	
	private NotaAlarma(String texto, LocalDateTime fechaAlarma) {
		super(texto);
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
		this.activado = true;
	} 
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean activado) {
		this(texto,fechaAlarma);
		this.activado = activado;
	}
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		this(texto,fechaAlarma);
		this.minutosRepetir = minutosRepetir;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) throws NotaAlarmaException {
		if(fechaAlarma.isBefore(LocalDateTime.now())) {
			this.fechaAlarma = fechaAlarma;
		}else {
			throw new NotaAlarmaException("Fecha incorrecta");
		}
	}
	
	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	@Override
	public void activar() {
		this.activado = true;
	}

	@Override
	public void desactivar() {	
		this.activado = false;	
	}
 
	public boolean isActivado() {
		return this.activado;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n"
				+ "La alarma esta %s", super.toString(), (this.activado)? "activada" : "desactivada" );
	}
	
	
}
