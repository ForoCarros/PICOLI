package logica;

import java.util.Stack;

public interface Jugable<T> {
	/**
	 * Disminuye una unidad el valor introducido.
	 * 
	 */
	public void disminuirIntentos(int c);

	/**
	 * Comprueba si el n�mero de monedas ha superado o igualado el m�ximo.
	 * 
	 * @return true si supera o iguala, false si no.
	 */
	public boolean comprobarGanador();

	/**
	 * Incrementa el n�mero de monedas.
	 */
	public void incrementarMonedas();

	/**
	 * COmprueba si la lista est� al m�ximo de la capacidad.
	 * 
	 * @return true si lo est�, false si no.
	 */
	public boolean comprobarListaLlena();

}
