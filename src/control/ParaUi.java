package control;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

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
		this.lblIntentosBarajar.setText(String.valueOf(this.juego.getIntentosBarajar()));
		this.lblIntentosBorrar.setText(String.valueOf(this.juego.getIntentosBorrar()));
		this.lblIntentosPEdir.setText(String.valueOf(this.juego.getIntentosPedir()));
		this.txtMonedas.setText(String.valueOf(this.juego.getMonedas()));

		this.validate();
		this.repaint();

		ArrayList<Colores> historial = this.juego.getDatos().getHistorial()
				.comprobarHistorial(this.juego.getDatos().getCola());
		Component[] botones = this.panelColores.getComponents();
		for (int i = 0; i < botones.length; i++) {
			botones[i].setEnabled(false);
		}
		for (int i = 0; i < historial.size(); i++) {
			for (int j = 0; j < botones.length; j++) {
				if (historial.get(i).toString().equals(botones[j].getName())) {
					botones[j].setEnabled(true);
				}
			}
		}
	}

	private void asignarListeners() {
		this.btnAmarillo.addActionListener(listenerSeleccionar);
		this.btnRojo.addActionListener(listenerSeleccionar);
		this.btnVerde.addActionListener(listenerSeleccionar);
		this.btnAzul.addActionListener(listenerSeleccionar);
		this.btnNaranja.addActionListener(listenerSeleccionar);
		this.btnBarajarPilas.addActionListener(listenerBarajar);
		this.btnBorrarColor.addActionListener(listenerBorrar);
		this.btnPedirColor.addActionListener(listenerPedir);
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

	/**
	 * ponemos un mensaje al pulsar la tecla barajar
	 */
	public void getTextoBarajar() {
		txtMensaje.setText("HAS PULSADO BARAJAR: te quedan " + this.juego.getIntentosBarajar() + " intentos");
	}

	/**
	 * Comprueba si has llegado al total de monedas o si la lista esta llena
	 * 
	 * @return
	 * 
	 */
	public boolean finalizarJuego() {
		if (this.juego.comprobarGanador()) {
			txtMensaje.setText("monedas maximas!, HAS GANADO");
			return true;
		}
		if (this.juego.comprobarListaLlena()) {
			txtMensaje.setText("lista llena, HAS PERDIDO");
			return true;
		}
		return false;
	}

	public void getTextoPedir() {
		txtMensaje.setText("HAS PULSADO PEDIR: te quedan " + this.juego.getIntentosPedir() + " intentos");
	}

	public void getTextoBorrar() {
		txtMensaje.setText("HAS PULSADO BORRAR: te quedan " + this.juego.getIntentosBorrar() + " intentos");
	}

	public void getTextoError() {
		txtMensaje.setText("Ya no tienes mas intentos");

	}
}
