package tests;

import Ubicacion.Place;
import Ubicacion.Ubicacion;
import acciones.Ayuda;
import acciones.Informacion;
import items.Item;
import main.Juego;
import static org.junit.Assert.*;

import org.junit.Test;

public class InformacionTest {

	@Test
	public void test() {
		Juego juego = new Juego("Havacu");
		juego.setNombreJugador("Havacu");
		Informacion informacion= new Informacion(juego);
		informacion.accionar();
	}

}
