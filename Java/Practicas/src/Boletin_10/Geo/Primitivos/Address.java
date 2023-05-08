package Boletin_10.Geo.Primitivos;

public class Address  {
	private int idDireccion;
	private String address;
	private String estado;
	
	public Address(int idDireccion, String address, String estado) {
		super();
		this.idDireccion = idDireccion;
		this.address = address;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return String.format("\t\t·%s, %s con id %s\n", this.estado, this.address, this.idDireccion);
	}
	
	
	
	
	
	

}
