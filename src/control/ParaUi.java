package control;

import java.awt.Color;

import acciones.Iniciador;
import logica.Juego;
import modelo.Colores;
import modelo.Datos;
import vista.UI;

public class ParaUi extends UI {

	private Juego juego;
	private Iniciador iniciador;
	private Datos datos;

	public ParaUi() {
		super();
		this.juego = new Juego<>();
		this.iniciador = new Iniciador(this.datos);
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
