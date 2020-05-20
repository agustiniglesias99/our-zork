package acciones;

import locations.Location;
import main.Juego;

public class Moverse extends Accion{ // TODO: hecho, falta armar tests.

	
	Location locationActual;
	Juego juego;
	
	public Moverse(Juego juego) {
		
		this.locationActual = juego.getLocation();
		this.juego = juego;
		nombre = "moverse";
	}
	

	/* NOTA: usamos clases para cada accion para luego poder aplicar algun patron de diseño. 
			 Habria que unificar la interfaz de todas las acciones con un objeto propertires*/
	public void accionar(Location nuevaLocation) {
	
		Location location = juego.getLocation();
		
		if(location.sePuedeMoverAConexion(nuevaLocation)) {	
			juego.setLocation(nuevaLocation);
		}else {
			System.out.println("no podes moverte ahi");
		}
	}

}
