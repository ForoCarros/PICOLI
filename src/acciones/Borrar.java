package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import control.ParaUi;
import modelo.Colores;

public class Borrar implements Borrable, ActionListener {

	private ParaUi paraui;

	public Borrar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void buscarColor(String color, ArrayList<Colores> lista) {
		Colores colorcito=comprobarColor(color);
		for (Colores dummy : lista) {
			if (dummy.equals(colorcito)) {
				borrarColor(dummy, lista);
			}
		}
	}

	private Colores comprobarColor(String color) {
		Colores colorDummy=null;
		switch (color) {
		case "rojo":
			colorDummy=Colores.rojo;
			break;
		case "amarillo":
			colorDummy=Colores.amarillo;
			break;
		case "azul":
			colorDummy=Colores.azul;
			break;
		case "verde":
			colorDummy=Colores.verde;
			break;
		case "naranja":
			colorDummy=Colores.naranja;
			break;
		}
		return colorDummy;
	}

	@Override
	public void borrarColor(Colores color, ArrayList<Colores> lista) {
		lista.remove(color);
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosBorrar());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buscarColor(e.getSource().getClass().getName(), paraui.getJuego().getDatos().getLista().getListaColores());
	}

}
