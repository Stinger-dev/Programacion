package JSONManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.model.Oficina;

public class JsonWritterReader {
	
	public static Oficina cargarDepartamento(String path) {
		Oficina output = null;
		Gson gson = new GsonBuilder().create();
		try {
			output = gson.fromJson(new FileReader(new File(path)), Oficina.class);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return output;
	}
	
	public static void escribirColleccion(Oficina ofi, String destino) {
		
		File ficheroDestino = new File(destino);
		try {
			ficheroDestino.createNewFile();
			FileWriter writer = new FileWriter(ficheroDestino);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(ofi.getDepartamentos(),writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

