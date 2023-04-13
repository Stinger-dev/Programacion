package Boletin_08.Ejercicio_04;

import java.time.LocalDateTime;

public class PaginaWeb {
	private String url;
	private LocalDateTime timeStamp;
	public PaginaWeb(String url) {
		this.url = url;
		this.timeStamp = LocalDateTime.now();
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		
		return String.format("%s -> %s", this.timeStamp, this.url);
	}
}
