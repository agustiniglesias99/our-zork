package locations;

public class Conexion { // TODO: hecho, falta armar tests.
	
	Location location;
	String direccion;
	boolean habilitado;
	String obstaculo;
	
	public Conexion(Location location, String direccion) {
		this.location = location;
		this.direccion = direccion;
		this.habilitado = true;
	}
	
	public Conexion(Location location, String direccion, String obstaculo) {
		this.location = location;
		this.direccion = direccion;
		this.obstaculo = obstaculo;
		this.habilitado = false;
	}

	public Location getLocation() {
		return location;
	}
	
	public void habilitar() {
		habilitado = true;
	}	
	public void deshabilitar() {
		habilitado = false;
	}
	public String getObstaculo() {
		return obstaculo;
	}
	
	
}
