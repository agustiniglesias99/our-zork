package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.EndGame;

public class EndGameTest {

	@Test
	public void test() {
		EndGame fin = new EndGame("ubicacion","mover","taberna","¡Enhorabuena! Llegaste a la taberna, donde te espera una noche de borrachera con Grog y otros colegas piratas.");
		
		Assert.assertTrue(fin.comprobar("mover", "taberna"));
		assertEquals("¡Enhorabuena! Llegaste a la taberna, donde te espera una noche de borrachera con Grog y otros colegas piratas.",fin.getDescripcion());
	}

}
