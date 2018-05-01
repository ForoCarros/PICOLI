package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;
import modelo.Colores;

public class Seleccionar implements Seleccionable {

	private ParaUi paraui;
	
	public Seleccionar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void seleccionarColor(String color) {
		Colores colorDummy=comprobarColor(color);
		paraui.getJuego().realizarJugada(colorDummy);
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
}
