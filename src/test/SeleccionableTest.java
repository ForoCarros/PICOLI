package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import acciones.Iniciador;
import acciones.Seleccionar;
import control.ParaUi;
import logica.Juego;
import modelo.Colores;
import modelo.Datos;

class SeleccionableTest {
	
	Datos datos=new Datos();
	Iniciador iniciador=new Iniciador(datos);
	Juego juego = new Juego();
	ParaUi paraui=new ParaUi();
	Seleccionar instancia =new Seleccionar(paraui);

	@Test
	void testSeleccionarColor(String c) {
		assertNotNull(datos.getHistorial().comprobarHistorial(datos.getCola()));
		assertFalse(datos.getHistorial().toString().isEmpty());
	}

}
