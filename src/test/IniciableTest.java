package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Datos;

class IniciableTest {

	@Test
	void test() {
		Datos datos = new Datos();
		Iniciador iniciador = new Iniciador(datos);
		
	}

}
