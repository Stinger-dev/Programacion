package com.EmpresaIt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Candidate {
	private LocalDate dateOfBirth;
	private LocalDate startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	public static final double plusAntiguedad = 0.05;
	public boolean funcion; // False = Mantenimiento ; True = Desarrollo

	public Candidate() {
		super();
	}

	public abstract double computeGrossSalary();

	public void setFuncion(boolean funcion) {
		this.funcion = funcion;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProject() {
		return inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s \n" + "Apellido: %s\n" + "Contrato: %s\n" + "Fecha de incorporacion: %s\n" + "Salario: %s \n",
				this.name, this.surname, this.ct, this.startDate, this.computeGrossSalary());
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Candidate) {
			Candidate casteado = (Candidate) obj;

			esIgual = this.dni.equals(casteado.dni);
		}
		return esIgual;
	}
}
