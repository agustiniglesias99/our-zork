package locations;

import java.util.LinkedList;
import java.util.List;
//import items.Item;
import jugadores.Npc;

public class Location { // TODO: hecho, falta armar tests.

	private String nombre;
	private Character genero;
	private List<Place> sitios;
//	private List<Item> items;// considero que items va en place no en location.
	private List<Conexion> conexiones;
	private List<Npc>npcs;

	public Location(String nombre, Character genero) {
		this.genero = genero;
		this.nombre = nombre;

		conexiones = new LinkedList<>();
//		items = new LinkedList<>(); // para mi esto no va aca, va en Place
		sitios = new LinkedList<>();
		npcs = new LinkedList<>();
	}

	public void agregarConexion(Conexion conexion) {
		conexiones.add(conexion);
	}
	
	public void agregarPlace(Place sitio) {
		sitios.add(sitio);
	}
	
	public void agregarNpc(Npc personaje) {
		npcs.add(personaje);
	}
//	public void agregarItem(Item item) { // considero que no va aca.
//		items.add(item);
//	}

	public boolean removeNpc(String personaje) {
		for (Npc npc : npcs) {
			if(npc.getNombreNpc().equals(personaje)) {
				for (Conexion conexion : conexiones) {
					if(conexion.getObstaculo().equals(personaje))
						conexion.habilitar();
				}
				return npcs.remove(npc);
			}
		}
		return false;
	}
	
	public String listarPlaces() {
		String listaPlace = "";
		for (Place sitio : sitios) {
			listaPlace+=sitio.toString();
			listaPlace+=", ";
		}
		return listaPlace;	
	}
//	public List<Item> getItems() {
//		return items;
//	}
	
	public List<Conexion> getConexiones() {
		return conexiones;
	}


	private Character getGenero() {
		return genero;
	}

	public void describir() {

		/*Articulos determinados: el, la
		  Articulos indererminados: una, uno*/

		String articuloDeterminado = genero == 'F' ? "la" : "el";

		String cad = "Estas en " + articuloDeterminado + " " + nombre + ".";

		if (!conexiones.isEmpty())
			cad += cadenaConexiones();
		if(!sitios.isEmpty())
			cad += cadenaSitios();

		System.out.println(cad);
	}

	public String cadenaSitios() {
		String cadenaSitios = "Hay ";
		Place sitio;
		for (int indice = 0; indice < sitios.size(); indice++) {
			sitio = sitios.get(indice);
			if(indice + 1 == sitios.size()) 
				cadenaSitios += "y " + sitio.toString();
			else
				cadenaSitios += sitio.toString() + " ";
		}
		return cadenaSitios;
	}

	public String cadenaConexiones() {

		String cadenaConexiones = " Se ve a lo lejos ";

		String articuloIndeterminado = null;
		Conexion conexion;
		Location location;

		for (int indice = 0; indice < conexiones.size(); indice++) {

			conexion = conexiones.get(indice);
			location = conexion.getLocation();

			articuloIndeterminado = location.getGenero() == 'F' ? "una" : "un";

			// si es el ultimo de la lista
			if (indice + 1 == conexiones.size()) {
				cadenaConexiones += "y " + articuloIndeterminado + " " + location.getNombre() + ".";
			} else {
				cadenaConexiones += articuloIndeterminado + " " + location.getNombre() + ", ";
			}
		}

		return cadenaConexiones;
	}

//	public String cadenaItems() {//CONSIDERO QUE ESTO NO VA ACA PORQUE ES UN ITEM, QUE ESTA EN UN PLACE NO EN UNA LOCATION
//
//		String articuloIndeterminado;
//
//		String cadenaItems = "A tu alrededor hay ";
//
//		Item item;
//		for (int indice = 0; indice < items.size(); indice++) {
//
//			item = items.get(indice);
//
//			articuloIndeterminado = item.getGenero() == 'F' ? "una" : "un";
//
//			// si es el ultimo item
//			if (indice + 1 == items.size()) {
//				cadenaItems += "y " + articuloIndeterminado + " " + item.getNombre() + ".";
//			} else {
//				cadenaItems += articuloIndeterminado + " " + item.getNombre() + ", ";
//			}
//		}
//		return cadenaItems;
//	}

	private String getNombre() {
		return nombre;
	}

	public boolean sePuedeMoverAConexion(Location nuevaLocation) {

		Location location = null;
		for (Conexion conexion : conexiones) {
			
			location = conexion.getLocation();
			if (location.getNombre() == nuevaLocation.getNombre() && conexion.habilitado) {
				return true;
			}
		}
		return false;
	}
}
