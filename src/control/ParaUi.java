package control;

import java.awt.Color;

import acciones.Barajar;
import acciones.Borrar;
import acciones.Iniciador;
import acciones.Pedir;
import acciones.Seleccionar;
import control.listeners.MALBarajar;
import control.listeners.MALBorrar;
import control.listeners.MALPedir;
import control.listeners.MALSeleccionar;
import logica.Juego;
import modelo.Colores;
import modelo.Datos;
import modelo.Historial;
import vista.UI;

public class ParaUi extends UI {

	private Juego juego;
	private Iniciador iniciador;
	private Datos datos;

	private MALBarajar listenerBarajar;
	private MALBorrar listenerBorrar;
	private MALPedir listenerPedir;
	private MALSeleccionar listenerSeleccionar;

	private Barajar barajar;
	private Borrar borrar;
	private Pedir pedir;
	private Seleccionar seleccionar;

	public ParaUi() {
		super();
		this.juego = new Juego<>();
		this.iniciador = new Iniciador(this.datos);
		this.barajar = new Barajar(this);
		this.listenerBarajar = new MALBarajar(this, this.datos, this.barajar);
		this.borrar = new Borrar(this);
		this.listenerBorrar = new MALBorrar(this, this.datos, this.borrar);
		this.pedir = new Pedir(this);
		this.listenerPedir = new MALPedir(this, this.datos, this.pedir);
		this.seleccionar = new Seleccionar(this);
		this.listenerSeleccionar = new MALSeleccionar(this, this.datos, this.seleccionar);
		asignarListeners();
	}

	private void asignarListeners() {

	}

	public Juego getJuego() {
		return juego;
	}

	/**
	 * Devuelve el color seleccionado en el comboBox
	 * 
	 * @return
	 */
	public Colores dameColorCombo() {
		// Color color=this.getComboColor().getSelectedItem();
		return null;
	}
}
