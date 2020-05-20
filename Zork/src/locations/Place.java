package locations;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import items.Item;

public class Place {

	protected String nombre;
	protected Character genero;
	protected Character numero;
	protected List<Item> items;
	
	public Place(String nom, Character gen, Character num) {
		
		this.nombre = nom;
		this.genero = gen;
		this.numero = num;
		
		items = new LinkedList<>();
		
	}

	public String getName() {
		return nombre;
	}

	public Character getGenero() {
		return genero;
	}

	public char getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		String descripcionSitio = "";
		if(numero == 's')
			descripcionSitio += genero == 'F' ? "una " : "un ";
		else
			descripcionSitio += genero == 'F' ? "unas " : "unos ";
		return descripcionSitio + getNombre();
	}
	
	public void agregarItem(Item objeto) {
		items.add(objeto);	
	}
	
	public String listarItems() {
		String listaItems = "En ";
		listaItems += genero == 'F'? "la " : "el ";
		listaItems += getNombre() + " hay ";
		Item item;
		for (int indice = 0; indice < items.size(); indice++) {

			item = items.get(indice);

			// si es el ultimo item
			if (indice + 1 == items.size()) {
				listaItems += "y "  + item.toString() + ".";
			} else {
				listaItems += item.toString() + ", ";
			}
		}
//		for (Item item : items) {
//			listaItems+=item.toString();
//			listaItems+=", ";
//		}
		return listaItems;	
	}
	public Item getItem(String objeto) { /*remueve el item de la lista, lo saca del place donde se encuentra*/
		Item aux = null;
		for (Item item : items) {
			if(item.getNombre().equals(objeto)) {
				aux = new Item(item.getNombre(),item.getGenero(),item.getNumero());
				items.remove(item);
				break;
			}	
		}
		return aux;
	}
	 
	 public String getNombre() {
		 return nombre;
	 }
}
