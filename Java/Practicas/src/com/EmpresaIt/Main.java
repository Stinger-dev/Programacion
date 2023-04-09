package com.EmpresaIt;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		WebDesigner ob1 = new WebDesigner();
		ob1.setCt(ContractType.FULLTIME);
		ob1.setStartDate(LocalDate.now());
		ob1.setFuncion(false); //true es desarrollo y false mantenimiento
		ob1.setDni("asdf2");

		System.out.println(ob1.computeGrossSalary());
		
		FullStackDeveloper ob2 = new FullStackDeveloper();
		ob2.setCt(ContractType.PARTIAL);
		ob2.setStartDate(LocalDate.now());
		ob2.setFuncion(true); //true es desarrollo y false mantenimiento
		ob2.computeGrossSalary();
		ob2.setDni("asdf1");
		System.out.println(ob2.computeGrossSalary());

		Empresa emp = new Empresa();
		
		emp.addEmpleado(ob2);
		
		System.out.println(emp.getEmpleado("asdf1"));
		
		System.out.println(emp.getSalarioEmpleado("asdf1"));
		
		System.out.println(emp.getEmpleadosOrdenados());
		
	
		
	}

}
