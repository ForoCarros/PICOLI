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

	// Aqui no entiendo muy bien como vamos a diferenciar el boton seleccionar y
	// pedir. El combo siempre esta habilitado, habria que desabilitarlo y segun el
	// boton que se pulsa se activan todos los colores o solo los que el historial
	// nos deja... Pulsando seleccionar hay que mirar el historial y pulsando pedir
	// te el combo entero sin restricciones
	
	@Override
	public void pedirColor() {
		Colores color = (Colores) paraui.dameColorCombo();
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosPedir());
		paraui.getJuego().realizarJugada(color);
	}
}
