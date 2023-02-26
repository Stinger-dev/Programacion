package Boletin_04.Ejercicio_04;

public class Complejo {
	
	private double parteReal;
	private double parteImaginaria;
	
	
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public  Complejo sumar(Complejo ob1) {
		return new Complejo(ob1.parteReal+this.parteReal, ob1.parteImaginaria+this.parteImaginaria);	
	}
	
	public  Complejo restar(Complejo ob1) {
		return new Complejo(this.parteReal-ob1.parteReal, this.parteImaginaria-ob1.parteImaginaria);	
	}

	public Complejo multiplicar(Complejo ob1) {
		//z*z=(A+Bi)*(C+Di) = A*C+B*D*i*i+A*D*i+C*B*i -> A*B-B*D //// A*D+C*B
		return new Complejo((this.parteReal*ob1.parteReal)-(this.parteImaginaria*ob1.parteImaginaria),(this.parteReal*ob1.parteImaginaria)+(ob1.parteReal*this.parteImaginaria));
	}
	public Complejo getConjugado() {
		return new Complejo(this.parteReal, -this.parteImaginaria);
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%si)",parteReal, parteImaginaria);
	}
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Complejo) {
			Complejo ob2 = (Complejo)ob1;
			igual = this.parteImaginaria != ob2.parteImaginaria && this.parteReal != ob2.parteReal;
		}			
		return igual;
	}
	
	
	/**
	 * Si hay division entre 0 devolvera null, si no, la multiplicacion de los complejos
	 * 
	 * 
	 */
	public Complejo dividir(Complejo ob2) {
		Complejo ob1 = new Complejo(this.parteReal, this.parteImaginaria);
		Complejo ob3 = new Complejo(ob2.parteReal, -ob2.parteImaginaria);
		ob1 = ob1.multiplicar(ob3);
		ob2 = ob2.multiplicar(ob3);
		if (ob2.parteReal != 0) {
			ob3 = new Complejo(ob1.parteReal/ob2.parteReal, ob1.parteImaginaria/ob2.parteReal);
		} else
			ob3 = null;
		return ob3;
	}
	
}
