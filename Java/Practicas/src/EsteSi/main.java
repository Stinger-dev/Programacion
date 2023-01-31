package EsteSi;

public class main {

	public static void main(String[] args) {
		paladin ob1 = new paladin("fran", 200);

		System.out.println(ob1.getVida());

		System.out.println(ob1.isVivo());

		mago ob2 = new mago("f", 200);
		ob1.recibirDaño(300);
		System.out.println(ob1.getVida());

		System.out.println(ob1.isVivo());

	}

}
