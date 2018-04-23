package acciones;

import java.util.ArrayList;
import java.util.Stack;

public interface Barajable<T> {

	/**
	 * Vuelca los elementos de la pila en una lista.
	 */
	public void vaciarPila(Stack<T> pila);

	/**
	 * Desordena los elementos de la lista.
	 */
	public void barajar();

	/**
	 * Vuelca los elementos de la lista en las colas de forma equilibrada.
	 */
	public void llenarPila();

	/**
	 * Vacía la lista auxiliar.
	 */
	public void vaciarListaAuxiliar();

}
