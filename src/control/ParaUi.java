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
import utiles.Constantes;
import vista.Elemento;
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
		actualizarVentana();
	}

	public void actualizarVentana() {
		this.panelPila.removeAll();
		this.panelColasUno.removeAll();
		this.panelColasDos.removeAll();
		this.panelLista.removeAll();
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			this.panelPila.add(new Elemento(this.datos.getCola().obtenerTodos().get(i).getColor()));
		}
		for (int i = 0; i < this.datos.getPilaUno().getPilaColores().size(); i++) {
			this.panelColasUno.add(new Elemento(this.datos.getPilaUno().getPilaColores().get(i).getColor()));
		}
		for (int i = 0; i < this.datos.getPilaDos().getPilaColores().size(); i++) {
			this.panelColasDos.add(new Elemento(this.datos.getPilaDos().getPilaColores().get(i).getColor()));
		}
		for (int i = 0; i < this.datos.getLista().getListaColores().size(); i++) {
			this.panelLista.add(new Elemento(this.datos.getLista().getListaColores().get(i).getColor()));
		}
		this.validate();
	}

	private void asignarListeners() {
		this.btnAmarillo.addActionListener(listenerSeleccionar);
		this.btnRojo.addActionListener(listenerSeleccionar);
		this.btnVerde.addActionListener(listenerSeleccionar);
		this.btnAzul.addActionListener(listenerSeleccionar);
		this.btnNaranja.addActionListener(listenerSeleccionar);
		this.btnBarajarPilas.addActionListener(listenerBarajar);
		this.btnBorrarColor.addActionListener(listenerBorrar);
	}

	public Juego getJuego() {
		return juego;
	}

	/**
	 * Devuelve el color seleccionado en el comboBox
	 * 
	 * @return
	 */
	public Object dameColorCombo() {
		return this.comboColores.getSelectedItem();
	}
}
