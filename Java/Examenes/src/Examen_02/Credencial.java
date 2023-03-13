package Examen_02;

public class Credencial {
	private String username;
	private String password;
	public static int secuencia=100; //Seria mas correcto private static int secuencia=100;
	
	public Credencial(String nombre, String apellidos, String password) {
		if (!nombre.isEmpty() && nombre != null && !apellidos.isEmpty() && apellidos != null && !password.isEmpty() && password != null ) {
			this.username = crearUsuario(nombre, apellidos);
			this.password = password;
		}
	}
	
	
	private String crearUsuario(String nombre, String apellidos) {
		StringBuilder result = new StringBuilder();
		nombre = nombre.strip();
		apellidos =  apellidos.strip();
		result.append( nombre.substring(0, 3).toLowerCase());
		result.append( apellidos.substring(0, 3).toLowerCase());
		result.append(String.valueOf(secuencia));
		secuencia++;
		
		return result.toString();		
	}
	
	public  boolean comprobarPassword(String password) {
		boolean resultado = false;
		if (!password.isEmpty() && password != null ) {
			resultado =  password.equals(this.password);
		}
		return resultado;
	}

	public String getUsername() {
		return this.username;
	}
	
	public  boolean esPasswordSegura(){
		
		boolean segura = false;
		if (this.password.length()>8) {
			if (!this.password.toLowerCase().equals(this.password)) {
				for (int i = 0; i<this.password.length() && segura == false; i++) {
					if (Character.isDigit(this.password.charAt(i))) {
						segura = true;
					}
				}
			}
			
		}
		return segura;
	}
	

	public void setPassword(String newpass) {
		this.password = newpass;
	}


	@Override
	public String toString() {
		StringBuilder asteriscos = new StringBuilder();
		for (int i  = 0; i<this.password.length();i++) {
			asteriscos.append("*");

		}
		return "username " + username + " y contraseña "+ asteriscos.toString();
	}
	
	@Override
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Credencial) {
			Credencial ob2 = (Credencial)ob1;
			
			igual = this.username == ob2.username ;
		}			
		return igual;
	}
	
	
	
	
	
	
	
	

}
