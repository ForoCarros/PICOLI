package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Pedir;
import control.ParaUi;
import modelo.Datos;

public class MALPedir implements ActionListener {

	private ParaUi paraUi;
	private Datos datos;
	private Pedir pedir;

	public MALPedir(ParaUi paraUi, Datos datos, Pedir pedir) {
		super();
		this.paraUi = paraUi;
		this.datos = datos;
		this.pedir = pedir;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.pedir.comprobarIntentos() && !(this.paraUi.finalizarJuego())) {
			this.pedir.pedirColor();
			this.paraUi.getTextoPedir();
			this.paraUi.actualizarVentana();
		} else {
			this.paraUi.getTextoError();
		}
	}
}
