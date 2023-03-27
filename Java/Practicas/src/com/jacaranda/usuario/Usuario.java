package com.jacaranda.usuario;

import java.util.Objects;

public class Usuario {
	
	private String login;
	private String pass;
	
	public Usuario(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	public String getLogin() {
		return this.login;
	}
	
	public boolean setPass(String old, String newPass) {
		boolean success = false;
		if(old!=null && !old.isBlank() && old.equals(this.pass) && newPass!=null && !newPass.isEmpty()) {
			this.pass=newPass;
			success = true;
		}
		return success;
	}
	
	public boolean checkPass(String pass) {
		return (pass!=null && !pass.isEmpty() && pass.equals(this.pass));
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.login, this.pass);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Usuario) {
			Usuario casteado = (Usuario) obj;

			esIgual =  this.login.equals(casteado.login);
		}
		return esIgual;
	}
	
	
	
}
