package EsteSi;

public class personale {

	private String nombre;
	protected float vida;
	protected boolean vivo;

	public personale(String nombre, float vida) {
		this.nombre = nombre;
		this.vida = vida;
		this.vivo = true; // no se pueden crear personajes muertos

	}

	public void matar() {
		this.vivo = false;
	}

	public void recibirDaño(int dmg) {
		this.vida = this.vida - dmg;
		if (this.vida < 0) {
			this.vivo = false;
		}
	}

	public void recibirCuracion(int dmg) {
		this.vida = this.vida + dmg;
	}

	public String getNombre() {
		return nombre;
	}

	public float getVida() {
		return vida;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVida(float vida) {
		this.vida = vida;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

}
