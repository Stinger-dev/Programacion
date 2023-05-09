package main.java.Json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.model.Caseta;

public class JSONManager {
	
	public List<Caseta> cargarCaseta(String path) {
		List<Caseta> casetas = null;
		Gson gson = new GsonBuilder().create();
		try {
			Caseta[] arrayDeCasetas = gson.fromJson(new FileReader(new File(path)), Caseta[].class);
			casetas = List.of(arrayDeCasetas);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return casetas;
	}
	
	public void escribirColleccion(List<Caseta> casetas, String destino) {
		
		File ficheroDestino = new File(destino);
		try {
			ficheroDestino.createNewFile();
			FileWriter writer = new FileWriter(ficheroDestino);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(casetas,writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
