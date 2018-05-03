package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Borrar;
import control.ParaUi;
import modelo.Colores;
import modelo.Datos;

public class MALBorrar implements ActionListener {

	private ParaUi paraui;
	private Datos datos;
	private Borrar borrar;

	public MALBorrar(ParaUi paraui, Datos datos, Borrar borrar) {
		super();
		this.paraui = paraui;
		this.datos = datos;
		this.borrar = borrar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.borrar.comprobarIntentos() && !(this.paraui.finalizarJuego())) {
			this.borrar.buscarColor(this.paraui.dameColorCombo().toString());
			this.paraui.getTextoBorrar();
			this.paraui.actualizarVentana();
		}else {
			this.paraui.getTextoError();
		}
	}

}
