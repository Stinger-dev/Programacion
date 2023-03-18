package Boletin_05.Ejercicio_04;

import java.util.Objects;

public class Partido {
	private int jornada;
	private String quiniela;

	private String equipoLocal;
	private int golesLocal;

	private String equipoVisitante;
	private int golesVisitante;

	public Partido() {
		this.quiniela = "Aun no disputado";
		this.equipoLocal = "Error";
		this.golesLocal = -1;
		this.equipoVisitante = "Error";
		this.golesVisitante = -1;
	}

	public Partido(int jornada, String equipoLocal, String equipoVisitante) {
		this();
		if (!equipoLocal.equalsIgnoreCase(equipoVisitante)) {
			this.jornada = jornada;

			this.equipoLocal = equipoLocal;
			this.golesLocal = -1;

			this.equipoVisitante = equipoVisitante;
			this.golesVisitante = -1;
		}

	}

	public void ponerResultado(String resultados) {
		String[] resultado = resultados.split("-");

		this.golesLocal = Integer.valueOf(resultado[0]);
		this.golesVisitante = Integer.valueOf(resultado[1]);
		if (this.golesLocal > this.golesVisitante)
			this.quiniela = "1";
		else if (this.golesVisitante > this.golesLocal)
			this.quiniela = "2";
		else
			this.quiniela = "X";

	}

	@Override
	public String toString() {

		if (!this.equipoLocal.equalsIgnoreCase("error")) {
			return String.format(
					"Partido entre equipo local %s y el equipo visitante %s ha finalizado con %s goles del equipo local y %s del equipo visitante. Resultado de la quiniela %s",
					this.equipoLocal, this.equipoVisitante, this.golesLocal, this.golesVisitante, this.quiniela);
		}
		return String.format("Partido entre equipo local %s y el equipo visitante %s aun no se ha jugado",
				this.equipoLocal, this.equipoVisitante);
	}

}
