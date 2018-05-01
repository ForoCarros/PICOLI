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

	public int turno = 0;
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
		this.datos = new Datos();
		this.iniciador = new Iniciador(this.datos);
		iniciador.sortearColor();
		this.juego = new Juego<>(this.datos);
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
		this.btnColor1.addActionListener(listenerSeleccionar);
		this.btnColor2.addActionListener(listenerSeleccionar);
		this.btnColor3.addActionListener(listenerSeleccionar);
		this.btnColor4.addActionListener(listenerSeleccionar);
		this.btnColor5.addActionListener(listenerSeleccionar);
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
