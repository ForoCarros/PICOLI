package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUi;

public class Borrar implements Borrable, ActionListener {

	ParaUi paraui;
	ArrayList<Color> lista = paraui.getJuego().getDatos().getLista().getListaColores();
	int intentos = paraui.getJuego().getIntentosBorrar();

	public Borrar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void buscarColor(Color c) {
		for (Color color : lista) {
			if (color.equals(c)) {
				borrarColor(color);
			}
		}
	}

	@Override
	public void borrarColor(Color color) {
		lista.remove(color);
		paraui.getJuego().disminuirIntentos(intentos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buscarColor(null);
		borrarColor(null);

	}

}
