package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import items.Inventario;
import items.Item;

public class InventarioTest {

	@Test
	public void testInventory() {
		
		Inventario in = new Inventario();
		Item it1 = new Item("mesa",'F','S');		
		Item it2 = new Item("botella",'F','S');
		
		in.agregarItem(it1);
		in.agregarItem(it2);
		
		assertEquals("En tu inventario hay: una mesa. una botella. ", in.listarItems());
		
		in.getItem("botella");
		
		assertEquals("En tu inventario hay: una mesa. ", in.listarItems());
		
	}

}
