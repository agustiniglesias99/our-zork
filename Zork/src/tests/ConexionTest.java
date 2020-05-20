package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import locations.Conexion;
import locations.Location;

public class ConexionTest {

	@Test
	public void test() {
		Location u1 = new Location("pieza",'F');
		Location u2 = new Location("baño",'M');
		Conexion c1 = new Conexion(u1,"norte");
		Conexion c2 = new Conexion(u2,"sur","Fantasma");
		
	}

}
