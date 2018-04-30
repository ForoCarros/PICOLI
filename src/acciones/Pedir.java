package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;

public class Pedir implements Pedable, ActionListener {

	private ParaUi paraui;

	public Pedir(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void pedirColor() {
		Color color = paraui.dameColorCombo();
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosPedir());
		paraui.getJuego().realizarJugada(color);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pedirColor();
	}

}
