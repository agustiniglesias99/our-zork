package items;

import java.util.HashMap;

public class Inventario {
	
	protected String nombre;
	protected HashMap<String, Item> inventory;//Preguntar cual es el value porque no tenia el UML
	protected String descripcion;
	protected String[] aceptar;
	
	
	public Inventario() {
		
		inventory = new HashMap<String, Item>();
		
	}
	
	HashMap<String, Item> getInventory(){
		
		return this.inventory;
		
	}
	
	public void addItem(Item obj, String clave) {
		
		inventory.put(clave, obj);
		
	}
	
	public String getItems() {
		
		return this.inventory.toString();
		
	}
	
	//PREGUNTAR QUE ES AGARRAR ITEM
	
	@Override
	public String toString() {
		return "[inventory=" + inventory + "]";
	}
		
}