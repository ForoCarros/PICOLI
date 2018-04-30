package acciones;

import java.util.ArrayList;
import java.util.Stack;

import modelo.Colores;

public interface Barajable {

	/**
	 * Desordena los elementos de la lista.
	 * 
	 * @param <T>
	 */
	public <T> void barajar(ArrayList<T> lista);

	/**
	 * vuelca las pilas en una lisa auxiliar
	 * 
	 * @param <T>
	 */
	public <T> void volcarPilasEnLista(ArrayList<T> lista, Stack<T> pilaOne, Stack<T> pilaTwo);

	/**
	 * vualca la lista dummy en las pilas
	 * 
	 * @param <T>
	 */
	public <T> void volcarListaEnPilas(ArrayList<T> lista, Stack<T> pilaOne, Stack<T> pilaTwo);

}
