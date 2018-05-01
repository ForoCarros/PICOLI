package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Cola;
import modelo.Colores;
import modelo.Historial;

class HistoriableTest {
Historial instancia = new Historial();
Cola<Colores> cola = new Cola<>();
	@Test
	void testComprobarHistorial() {
		cola.introducir(Colores.rojo);
		cola.introducir(Colores.verde);
		cola.introducir(Colores.amarillo);
		cola.introducir(Colores.rojo);
		cola.introducir(Colores.amarillo);
		ArrayList<Colores> listaColoresDisponibles = new ArrayList<>();
		listaColoresDisponibles.add(Colores.azul);
		listaColoresDisponibles.add(Colores.verde);
		listaColoresDisponibles.add(Colores.naranja);
		assertEquals(instancia.comprobarHistorial(cola), listaColoresDisponibles);
	}
}
