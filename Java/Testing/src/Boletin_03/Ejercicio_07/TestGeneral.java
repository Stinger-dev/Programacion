package Boletin_03.Ejercicio_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGeneral {

	@Test
	void testsCaja() {
		Caja ob1 = new Caja();
		assert (!ob1.isAbierto());
		ob1.abrirCaja();
		assert (ob1.isAbierto());
		try {
			ob1.cerrarCaja();
		} catch (CajaException e) {
			fail("Deberia haber dejado borrar ya que no hay clientes");
		}
		ob1.abrirCaja();
		assertEquals(null, ob1.getSiguienteCliente());
		assertEquals(0, ob1.getTamagnoCola());
		Cliente cliente = new Cliente(1);
		ob1.nuevoCliente(cliente);
		assertEquals(1, ob1.getTamagnoCola());
		assertEquals(cliente, ob1.getSiguienteCliente());
		ob1.clienteAtendido();
		assertEquals(0, ob1.getTamagnoCola());
		assertEquals(null, ob1.getSiguienteCliente());
	}

	@Test
	void testsAlmacen() {

		GranAlmacen almacen = new GranAlmacen();
		try {
			almacen.atenderCliente(0);
			fail();
		} catch (CajaException e) {
			assert (true);
		}
		try {
			almacen.nuevoCliente();
		} catch (GranAlmacenException e) {
			fail("no deberia fallar");
		}

		try {
			almacen.atenderCliente(0);
		} catch (CajaException e) {
			fail();
		}
		try {
			almacen.atenderCliente(0);
			fail();
		} catch (CajaException e) {
			assert (true);
		}
		try {
			almacen.abrirCaja(2);
		} catch (CajaException e) {
			e.printStackTrace();
			fail();
		}
		try {
			almacen.abrirCaja(2);
			fail();
		} catch (CajaException e) {
			assert (true);
		}

		try {

			System.out.println(almacen.nuevoCliente().toString());
		} catch (GranAlmacenException e) {
			fail("no deberia fallar");
		}
		try {
			almacen.nuevoCliente();
		} catch (GranAlmacenException e) {
			fail("no deberia fallar");
		}
		try {
			almacen.nuevoCliente();
		} catch (GranAlmacenException e) {
			fail("no deberia fallar");
		}

		try {
			System.out.println(almacen.atenderCliente(0));
		} catch (CajaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
