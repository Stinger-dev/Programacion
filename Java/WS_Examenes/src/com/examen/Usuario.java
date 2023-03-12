package com.examen;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private int intentos;
	private Credencial credencial;
	
	public Usuario(String nombre, String apellidos, String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.intentos = 0;
		this.email = "no asociado";
		setCredencial(new Credencial(nombre, apellidos, password));
		
	}
	public Usuario(String nombre, String apellidos, String email, String password) {
		this(nombre,apellidos,password);
		this.email = email;
	}
	
	
	public boolean esCuentaBloqueada() {
		 return (this.intentos > 2)? true : false ; //Seria mas correcto poner this.intentos>2
	 }
	 
	 
	private void setCredencial(Credencial credencial) {
		this.credencial = credencial;

	 }
	
	public boolean modificarPassword(String oldPass, String newPas, String newPassVerif) {
		boolean exito = false;
		if (!oldPass.isEmpty() && oldPass != null && !newPas.isEmpty() && newPas != null && !esCuentaBloqueada()&& !newPassVerif.isEmpty() && newPassVerif != null) {
			if (credencial.comprobarPassword(oldPass)) {
				if (newPas.equals(newPassVerif) && !credencial.comprobarPassword(newPassVerif)) {
					credencial.setPassword(newPassVerif);
					exito = true;
				}
			}	
		}	
		 return exito;
	}
	
	public boolean esPasswordSegura() {
		return credencial.esPasswordSegura();
	}
	
	public boolean hacerLogin(String username, String password) {
		boolean resultado = false;
		if (!password.isEmpty() && password != null && !username.isEmpty() && username != null && !esCuentaBloqueada()) {
			resultado = (username.equals(credencial.getUsername()) && credencial.comprobarPassword(password));
		}
		this.intentos = (resultado)? 0 : this.intentos+1 ;

		return resultado;
	} //Quiza el ternario sobra y se puede haccer de otra forma
	 
	 
	 
	 
	 
	 @Override
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Usuario) {
			Usuario ob2 = (Usuario)ob1;
			
			igual = this.email.equals(ob2.email) && this.apellidos.equals(ob2.apellidos) && this.nombre.equals(ob2.nombre)
															||
					this.credencial.equals(ob2.credencial);
		}			
		return igual;
	}
	@Override
	//ToDo
	public String toString() {
		String resultado;
		if (!esCuentaBloqueada()) {
			resultado = String.format("Usuari@ %s %s con email %s, %s",
					this.nombre, this.apellidos, this.email, credencial.toString());
		}else {
			resultado = "Cuenta bloqueada";
		}
		return resultado;
	}
	 
	 
	public String getUserName() {
		return credencial.getUsername();
	}
	
}
