package Mock_Ficheros.Principal;


import Mock_Ficheros.PlataformaOnline.jacaranda.com.Catalogo;
import Mock_Ficheros.PlataformaOnline.jacaranda.com.Tema;
import Mock_Ficheros.PlataformaOnline.jacaranda.com.SerieException;

public class Main {

	
	
	public static void main(String[] args) {
		
		Catalogo series = new Catalogo();
		try {
			series.annadirSerie("This is us", 2015, Tema.DRAMA);
			series.annadirSerie("Friends", 1990, Tema.COMEDIA);
			series.annadirSerie("Dallas", 1970, Tema.INTRIGA);
			series.annadirTemporada("This is us", "Empezamos");
			series.annadirTemporada("This is us", "Seguimos");
			series.annadirTemporada("This is us", "Finalizamos");
			series.annadirCapituloTemporada("This is us", "Empezamos", "La familia");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El problema");
			series.annadirCapituloTemporada("This is us", "Empezamos", "Los niños");
			series.annadirCapituloTemporada("This is us", "Empezamos", "CAsi el final");
			series.annadirCapituloTemporada("This is us", "Empezamos", "El final");
			
			
		} catch (SerieException e) {
			e.printStackTrace();
		}
		
		

	}
	
	
}
