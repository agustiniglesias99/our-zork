package main;
import Ubicacion.*;
import acciones.Moverse;
import items.Item;

public class Juego { // TODO: hecho, falta armar tests.

	Ubicacion ubicacionActual;
	String nombreJugador;
	// TODO: agregar un objeto que guarde los pasos 
	
	public void generarEntorno() {
		
		/**Creo las locations*/
		Ubicacion taberna = new Ubicacion("taberna", 'F') ;
		Ubicacion muelle = new Ubicacion("muelle", 'M') ;
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
		ubicacionActual = muelle;
		
		//describirTest: mensaje inicial del juego
		ubicacionActual.describir();
		
		//cambiarLocationTest: mensaje inicial del juego
		Moverse moverse = new Moverse(this);
		moverse.accionar(taberna);
		
		//cambiarLocationTestNOK
		moverse.accionar(muelle);
	}
	
	public void setNombreJugador(String nombre) {
		this.nombreJugador = nombre;
	}

	public void setLocation(Ubicacion ubicacion) {
		this.ubicacionActual = ubicacion;
		
		/*luego de cambiar de ubicacion, describo el luegar donde ahora se encuentra el jugador*/
		ubicacion.describir();
	}

	public Ubicacion getUbicacion() {
		return ubicacionActual;
	}
	
}
