package acciones;

import java.awt.Color;
import java.util.ArrayList;

import modelo.Colores;

public interface Borrable {

	/**
	 * Busca el color en la lista.
	 * 
	 * @param <T>
	 * 
	 * @param c
	 *            el color a borrar.
	 */
	public void buscarColor(String c, ArrayList<Colores> lista);

	/**
	 * ELimina el elemento en la lista.
	 */
	public void borrarColor(Colores c, ArrayList<Colores> lista);

}
