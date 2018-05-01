package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import acciones.Seleccionar;
import control.ParaUi;
import modelo.Datos;

public class MALSeleccionar implements ActionListener {
	
	private ParaUi paraUi;
	private Datos datos;
	private Seleccionar seleccionar;

	public MALSeleccionar(ParaUi paraUi, Datos datos, Seleccionar seleccionar) {
		super();
		this.paraUi = paraUi;
		this.datos = datos;
		this.seleccionar = seleccionar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.datos.getHistorial().comprobarHistorial(this.datos.getCola());
		this.seleccionar.seleccionarColor(((JButton)e.getSource()).getName());
	}
}
