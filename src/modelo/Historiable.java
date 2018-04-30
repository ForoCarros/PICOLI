package modelo;

import java.util.ArrayList;

public interface Historiable<T> {

	/**
	 * Comprueba el historial de colores elegidos para quitar los repetidos
	 * @param e
	 * @return
	 */
	public ArrayList<T> comprobarHistorial(Cola<T> e);
	
}
