package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import acciones.Borrar;
import acciones.Iniciador;
import control.ParaUi;
import logica.Juego;
import modelo.Colores;
import modelo.Datos;

class BorrableTest {
	
	Datos datos=new Datos();
	Iniciador iniciador=new Iniciador(datos);
	Juego juego = new Juego();
	ParaUi paraui=new ParaUi();
	Borrar instancia=new Borrar(paraui);
	
	
	@Test
	void testBuscarColor() {
		ArrayList<Colores> lista= new ArrayList<>();
		ArrayList<Colores> listaDos= new ArrayList<>();
		lista.add(Colores.rojo);
		lista.add(Colores.verde);
		listaDos.add(Colores.verde);
		instancia.buscarColor("rojo", lista);
		assertEquals(listaDos.size(), lista.size());
	}
	
	@Ignore
	void testBorrarColor() {
		ArrayList<Colores> lista= new ArrayList<>();
		lista.add(Colores.rojo);
		instancia.borrarColor(Colores.rojo, lista);
		System.out.println(lista);
		assertTrue(lista.size()==0);
	}

	
	
}
