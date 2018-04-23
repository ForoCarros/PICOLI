package modelo;

import java.util.ArrayDeque;
import java.util.Collection;

public class Cola<T> {
	private ArrayDeque<T> cola = new ArrayDeque<>();

	public void introducir(T elemento) {
		this.cola.add(elemento);
	}
	
	public T obtener() {
		return this.cola.pollLast();
	}

	public Collection<T> getCollectionCola() {
		return cola;
	}
}
