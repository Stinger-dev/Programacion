package com.EmpresaIt;

public class Empresa {
	private Candidate[] candidates = new Candidate[11];
	private int ultimaPos = 0;
	
	public Empresa() {
	}
	
	public void addEmpleado(Candidate empleado) {
		if (getEmpleado(empleado.getDni()).equals("No existe empleado")) {
			candidates[ultimaPos++] = empleado;
		}
		
	}
	
	public String getEmpleado(String dni ) {
		int k;
		boolean encontrado = false;
		for (k = 0; k < candidates.length && !encontrado; k++) {
			if(this.candidates[k] != null && this.candidates[k].getDni().equals(dni)) {
				encontrado = true;
			}
		}
		return (encontrado) ? this.candidates[k-1].toString() : "No existe empleado";
	}
	
	
	public double getSalarioEmpleado(String dni ) {
		int k;
		boolean encontrado = false;
		for (k = 0; k < candidates.length && !encontrado; k++) {
			if(this.candidates[k] != null && this.candidates[k].getDni().equals(dni)) {
				encontrado = true;
			}
		}
		return (encontrado) ? this.candidates[k-1].computeGrossSalary() : -1;
	}
	
	public String getEmpleadosOrdenados() {
		StringBuilder result = new StringBuilder();
		
		for(Candidate emple : candidates) {
			if (emple != null) {
				result.append(emple.toString()).append("\n-------------\n");
			}
		}
		
		
		return result.toString();
	}
	
	

}
