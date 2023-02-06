package EsteSi;

public class paladin extends personale {

	private float dmg;
	private float armor;

	public paladin(String nombre, float vida) {
		super(nombre, vida);
		this.dmg = 10;
		this.armor = (float) 0.9;
	}

	public void autoCura(int a) {
		this.vida += a;
	}

	public float ataque() {
		return this.dmg;
	}

	public void recibirDaño(int dmg) {
		this.vida = this.vida - dmg * armor;
		if (this.vida < 0) {
			this.vivo = false;
		}
	}
}