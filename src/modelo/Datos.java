package modelo;

public class Datos {

	private Cola<Colores> cola;
	private Lista<Colores> lista;
	private Pila<Colores> pilaUno;
	private Pila<Colores> pilaDos;
	private Historial historial;

	public Datos() {
		super();
		this.cola = new Cola<>();
		this.lista = new Lista<>();
		this.pilaUno = new Pila<>();
		this.pilaDos = new Pila<>();
		this.historial = new Historial<>() ;
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
