package Examen160523;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class SoftwareAntivirus {
	
	
	private static final int LONGITUD_DIVISION = 5;
	private static final int TAMAGNO_MAXIMO_CODIGO = 25;
	private static final String VALORES_CODIGO = "ABCDEFGHIJ0123456789"; //Sacamos este valor como constante
	private static final int DURACION_LICENCIAS = 1; 
	
	private Random random = new Random(); //Generamos un objeto random en lugar de generar uno nuevo cada vez que se ejecuta 
	private LocalDate fechaAlta;
	private LocalDate fechaCaducidad;
	private Queue<String> licencias; //He cambiado de lista a cola ya que es el funcionamiento que tenia
	
	
	public SoftwareAntivirus(int cantidad, LocalDate fechaAlta) {
		super();
		this.fechaAlta=fechaAlta;
		this.fechaCaducidad=fechaAlta.plusYears(DURACION_LICENCIAS);
		this.licencias = generarPaqueteDeCodigos(cantidad);
		
	}
	
	/**
	 * Indica si el producto está activo actualmente
	 * @return true si se encuentra activo
	 */
	public boolean esActivo() {
		return esActivoEnFecha(LocalDate.now()); //He refactorizado esto para que llame al metodo que ya existia
	}
	
	/**
	 * Indica si para la fecha facilitada el producto está activo
	 * @param fecha parámetro que contiene la fecha a comprobar
	 * @return true si se encuentra activo
	 */
	public boolean esActivoEnFecha(LocalDate fecha) {
		return fecha.isBefore(fechaCaducidad) && (fecha.isAfter(fechaAlta) || fecha.isEqual(fechaAlta));
	}
	
	/**
	 * Indica los días de licencia restante del producto para una fecha determinada si está activo
	 * @param fecha para la que se quiere conocer cuántos días de uso restan 
	 * @return días restantes a partir de una fecha
	 */
	public int calcularDiasRestantesEnFecha(LocalDate fecha) {
		return esActivo()? //He sustituido la validacion de la validez por el metodo que ya existia
				(int)ChronoUnit.DAYS.between(fecha, fechaCaducidad)		:0;
	}
	
	/**
	 * Informa de cuántas licencias se pueden otorgar
	 * @return número de licencias
	 */
	public int licenciasRestantes() {
		return this.licencias.size();
	}
	
	
	/**
	 * Devuelve un código de uso y reduce el número de licencias activas si aún están disponibles
	 * @return código de activación
	 * @throws Exception cuando no existen licencias restantes
	 */
	public String activarLicencia() throws AntivirusException {
		String codigo = "";
		if(!this.licencias.isEmpty()) {
			codigo = this.licencias.poll();
		}else {
			throw new AntivirusException("Ya se han activado todas las licencias."); //Creamos una excepcion propia en lugar de usar la superclase
		}
		return codigo;
	}
	
	
	/**
	 * Genera una lista de códigos de activación del antivirus
	 * @param cantidad número de licencias a activar
	 * @return lista con los códigos generados
	 */
	
	protected Queue<String> generarPaqueteDeCodigos(int cantidad){
		Queue<String> codigosAleatorios = new PriorityQueue();
		for(int i = 0; i < cantidad; i++) {
			codigosAleatorios.add(generarCodigoLicenciaDeUso());
		}
		return codigosAleatorios;
	}
	
	/**
	 * Crea un código formado por 25 caracteres alfanuméricos con letras en mayúsculas
	 * y números del 0 al 9 separados por <b>"-"</b> cada cinco caracteres
	 * @return código alfanumérico
	 */
	protected String generarCodigoLicenciaDeUso() {
		StringBuilder codigo = new StringBuilder(); //Usamos un StringBuilder ya que la cadena se modifica varias veces
		for(int i = 0; i < TAMAGNO_MAXIMO_CODIGO; i++) {
			codigo.append(VALORES_CODIGO.charAt(random.nextInt(VALORES_CODIGO.length())));
			codigo.append(((i+1)%LONGITUD_DIVISION==0 && (i+1)<TAMAGNO_MAXIMO_CODIGO)?"-":"");
		}
		return codigo.toString();
	}

}
