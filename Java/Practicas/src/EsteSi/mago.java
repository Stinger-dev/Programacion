package EsteSi;

public class mago extends personale {

	private float power;

	public mago(String nombre, float vida) {
		super(nombre, vida);

		this.power = 200;
		// TODO Auto-generated constructor stub
	}

	public void durar(paladin a, int b) {
		a.vida += b;

	}

}
