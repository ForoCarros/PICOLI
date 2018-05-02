package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import control.ParaUi;
import modelo.Cola;
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
	public <T> void barajar() {
		ArrayList<Colores> listaAux = this.paraui.getJuego().getDatos().getListaAuxiliar().getListaColores();
		for (int i = 0; i < 10; i++) {
			int pos1 = (int) (Math.random() * listaAux.size());
			int pos2 = (int) (Math.random() * listaAux.size());
			Colores a = listaAux.get(pos1);
			Colores b = listaAux.get(pos2);
			listaAux.set(pos1, b);
			listaAux.set(pos2, a);

		}
	}

	@Override
	public <T> void volcarPilasEnLista() {
		Stack<Colores> pilaUno = this.paraui.getJuego().getDatos().getPilaUno().getPilaColores();
		Stack<Colores> pilaDos = this.paraui.getJuego().getDatos().getPilaDos().getPilaColores();
		Lista<Colores> lista = this.paraui.getJuego().getDatos().getListaAuxiliar();

		for (int i = 0; i < pilaUno.size(); i++) {
			lista.introducir(pilaUno.pop());
		}
		for (int i = 0; i < pilaDos.size(); i++) {
			lista.introducir(pilaDos.pop());
		}
	}

	@Override
	public <T> void volcarListaEnPilas() {
		ArrayList<Colores> listaDummy = this.paraui.getJuego().getDatos().getListaAuxiliar().getListaColores();
		Pila<Colores> pilaOne = this.paraui.getJuego().getDatos().getPilaUno();
		Pila<Colores> pilaTwo = this.paraui.getJuego().getDatos().getPilaDos();
		for (int i = 0; i < listaDummy.size(); i++) {
			if (i % 2 == 0) {
				pilaOne.introducir(listaDummy.get(i));
			} else {
				pilaTwo.introducir(listaDummy.get(i));
			}
		}
		listaDummy.clear();
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosBarajar());
	}
}
