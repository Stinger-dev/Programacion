package Boletin_08.Ejercicio_07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Caja {

	private boolean abierto;
	private Queue<Cliente> clientes;

	public Caja() {
		/**
		 * Crea una caja pero no la abre
		 */
		this.clientes = new LinkedList<>();
		this.abierto = false; // He supuesto que al crear la caja se crea cerrada
	}

	public int getTamagnoCola() {
		return this.clientes.size();
	}

	public void nuevoCliente(Cliente cliente) {
		if (cliente != null && !this.clientes.contains(cliente) && abierto) {
			this.clientes.add(cliente);
		}
	}

	public void clienteAtendido() {
		this.clientes.remove();
	}

	public Cliente getSiguienteCliente() {
		return this.clientes.peek(); // preguntar si esto es tambien inseguro
	}

	public void abrirCaja() {
		this.abierto = true;

	}

	public void cerrarCaja() throws CajaException {
		if (this.abierto && clientes.isEmpty()) {
			this.abierto = false;
		} else {
			throw new CajaException("Para poder cerrar una caja debe estar abierta y no tener clientes");
		}
	}

	public boolean isAbierto() {
		return abierto;
	}

	public Queue<Cliente> getClientes() {
		Queue<Cliente> tmp = new LinkedList<>(this.clientes); // Haciendolo asi me aseguro de mantener segura la cola
		return tmp;
	}

	protected void limpiarCola() {
		this.clientes.clear();
	}

}
