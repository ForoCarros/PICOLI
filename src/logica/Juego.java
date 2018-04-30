package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Datos;
import utiles.Constantes;

public class Juego<T> implements Jugable<T> {

	// Tengo que crear mas cosas que faltaban

	private Datos datos;
	private int intentosBorrar = Constantes.PETICION_BORRAR_MAX;
	private int intentosPedir = Constantes.PETICION_COLOR_MAX;
	private int intentosBarajar = Constantes.PETICION_BARAJAR_MAX;
	private int monedas = 0;

	@Override
	public void disminuirIntentos(int c) {
		c--;
	}

	@Override
	public boolean comprobarGanador() {
		if (monedas >= Constantes.CANTIDAD_MAX_MONEDAS) {
			return true;
		}
		return false;
	}

	@Override
	public void incrementarMonedas() {
		monedas++;
	}

	@Override
	public boolean comprobarListaLlena() {

		// El primer getLista coge el objeto Lista. El segundo coge el arrayList de
		// Lista.
		if (datos.getLista().getListaColores().size() >= Constantes.TAMANO_LISTA) {
			return true;
		}
		return false;
	}

	public Datos getDatos() {
		return this.datos;
	}

	public int getMonedas() {
		return monedas;
	}

	public int getIntentosBorrar() {
		return intentosBorrar;
	}

	public int getIntentosPedir() {
		return intentosPedir;
	}

	public int getIntentosBarajar() {
		return intentosBarajar;
	}

	// Esto nose si va aqui, yo creo que si y tiene tela!

	public void realizarJugada(Color color) {
		// TODO Auto-generated method stub

	}

}
