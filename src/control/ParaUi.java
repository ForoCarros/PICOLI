package control;

import java.awt.Color;

import acciones.Iniciador;
import logica.Juego;
import modelo.Colores;
import vista.UI;

public class ParaUi extends UI {

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

	/**
	 * Devuelve el color seleccionado en el comboBox
	 * @return
	 */
	public Colores dameColorCombo() {
		// Color color=this.getComboColor().getSelectedItem();
		return null;
	}

	/**
	 * hay que comprobar el historial de colores y validarlos añadiendolos a una
	 * "lista" de los colores validos para poder seleccionar uno
	 */
	public void comprobarHistorialValidos() {
		// TODO Auto-generated method stub

	}

}
