package modelo;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

import utiles.Constantes;

public class Cola<T> {
	private ArrayDeque<Colores> cola = new ArrayDeque<>();

	/**
	 * Introduce un color al principio de la cola
	 * @param colores
	 */
	public void introducir(Colores colores) {
		this.cola.addFirst(colores);
	}
	
	/**
	 * obtiene el color ultimo de la cola
	 * @return
	 */
	public Colores obtener() {
		return this.cola.pollLast();
	}

	/**
	 * obtiene la cola entera
	 * @return
	 */
	public Collection<Colores> getCollectionCola() {
		return cola;
	}

	/**
	 * obtiene el color primero de la cola, eliminandolo de la cola
	 * @return
	 */
	public Colores sacarPrimero() {
		Colores color=cola.getLast();
		cola.removeLast();
		return color;
	}
	
	/**
	 * esto no entiendo...
	 * @return
	 */
	public ArrayList<Colores> obtenerTodos() {
		ArrayList<Colores> lista = new ArrayList<>();
		ArrayDeque<Colores> col = this.cola.clone();
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			lista.add(col.removeFirst());
		}
		return lista;
	}
}
