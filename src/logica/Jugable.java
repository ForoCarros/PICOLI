package logica;

import java.util.Stack;

public interface Jugable<T> {
	/**
	 * Disminuye una unidad el valor introducido.
	 * 
	 */
	public void disminuirIntentos(int c);

	/**
	 * Comprueba si el número de monedas ha superado o igualado el máximo.
	 * 
	 * @return true si supera o iguala, false si no.
	 */
	public boolean comprobarGanador();

	/**
	 * Incrementa el número de monedas.
	 */
	public void incrementarMonedas();

	/**
	 * COmprueba si la lista está al máximo de la capacidad.
	 * 
	 * @return true si lo está, false si no.
	 */
	public boolean comprobarListaLlena();

}
