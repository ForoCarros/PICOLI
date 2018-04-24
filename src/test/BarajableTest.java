package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import acciones.Barajar;
import acciones.Iniciador;
import control.ParaUi;
import logica.Juego;
import modelo.Colores;
import modelo.Datos;

class BarajableTest {
	
	Datos datos=new Datos();
	Iniciador iniciador=new Iniciador(datos);
	Juego juego = new Juego();
	ParaUi paraui=new ParaUi(juego, iniciador);
	Barajar instancia = new Barajar(paraui);

	@Test
	void barajar() {
		ArrayList<Integer> lista= new ArrayList<>();
		ArrayList<Integer> listaDos= new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lista.add(i);
			listaDos.add(i);
		}
		assertEquals(lista, listaDos);
		instancia.barajar(lista);
		assertNotEquals(lista, listaDos);
	}

	@Ignore
	void volcarPilasEnLista() {
		fail("Not yet implemented");
	}
	
	@Ignore
	void volcarListaEnPilas() {
		fail("Not yet implemented");
	}
}
