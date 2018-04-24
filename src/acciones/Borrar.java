package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUi;

public class Borrar implements Borrable, ActionListener {

	ParaUi paraui;
	// esta lista la meto hasta que metamos todas las conexiones y pueda llegar a
	// ella, habria que ir a paraui/juego/datos/lista
	ArrayList<Color> lista = new ArrayList<>();
	// tambien hay que traer los intentos para borrar
	int intentos=3;

	public Borrar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void buscarColor(Color c) {
		for (Color color : lista) {
			if (color.equals(c)) {
				borrarColor();
			}
		}
	}

	@Override
	public void borrarColor() {
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
