package logica;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

import modelo.Colores;
import modelo.Datos;
import modelo.Lista;
import modelo.Pila;
import utiles.Constantes;

public class Juego<T> implements Jugable<T> {

	private Datos datos;
	private int intentosBorrar = Constantes.PETICION_BORRAR_MAX;
	private int intentosPedir = Constantes.PETICION_COLOR_MAX;
	private int intentosBarajar = Constantes.PETICION_BARAJAR_MAX;
	private int tamanoListaMax = Constantes.TAMANO_LISTA;
	private int monedasMax = Constantes.CANTIDAD_MAX_MONEDAS;
	private int monedas = 0;

	public Juego(Datos datos) {
		this.datos = datos;
	}

	@Override
	public void disminuirIntentos(int c) {
		c--;
	}

	@Override
	public boolean comprobarGanador() {
		if (monedas >= monedasMax) {
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
		if (datos.getLista().getListaColores().size() >= tamanoListaMax) {
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
	
	public void disminuirIntentosBarajar() {
		intentosBarajar--;
	}
	
	public void disminuirIntentosPedir() {
		intentosPedir--;
	}
	
	public void disminuirIntentosBorrar() {
		intentosBorrar--;
	}

	/**
	 * Todo lo necesario para comenzar la jugada en el juego
	 * 
	 * @param se
	 *            pasa el color seleccionado o pedido
	 */
	public void realizarJugada(Colores color) {
		this.datos.getCola().introducir(color);
		introducirColorPila();
		introducirColorLista();
		comprobarDatosLista();
	}

	/**
	 * Se comprueba diferentes situaciones de la lista que pueden acabar el juego
	 */
	public void comprobarDatosLista() {
		if (datos.getLista().getListaColores().size() >= 3) {
			borrarColores();
		}
	}

	// A V I S O : H A R D C O D E O M U Y F U E R T E

	private void borrarColores() {
		ArrayList<Colores> lista = this.datos.getLista().getListaColores();
		for (int i = 0; i < lista.size() - 3; i++) {
			if (lista.get(i) == lista.get(i + 1) && lista.get(i + 1) == lista.get(i + 2)) {
				this.datos.getLista().borrarColor(i);
				this.datos.getLista().borrarColor(i);
				this.datos.getLista().borrarColor(i);
				incrementarMonedas();
			}
		}
	}

	/**
	 * Se introduce un color en la lista desde la pila elegida aleatoriamente, con
	 * sus respectivas comprobaciones
	 */
	private void introducirColorLista() {
		if (this.datos.getPilaUno().getPilaColores().size() == Constantes.TAMANO_PILA
				|| this.datos.getPilaDos().getPilaColores().size() == Constantes.TAMANO_PILA) {
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
	}

	/**
	 * Se introduce un color en la pila desde la cola, con sus respectivas
	 * comprobaciones
	 */
	private void introducirColorPila() {
		boolean pilaCorrecta = false;
		Colores colorPrimero = datos.getCola().sacarPrimero();
		do {
			Pila<Colores> pilaRandom = datos.seleccionarPilaAleatoria();
			if (!pilaRandom.comprobarLlena()) {
				pilaRandom.introducir(colorPrimero);
				pilaCorrecta = true;
			}
		} while (!pilaCorrecta);
	}
}
