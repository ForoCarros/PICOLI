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
		paraUi.turno++;
		this.datos.getHistorial().comprobarHistorial(this.datos.getCola());
		this.seleccionar.seleccionarColor(((JButton) e.getSource()).getName());
		System.out.println("Turno: " + paraUi.turno);
		System.out.println("Cola (" + this.datos.getCola().getCollectionCola().size() + ") "
				+ this.datos.getCola().getCollectionCola());
		System.out.println("Pila 1 (" + this.datos.getPilaUno().getPilaColores().size() + ") "
				+ this.datos.getPilaUno().getPilaColores());
		System.out.println("Pila 2 (" + this.datos.getPilaDos().getPilaColores().size() + ") "
				+ this.datos.getPilaDos().getPilaColores());
		System.out.println();
	}
}