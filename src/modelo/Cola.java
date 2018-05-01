package modelo;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Collection;

public class Cola<T> {
	private ArrayDeque<Colores> cola = new ArrayDeque<>();

	public void introducir(Colores colores) {
		this.cola.add(colores);
	}
	
	public Colores obtener() {
		return this.cola.pollLast();
	}

	public Collection<Colores> getCollectionCola() {
		return cola;
	}
}
