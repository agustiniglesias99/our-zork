package main;
import acciones.Moverse;
import items.Item;
import locations.*;

public class Juego { // TODO: hecho, falta armar tests.

	Location locationActual;
	String nombreJugador;
	// TODO: agregar un objeto que guarde los pasos 
	
	public void generarEntorno() {
		
		/**Creo las locations*/
		Location taberna = new Location("taberna", 'F') ;
		Location muelle = new Location("muelle", 'M') ;
		Place mesa = new Place("Suelo",'F','S');
		Place rincon = new Place("Rincon",'M','S');
		//set taberna
		
		mesa.agregarItem(new Item("cuchillo",'M','S'));
		mesa.agregarItem(new Item("cerveza",'F','S'));
		
		taberna.agregarPlace(mesa);

		// set muelle
		muelle.agregarConexion(new Conexion(taberna, "norte"));
		rincon.agregarItem(new Item("espejo",'M','S'));
		muelle.agregarPlace(rincon);

		
		// TODO: ver como ejecutar estos 3 test desde Junit sin modificar la interface.
		// asignacion de location inicial
		locationActual = muelle;
		
		//describirTest: mensaje inicial del juego
		locationActual.describir();
		
		//cambiarLocationTest: mensaje inicial del juego
		Moverse moverse = new Moverse(this);
		moverse.accionar(taberna);
		
		//cambiarLocationTestNOK
		moverse.accionar(muelle);
	}
	
	public void setNombreJugador(String nombre) {
		this.nombreJugador = nombre;
	}

	public void setLocation(Location location) {
		this.locationActual = location;
		
		/*luego de cambiar de ubicacion, describo el luegar donde ahora se encuentra el jugador*/
		location.describir();
	}

	public Location getLocation() {
		return locationActual;
	}
	
}
