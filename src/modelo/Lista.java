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
		lista.add(0, elemento);
	}

	/**
	 * Comprueba si son iguales.
	 * 
	 * @param inicio
	 *            el índice de inicio.
	 * @param rango
	 *            longitud a partir de inicio.
	 */
	public boolean comprobarColoresIguales(int inicio, int rango) {
		boolean cont = true;
		for (int i = 0; i < rango - 1 && cont; i++) {
			if(!lista.get(i).equals(lista.get(i + 1))) {
				cont = false;
			}
		}
		return cont;
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

	/**
	 * Te devuelve la lista con todo lo que tenga
	 * 
	 * @return la lista
	 */
	public ArrayList<Colores> getListaColores() {
		return (ArrayList<Colores>) lista;
	}

	/**
	 * Al comprobar que los tres primeros colores son iguales hay que eliminarlos de
	 * la lista
	 */
	public void borrarTresPrimeros() {
		for (int i = 0; i < 3; i++) {
			lista.remove(0);
		}
	}
}
