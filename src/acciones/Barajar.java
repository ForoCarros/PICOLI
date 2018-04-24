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
import modelo.Pila;

public class Barajar implements ActionListener, Barajable {

	ParaUi paraui;

	public Barajar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public <T> void barajar(ArrayList<T> listaDummy) {
		Collections.shuffle((List<?>) listaDummy);
	}

	@Override
	public <T> void volcarPilasEnLista(ArrayList<T> listaDummy) {
		for (Colores color : paraui.getJuego().getDatos().getPilaUno().getPilaColores()) {
			listaDummy.add((T) color);
		}
		for (Colores color : paraui.getJuego().getDatos().getPilaDos().getPilaColores()) {
			listaDummy.add((T) color);
		}
		paraui.getJuego().getDatos().getPilaUno().getPilaColores().removeAllElements();
		paraui.getJuego().getDatos().getPilaDos().getPilaColores().removeAllElements();

	}

	@Override
	public <T> void volcarListaEnPilas(ArrayList<T> listaDummy) {
		int i = 0;
		for (int j = 0; j < listaDummy.size(); j++) {
			if (i % 2 == 0) {
				paraui.getJuego().getDatos().getPilaUno().introducir((Colores) listaDummy.get(i));
			} else {
				paraui.getJuego().getDatos().getPilaDos().introducir((Colores) listaDummy.get(i));
			}
			i++;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		volcarPilasEnLista(null);
		barajar(null);
		volcarListaEnPilas(null);
// hay que implemetar los botones y demas....
	}


}
