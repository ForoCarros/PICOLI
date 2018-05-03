package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import acciones.Barajar;
import control.ParaUi;
import modelo.Colores;
import modelo.Datos;
import utiles.Constantes;

public class MALBarajar implements ActionListener {
	private ParaUi paraUi;
	private Datos datos;
	private Barajar barajar;

	public MALBarajar(ParaUi paraUi, Datos datos, Barajar barajar) {
		super();
		this.paraUi = paraUi;
		this.datos = datos;
		this.barajar = barajar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.barajar.comprobarIntentos() && !(this.paraUi.finalizarJuego())) {
			this.barajar.volcarPilasEnLista();
			this.barajar.barajar();
			this.barajar.volcarListaEnPilas();
			this.paraUi.getTextoBarajar();
			this.paraUi.actualizarVentana();
		} else {
			this.paraUi.getTextoError();
		}
	}
}
