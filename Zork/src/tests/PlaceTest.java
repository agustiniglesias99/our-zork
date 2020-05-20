package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import items.Item;
import locations.Place;

public class PlaceTest {

	@Test
	public void test() {
		Item i1 = new Item("botella",'F','S');
		Item i2 = new Item("tarro",'M','S');
		Item i3 = new Item("llaves",'F','P');
		
		Place p1 = new Place("mesa",'F','S');
		
		p1.agregarItem(i1);
		p1.agregarItem(i2);
		p1.agregarItem(i3);
		
		assertEquals("En la mesa hay una botella, un tarro, y unas llaves.", p1.listarItems());
		
		p1.getItem("botella");
		assertEquals("En la mesa hay un tarro, y unas llaves.", p1.listarItems());
	}

}

