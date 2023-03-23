package Boletin_07.Ejercicio_02;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args)  {
		Parking ob1 = new Parking();
		try {
			Vehiculo ob2 = new Vehiculo("toyota", "a", "cqqq1111", Combustibles.electrico, LocalDateTime.of(2011, 10, 10, 8, 50), TipoVehiculo.automovil);
			ob1.agnadirVehiculo(ob2);
		} catch (Exception e) {
			System.out.println("Error al crear el vehiculo, datos no validos");
		}
		
		ob1.ordenarPorTipoCombustible();
		for (Vehiculo v:ob1.getVehiculos()) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
		
		}
	


}

