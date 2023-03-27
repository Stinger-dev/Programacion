package com.jacaranda.memoryStorage;

public class MemoryStorageExeption extends Exception {

	public MemoryStorageExeption() {
	}

	public MemoryStorageExeption(String message) {
		super(message);
	}

	public MemoryStorageExeption(Throwable cause) {
		super(cause);
	}

	public MemoryStorageExeption(String message, Throwable cause) {
		super(message, cause);
	}

	public MemoryStorageExeption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
