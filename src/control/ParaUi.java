package control;

import logica.Juego;

public class ParaUi {

	private Juego juego;
	private Iniciador iniciador;

	public ParaUi(Juego juego, Iniciador iniciador) {
		super();
		this.juego = juego;
		this.iniciador = iniciador;
	}

	public Juego getJuego() {
		return juego;
	}
	
	

}
