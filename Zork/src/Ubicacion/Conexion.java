package Ubicacion;

public class Conexion { // TODO: hecho, falta armar tests.
	
	Ubicacion ubicacion;
	String direccion;
	boolean habilitado;
	String obstaculo;
	
	public Conexion(Ubicacion ubicacion, String direccion) {
		this.ubicacion = ubicacion;
		this.direccion = direccion;
		this.habilitado = true;
	}
	
	public Conexion(Ubicacion ubicacion, String direccion, String obstaculo) {
		this.ubicacion = ubicacion;
		this.direccion = direccion;
		this.obstaculo = obstaculo;
		this.habilitado = false;
	}

	public Ubicacion getLocation() {
		return ubicacion;
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
