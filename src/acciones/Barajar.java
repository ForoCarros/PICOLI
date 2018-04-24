package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import control.ParaUi;
import modelo.Colores;
import modelo.Lista;

public class Barajar implements ActionListener, Barajable {

	ParaUi paraui;
	Lista listaDummy = new Lista();

	public Barajar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void barajar() {
		Collections.shuffle((List<?>) listaDummy);
	}

	@Override
	public void volcarPilasEnLista() {
		for (Color color : paraui.getJuego().getDatos().getPilaUno()) {
			listaDummy.introducir(color);
		}
		for (Color color : paraui.getJuego().getDatos().getPilaDos()) {
			listaDummy.introducir(color);
		}
		paraui.getJuego().getDatos().getPilaUno().vaciarPila(paraui.getJuego().getDatos().getPilaUno());
		paraui.getJuego().getDatos().getPilaDos().vaciarPila(paraui.getJuego().getDatos().getPilaDos());

	}

	public void volcarListaEnPilas() {
		int i=0;
		for (Color color : listaDummy) {
			if (i%2==0) {
				paraui.getJuego().getDatos().getPilaUno().introducir(color);
			}else {
				paraui.getJuego().getDatos().getPilaDos().introducir(color);
			}
			i++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		volcarPilasEnLista();
		barajar();
		volcarListaEnPilas();

	}

}
