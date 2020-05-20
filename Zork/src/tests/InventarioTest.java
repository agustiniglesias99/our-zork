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
		
		in.addItem(it1, "clave1");
		
		assertEquals("{clave1={Mesa,F}}", in.getItems());
		
	}

}
