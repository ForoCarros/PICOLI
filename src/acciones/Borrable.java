package acciones;

import java.awt.Color;

public interface Borrable {

	/**
	 * Busca el color en la lista.
	 * 
	 * @param c
	 *            el color a borrar.
	 */
	public void buscarColor(Color c);

	/**
	 * ELimina el elemento en la lista.
	 */
	public void borrarColor(Color c);

}
