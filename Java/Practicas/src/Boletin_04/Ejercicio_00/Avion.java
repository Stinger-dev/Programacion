package Boletin_04.Ejercicio_00;

public class Avion {

	private String idAvion;
	private int capacidad;
	private int numVuelos;
	private float kmVolados;
	private String compannia;

	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numVuelos = 0;
		this.kmVolados = 0;
		this.compannia = "no tiene compañia aun";
	}

	public Avion(String idAvion, int capacidad, String compannia) {
		this(idAvion, capacidad); // Asi llamamos al otro constructor
		this.compannia = compannia;
	}

	public boolean asignarVuelo(int capacidad, float kilometros) {
		boolean hecho = false;

		if (capacidad > 0 && capacidad <= this.capacidad && kilometros > 0) {
			this.capacidad += capacidad;
			this.kmVolados += kilometros;
			this.numVuelos++;
			hecho = true;
		}
		return hecho;
	}

	public int getNumeroVuelos() {
		return numVuelos;
	}

	public float getKmVolados() {
		return kmVolados;
	}

	public float getMediaKm() {
		return numVuelos > 0 ? kmVolados / numVuelos : 0;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	public boolean cambiarCompannia(String cadena) {
		boolean hecho = false;

		if (!cadena.isEmpty() && cadena != null) {
			this.compannia = cadena;
			hecho = true;
		}
		return hecho;
	}

	@Override
	public String toString() {
		return String.format(
				"Avión con id: %s de la compañía %s ha realizado  %s vuelos, con un total de %s km y una media de %s km por vuelo.\n",
				idAvion, compannia, numVuelos, kmVolados, getMediaKm());
	}

}
