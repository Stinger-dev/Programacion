package restaurante;


import java.util.Arrays;

import restaurante.model.Cliente;
import restaurante.model.Producto;
import restaurante.model.ServicioNoDisponibleException;

public class Restaurante {

	
	private Producto[] cartaProducto;
	private int ultimoProductoCarta;
	private static final int NUM_MAXIMO_PRODUCTOS = 100;
	
	private Cliente[] clientes;
	private int ultimoCliente;
	private static final int NUM_MAXIMO_CLIENTES = 20;
	
	public static int secuenciaGlobal = 0;
	

	//ToDo 
	public Restaurante() {
		this.ultimoCliente = 0;
		this.ultimoProductoCarta = 0;
		
	}
	
	public boolean darAltaCliente(Cliente cliente) {
		boolean resultado = false;
		if(cliente != null && this.ultimoCliente < NUM_MAXIMO_CLIENTES) {
			this.clientes[this.ultimoCliente++] = cliente;
			resultado = true;

		}
		return resultado;
	}
	
	public boolean darAltaProducto(Producto bebidaOPlato) {
		boolean resultado = false;
		if(bebidaOPlato != null && this.ultimoProductoCarta < NUM_MAXIMO_PRODUCTOS) {
			this.cartaProducto[this.ultimoProductoCarta++] = bebidaOPlato;
			resultado = true;
		}
		return resultado;
	}
	
	//ToDo 
	public boolean darBajaProducto(Producto bebidaOPlato) {
		boolean resultado = false;
		int posicion = obtenerPosicionCliente(bebidaOPlato.getCodigoProducto());
		if (posicion != -1) {
			this.cartaProducto[posicion] = null;
			resultado = true;

		}		
		return resultado;
	}
	
	//ToDo
	private int obtenerPosicionCliente(String codigo) {
		int k ;
		boolean encontrado = false;
		for (k = 0; k < this.clientes.length && !encontrado; k++) {
			if(this.clientes[k].getCodigoCliente() == codigo) {
				encontrado = true;
			}
		}
		return (encontrado)? k-1 : -1 ;
	}
	 
	//ToDo
	private int obtenerPosicionProducto(String codigo) {
		int k ;
		boolean encontrado = false;
		for (k = 0; k < this.cartaProducto.length && !encontrado; k++) {
			if(this.cartaProducto[k].getCodigoProducto() == codigo) {
				encontrado = true;
			}
		}
		
		return (encontrado)? k-1 : -1 ;
	}
	
	//ToDo
	public boolean registrarProductoACliente(String codigoCliente, String codigoProducto ) throws ServicioNoDisponibleException {
		boolean resultado = false;
		if(obtenerPosicionCliente(codigoCliente) != -1 && obtenerPosicionProducto(codigoProducto)!= -1) {
			try {
				resultado = this.clientes[obtenerPosicionCliente(codigoCliente)].solicitarServicio(this.cartaProducto[obtenerPosicionProducto(codigoProducto)]);
			} catch (ServicioNoDisponibleException e) {
				throw new ServicioNoDisponibleException();
			}
		}
		return resultado;
	}
	
	//ToDo
	public boolean registrarServicioACliente(Cliente cliente, Producto producto) throws ServicioNoDisponibleException {
		boolean resultado = false;
		if(obtenerPosicionCliente(cliente.getCodigoCliente()) != -1 && obtenerPosicionProducto(producto.getCodigoProducto())!= -1) {
			try {
				resultado = this.clientes[obtenerPosicionCliente(cliente.getCodigoCliente())].solicitarServicio(this.cartaProducto[obtenerPosicionProducto(producto.getCodigoProducto())]);
			} catch (ServicioNoDisponibleException e) {
				throw new ServicioNoDisponibleException();
			}
		}
		return resultado;
	}

	//ToDo
	public String obtenerProductosPorAlergenos() {
		StringBuilder tmp = new StringBuilder();
		Arrays.sort(this.cartaProducto,new CompararPorAlergenos());
		for ( Producto p : this.cartaProducto) {
			tmp.append(p.toString()).append("\n");
		}

		return tmp.toString();
		
	}
	
	//ToDo
	public String obtenerClientesPorAlergiaEdad() { 
		StringBuilder tmp = new StringBuilder();
		Arrays.sort(this.clientes,new CompararAlergiaEdad());
	for ( Cliente p : this.clientes) {
		tmp.append(p.toString()).append("\n");
		}
	

	return tmp.toString();
	}
	
	//ToDo: Subir nota
	public String obtenerClientesNoBebedores() { return "";}
	
	//ToDo: Subir nota
	public String obtenerClientesPorConsumo() { return "";}

	
	
}
