package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;

public class Seleccionar implements ActionListener, Seleccionable {

	ParaUi paraui;
	
	public Seleccionar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void seleccionarColor(Color c) {
		// Necesitamos el comboBox con los colores disponibles para seleccionar uno

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
