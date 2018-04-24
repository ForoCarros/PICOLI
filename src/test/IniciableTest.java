package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import acciones.Iniciador;
import modelo.Datos;
import utiles.Constantes;

class IniciableTest {

	@Test
	void test() {
		Datos datos = new Datos();
		Iniciador instancia = new Iniciador(datos);
		instancia.sortearColor();
		assertEquals(Constantes.TAMANO_COLA, datos.getCola().getCollectionCola().size());
		assertNotNull(datos.getCola().obtener());
	}
}
