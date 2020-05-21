package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Ubicacion.Place;
import items.Item;

public class PlaceTest {

	@Test
	public void test() {
		Item i1 = new Item("botella",'F','S');
		Item i2 = new Item("tarro",'M','S');
		Item i3 = new Item("llaves",'F','P');
		Item i4;
		
		Place p1 = new Place("mesa",'F','S');
		Place p2 = new Place("suelo",'M','S');
		
		p1.agregarItem(i1);
		p1.agregarItem(i2);
		p1.agregarItem(i3);
		
		assertEquals("En la mesa hay una botella, un tarro, y unas llaves.", p1.listarItems());
		
		i4 = p1.getItem("botella");
		assertEquals("En la mesa hay un tarro, y unas llaves.", p1.listarItems());
		
		p2.agregarItem(i4);
		assertEquals("En el suelo hay una botella.", p2.listarItems());
		
		
	}

}

