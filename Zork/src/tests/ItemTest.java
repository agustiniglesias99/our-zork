package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import items.Item;

public class ItemTest {

	@Test
	public void test() {
		Item i1 = new Item("botella",'F','S');
		Item i2 = new Item("tarro",'M','S');
		Item i3 = new Item("llaves",'F','P');
		
		assertEquals("botella",i1.getNombre());
		assertEquals("unas llaves",i3.toString());
		assertEquals("un tarro", i2.toString());
		
	}

}
