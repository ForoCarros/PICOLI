package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;
import modelo.Colores;

public class Pedir implements Pedable {

	private ParaUi paraui;

	public Pedir(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void pedirColor() {
		Colores color = paraui.dameColorCombo();
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosPedir());
		paraui.getJuego().realizarJugada(color);
	}
}
