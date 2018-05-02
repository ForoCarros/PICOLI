package modelo;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

import utiles.Constantes;

public class Cola<T> {
	private ArrayDeque<Colores> cola = new ArrayDeque<>();

	public void introducir(Colores colores) {
		this.cola.addFirst(colores);
	}
	
	public Colores obtener() {
		return this.cola.pollLast();
	}

	public Collection<Colores> getCollectionCola() {
		return cola;
	}

	public Colores sacarPrimero() {
		Colores color=cola.getLast();
		cola.removeLast();
		return color;
	}
	
	public ArrayList<Colores> obtenerTodos() {
		ArrayList<Colores> lista = new ArrayList<>();
		ArrayDeque<Colores> col = this.cola.clone();
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			lista.add(col.removeFirst());
		}
		return lista;
	}
}
