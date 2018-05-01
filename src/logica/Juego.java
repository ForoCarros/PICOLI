package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Colores;
import modelo.Datos;
import modelo.Pila;
import utiles.Constantes;

public class Juego<T> implements Jugable<T> {

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

	/**
	 * Todo lo necesario para comenzar la jugada en el juego
	 * 
	 * @param se
	 *            pasa el color seleccionado o pedido
	 */
	public void realizarJugada(Colores color) {
		datos.getCola().introducir(color);
		introducirColorPila();
		introducirColorLista();
		comprobarDatosLista();
	}

	/**
	 * Se comprueba diferentes situaciones de la lista que pueden acabar el juego
	 */
	private void comprobarDatosLista() {
		if (comprobarGanador() || comprobarListaLlena()) {
			System.out.println("O has ganado o has perdido, lo que surja");
		} else {
			if (datos.getLista().comprobarColoresIguales()) {
				datos.getLista().borrarTresPrimeros();
			}
		}
	}

	/**
	 * Se introduce un color en la lista desde la pila elegida aleatoriamente, con
	 * sus respectivas comprobaciones
	 */
	private void introducirColorLista() {
		boolean pilaCorrecta = false;
		while (!pilaCorrecta) {
			Pila<Colores> pilaRandom = datos.seleccionarPilaAleatoria();
			if (!pilaRandom.comprobarVacia()) {
				Colores color = pilaRandom.obtener();
				datos.getLista().introducir(color);
				pilaCorrecta = true;
			}
		}
	}

	/**
	 * Se introduce un color en la pila desde la cola, con sus respectivas
	 * comprobaciones
	 */
	private void introducirColorPila() {
		boolean pilaCorrecta = false;
		Colores colorPrimero = datos.getCola().sacarPrimero();
		while (!pilaCorrecta) {
			Pila<Colores> pilaRandom = datos.seleccionarPilaAleatoria();
			if (!pilaRandom.comprobarLlena()) {
				pilaRandom.introducir(colorPrimero);
				pilaCorrecta = true;
			}
		}
	}
}
