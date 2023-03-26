package Boletin_07.Ejercicio_02;

import java.time.LocalDateTime;

import Boletin_07.Ejercicio_02.Enumerates.Combustibles;
import Boletin_07.Ejercicio_02.Enumerates.TipoVehiculo;

public class Main {
	public static void main(String[] args)  {
		Parking ob1 = new Parking();
		try {
			Vehiculo ob2 = new Vehiculo("b", "a", "bqqq1111", Combustibles.electrico, LocalDateTime.of(2010, 10, 10, 8, 50), TipoVehiculo.automovil);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		try {
			Vehiculo ob2 = new Vehiculo("b", "b", "cqqq1111", Combustibles.hibrido, LocalDateTime.of(2000, 10, 10, 8, 50), TipoVehiculo.ciclomotor);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}

		try {
			Vehiculo ob2 = new Vehiculo("a", "b", "aqqq1111", Combustibles.electrico, LocalDateTime.of(2001, 10, 10, 8, 50), TipoVehiculo.ciclomotor);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		
		try {
			Vehiculo ob2 = new Vehiculo("a", "a", "dqqq1111", Combustibles.electrico, LocalDateTime.of(2023, 10, 10, 8, 50), TipoVehiculo.ciclomotor);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		
		try {
			Vehiculo ob2 = new Vehiculo("z", "b", "fqqq1111", Combustibles.electrico, LocalDateTime.of(1000, 10, 10, 8, 50), TipoVehiculo.ciclomotor);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		
		
		ob1.ordenarPorFecha();
		mostar(ob1);
		System.out.println("---------------------------------");
		
		ob1.ordenarPorMarcaModelo();
		mostar(ob1);
		System.out.println("---------------------------------");

		ob1.ordenarPorMatricula();
		mostar(ob1);
		System.out.println("---------------------------------");

		ob1.ordenarPorTipoCombustible();
		mostar(ob1);
		System.out.println("---------------------------------");

		try {
			Vehiculo ob2 = new Vehiculo("z", "b", "bqqq1111", Combustibles.electrico, LocalDateTime.of(1000, 10, 10, 8, 50), TipoVehiculo.ciclomotor);
			ob1.salirCoche(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		mostar(ob1);
		System.out.println(ob1.toString());
		
	}	
	
	
	
	public static void mostar(Parking ob1) {
		for (Vehiculo v:ob1.getVehiculos()) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
	}
	


}

