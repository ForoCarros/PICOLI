package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;
import modelo.Colores;

public class Seleccionar implements ActionListener, Seleccionable {

	private ParaUi paraui;
	
	public Seleccionar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void seleccionarColor(String color) {
		Color colorDummy=comprobarColor(color);
		paraui.getJuego().realizarJugada(colorDummy);
	}

	private Color comprobarColor(String color) {
		Color colorDummy=null;
		switch (color) {
		case "rojo":
			colorDummy=Color.red;
			break;
		case "amarillo":
			colorDummy=Color.yellow;
			break;
		case "azul":
			colorDummy=Color.blue;
			break;
		case "verde":
			colorDummy=Color.green;
			break;
		case "naranja":
			colorDummy=Color.orange;
			break;
		}
		return colorDummy;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		paraui.comprobarHistorialValidos();
		seleccionarColor(e.getSource().getClass().getName());
	}
}
