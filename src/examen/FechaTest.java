package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	
	Fecha ft=new Fecha();
	@Test
	void CP1() {
		assertFalse(ft.validarFecha(-1, 0, 0));
	}
	@Test
	void CP2() {
		assertFalse(ft.validarFecha(1, -1, 0));
	}
	@Test
	void CP3() {
		assertFalse(ft.validarFecha(1, 1, -1));
	}
	@Test
	void CP4() {
		assertFalse(ft.validarFecha(1, 13, 1));
	}

}
