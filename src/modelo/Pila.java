package modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Stack;

public class Pila<T> {
	Stack<T> pila = new Stack<>();
	

	/**
	 * Comprueba si la pila POR PARÁMETRO está llena.
	 * 
	 * @param pila
	 *            la pila a comprobar.
	 * @return true si está llena, false si no.
	 */
	public boolean comprobarLlena(Stack<T> pila) {
		if (pila.size() == utiles.Constantes.TAMANO_PILA) {
			return true;
		}
		return false;
	}

	/**
	 * Introduce el elemento en la cola.
	 * 
	 * @param color
	 *            el elemento a introducir.
	 */
	public void introducir(Color color) {
		pila.push((T) color);
	}

	/**
	 * Obtiene el primer elemento de la pila.
	 * 
	 * @return el primer elemento.
	 */
	public T obtener() {

		return pila.elementAt(0);

	}

	/**
	 * devuelve la pila
	 * 
	 * @return pila
	 */
	public Stack<T> getPilaColores() {
		return (Stack<T>) pila;
	}
}
