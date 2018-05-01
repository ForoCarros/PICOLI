package control.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import acciones.Barajar;
import control.ParaUi;
import modelo.Datos;

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
		this.barajar.volcarPilasEnLista(paraUi.getJuego().getDatos().getListaAuxiliar().getListaColores(),
				this.paraUi.getJuego().getDatos().getPilaUno().getPilaColores(),
				this.paraUi.getJuego().getDatos().getPilaDos().getPilaColores());
		this.barajar.barajar(this.paraUi.getJuego().getDatos().getListaAuxiliar().getListaColores());
		this.barajar.volcarListaEnPilas(this.paraUi.getJuego().getDatos().getListaAuxiliar().getListaColores(),
				this.paraUi.getJuego().getDatos().getPilaUno().getPilaColores(),
				this.paraUi.getJuego().getDatos().getPilaDos().getPilaColores());
	}

}
