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
	public <T> void barajar();

	/**
	 * vuelca las pilas en una lisa auxiliar
	 * 
	 * @param <T>
	 */
	public <T> void volcarPilasEnLista();

	/**
	 * vualca la lista dummy en las pilas
	 * 
	 * @param <T>
	 */
	public <T> void volcarListaEnPilas();

}
