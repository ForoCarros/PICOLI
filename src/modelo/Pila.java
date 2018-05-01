package modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Stack;

public class Pila<T> {

	private Stack<T> pila = new Stack<>();

	/**
	 * Comprueba si la pila POR PARÁMETRO está llena.
	 * 
	 * @param pila
	 *            la pila a comprobar.
	 * @return true si está llena, false si no.
	 */
	public boolean comprobarLlena() {
		if (pila.size() == utiles.Constantes.TAMANO_PILA) {
			return true;
		}
		return false;
	}
	
	/**
	 * Comprueba si una pila esta completamente vacia
	 * @return
	 */
	public boolean comprobarVacia() {
		if(pila.size()==0) return true;
		return false;
	}

	/**
	 * Introduce el elemento en la cola.
	 * 
	 * @param colores
	 *            el elemento a introducir.
	 */
	public void introducir(T colores) {
		pila.push(colores);
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
