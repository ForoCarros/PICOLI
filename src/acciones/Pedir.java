package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUi;

public class Pedir implements Pedable, ActionListener {

	ParaUi paraui;
	
	public Pedir(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pedirColor(Color c) {
		// Necesitamos el comboBox con todos los colores y elegir un color

	}

}
