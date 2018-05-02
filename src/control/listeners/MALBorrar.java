package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Borrar;
import control.ParaUi;
import modelo.Colores;
import modelo.Datos;

public class MALBorrar implements ActionListener {
	
	private ParaUi paraUi;
	private Datos datos;
	private Borrar borrar;

	public MALBorrar(ParaUi paraUi, Datos datos, Borrar borrar) {
		super();
		this.paraUi = paraUi;
		this.datos = datos;
		this.borrar = borrar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.borrar.buscarColor(this.paraUi.dameColorCombo().toString());
		this.paraUi.actualizarVentana();
	}

}
