package Boletin_06.Ejercicio_04;

public class Fecha {
	private int day;
	private int month;
	private int year;
	private final String[]  MONTHS= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private final int[]  days= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Fecha(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		if (Fecha.esBisiesto(year)) {
			days[1] = 29;
		}
		
	}
	public boolean esBisiesto() {
		return ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0)));
	}
	public static boolean esBisiesto(int year) {
		return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
	}
	public boolean esFechaValida() {
		boolean esValida = false;
		if (this.month>0 && this.month<=12 && this.year >= 0 && this.day > 0) {
			if (this.day <= this.days[this.month-1]) {
				esValida = true;
			}
		}
		return esValida;
	}
	public int diasDelMes(int mes) {
		return this.days[mes-1];
	}
	
	public String toFormatoLargo() {
		return 	(this.esFechaValida())? String.format("%s de %s de %s", this.day, MONTHS[this.month-1], this.year) : "La fecha es incorrecta" ;

	}
	

}
