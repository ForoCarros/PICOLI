package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUi;
import modelo.Colores;

public class Borrar implements Borrable, ActionListener {

	ParaUi paraui;
	//int intentos = paraui.getJuego().getIntentosBorrar();

	public Borrar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void buscarColor(Colores rojo, ArrayList<Colores> lista) {
		for (Colores color : lista) {
			if (color.equals(rojo)) {
				borrarColor(color,lista);
			}
		}
	}

	@Override
	public void borrarColor(Colores color, ArrayList<Colores> lista) {
		lista.remove(color);
		//paraui.getJuego().disminuirIntentos(intentos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//buscarColor(null);
	}

}
