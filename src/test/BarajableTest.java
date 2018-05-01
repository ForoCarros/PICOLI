package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Stack;

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
	ParaUi paraui=new ParaUi();
	Barajar instancia = new Barajar(paraui);

	@Ignore
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
		Stack<Colores> pilaOne=datos.getPilaUno().getPilaColores();
		Stack<Colores> pilaTwo=datos.getPilaDos().getPilaColores();
		ArrayList<Colores> lista= new ArrayList<>();
		ArrayList<Colores> listaDos= new ArrayList<>();
		listaDos.add(Colores.amarillo);
		listaDos.add(Colores.azul);
		pilaOne.add(Colores.amarillo);
		pilaTwo.add(Colores.azul);
		assertTrue(lista.size()==0);
		instancia.volcarPilasEnLista(lista, pilaOne, pilaTwo);
		assertEquals(lista, listaDos);
	}
	
	@Test
	void volcarListaEnPilas() {
		ArrayList<Colores> lista= new ArrayList<>();
		Stack<Colores> pilaOne=datos.getPilaUno().getPilaColores();
		Stack<Colores> pilaTwo=datos.getPilaDos().getPilaColores();
		lista.add(Colores.amarillo);
		lista.add(Colores.azul);
		lista.add(Colores.verde);
		assertEquals(pilaOne.size(),pilaTwo.size());
		instancia.volcarListaEnPilas(lista, pilaOne, pilaTwo);
		assertTrue(lista.size()==0);
		assertNotEquals(pilaOne.size(),pilaTwo.size());
	}
}
