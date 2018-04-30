package modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class Lista<T> {

	private ArrayList<T> lista = new ArrayList<>();

	/**
	 * Introduce un elemento en la lista.
	 * 
	 * @param elemento
	 */
	public void introducir(T elemento) {
		lista.add(elemento);
	}

	/**
	 * Comprueba si son iguales.
	 * 
	 * @param inicio
	 *            el índice de inicio.
	 * @param rango
	 *            longitud a partir de inicio.
	 */
	public boolean comprobarIguales() {

		if (lista.size() > 3) {
			if (lista.get(0).equals(lista.get(1)) && lista.get(0).equals(lista.get(2))) {
				return true;
			}
		}
		return false;

	}

	/**
	 * Lista creada para guardar los elementos de las dos pilas a la hora de barajar
	 * 
	 * @param listaAux
	 *            la lista auxiliar
	 * 
	 */
	public void vaciarListaAuxiliar(ArrayList<T> listaAux) {
		listaAux.clear();
	}

	public ArrayList<Colores> getListaColores() {
		return (ArrayList<Colores>) lista;
	}
}
