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
	public ArrayList<Integer> comprobarColoresIguales(int inicio, int fin, int rango) {
		ArrayList indices = new ArrayList<>();
		for (int i = inicio; i < fin - rango; i++) {
			boolean iguales = true;
			for (int j = 0; j < rango && iguales; j++) {
				iguales = this.lista.get(i).equals(this.lista.get(i + j));
				System.out.println(this.lista.get(i) + " - " + this.lista.get(i + 1) + " --> " + iguales);
			}
			if (iguales) {
				indices.add(i);
			}
		}
		return indices;
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
	public void borrarColor(int indice) {
		this.lista.remove(indice);
	}
}
