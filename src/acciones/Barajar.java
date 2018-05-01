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

public class Barajar implements Barajable {

	private ParaUi paraui;

	public Barajar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public <T> void barajar(ArrayList<T> listaDummy) {
		Collections.shuffle((List<?>) listaDummy);
	}

	@Override
	public <T> void volcarPilasEnLista(ArrayList<T> listaDummy, Stack<T> pilaOne, Stack<T> pilaTwo) {
		for (T color : pilaOne) {
			listaDummy.add(color);
		}
		for (T color : pilaTwo) {
			listaDummy.add(color);
		}
		pilaOne.removeAllElements();
		pilaTwo.removeAllElements();
	}

	@Override
	public <T> void volcarListaEnPilas(ArrayList<T> listaDummy, Stack<T> pilaOne, Stack<T> pilaTwo) {
		for (int i = 0; i < listaDummy.size(); i++) {
			if (i % 2 == 0) {
				pilaOne.add(listaDummy.get(i));
			} else {
				pilaTwo.add(listaDummy.get(i));
			}
		}
		listaDummy.clear();
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosBarajar());
	}
}
