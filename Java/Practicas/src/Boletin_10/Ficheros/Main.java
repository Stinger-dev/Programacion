package Boletin_10.Ficheros;

public class Main {
	public static void main(String[] args) {

		Fichero fiche = null;
		try {
			fiche = new Fichero(
					"C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets");
			// No vale esta en tu pc
			System.out.println(fiche.toString());

			System.out.println(fiche.getTexto());
		} catch (Exception e) {
			System.out.println("Ha salido mal");
		}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		try {
			fiche = new Fichero(
					"C:\\Users\\gonza\\Desktop\\Informatica\\Daw\\Primero\\Programacion\\Codigo\\Java\\Practicas\\src\\Boletin_10\\Ficheros\\Assets\\Test.txt");
			// No vale esta en tu pc
			System.out.println(fiche.toString());

			System.out.println(fiche.getTexto());
		} catch (Exception e) {
			System.out.println("Ha salido mal");
		}

	}
}
