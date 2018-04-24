package modelo;

public class Datos {

	private Cola<Colores> cola;
	private Lista<Colores> lista;
	private Pila<Colores> pilaUno;
	private Pila<Colores> pilaDos;
	private Historial historial;

	public Datos(Cola<Colores> cola, Lista<Colores> lista, Pila<Colores> pilaUno, Pila<Colores> pilaDos,
			Historial historial) {
		super();
		this.cola = cola;
		this.lista = lista;
		this.pilaUno = pilaUno;
		this.pilaDos = pilaDos;
		this.historial = historial;
	}

	public Cola<Colores> getCola() {
		return cola;
	}

	public Lista<Colores> getLista() {
		return lista;
	}

	public Pila<Colores> getPilaUno() {
		return pilaUno;
	}

	public Pila<Colores> getPilaDos() {
		return pilaDos;
	}

	public Historial getHistorial() {
		return historial;
	}
	
	
}
