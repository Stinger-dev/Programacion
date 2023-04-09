package restaurante;

import java.time.LocalDate;

import restaurante.model.Bebida;
import restaurante.model.Cliente;
import restaurante.model.Plato;
import restaurante.model.ServicioNoDisponibleException;

public class Main {

	public static void main(String[] args) {
		Bebida bebida = new Bebida("fanta", "de naranta", null, 1.1, 0);
		System.out.println(bebida.toString());

		/*
		 * System.out.println();
		 * 
		 * Plato plato = new Plato("patatas", "patatas y sal", null, 10) ;
		 * System.out.println(plato.toString());
		 * System.out.println(plato.estaCaducado());
		 * 
		 * System.out.println();
		 * 
		 * 
		 * Plato plato2 = new Plato("albonfigas", "patatas y sal", null, 10) ;
		 * System.out.println(plato2.toString());
		 * plato2.setFechaConsumoPreferente(LocalDate.now().minusDays(100));
		 * System.out.println(plato2.estaCaducado());
		 */
		Cliente cliente = new Cliente(LocalDate.parse("2000-12-03"), null);

		System.out.println(cliente.toString());

		try {
			System.out.println(cliente.solicitarServicio(bebida));
		} catch (ServicioNoDisponibleException e) {
			System.out.println("puta madre");
		}
		System.out.println(cliente.esBebedor());
		System.out.println(cliente.toString());

		Restaurante restaurante = new Restaurante();
		restaurante.darAltaCliente(cliente);
		restaurante.darAltaProducto(bebida);

	}

}
