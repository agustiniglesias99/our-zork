package main;

public class EndGame {
	private String condicion;
	private String accion;
	private String cosa;
	private String descripcion;
	
	public EndGame(String condicion, String accion, String cosa, String descripcion) {
		this.condicion = condicion;
		this.accion = accion;
		this.cosa = cosa;
		this.descripcion = descripcion;
	}
	
//// GETTERS ////
	public String getCondicion() {
		return condicion;
	}
	
	public String getAccion() {
		return accion;
	}
	
	public String getCosa() {
		return cosa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
/// CONDICION DE FIN ////
	public boolean comprobar(String accion, String sustantivo) { /* los argumentos son los que devuelve el interprete*/
		if(this.accion.equals(accion) && this.cosa.equals(sustantivo)) {
			return true;
		}
		return false;
	}
}
