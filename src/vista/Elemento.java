package vista;

import javax.swing.JPanel;

import modelo.Colores;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Elemento extends JPanel {

	/**
	 * Create the panel.
	 */
	public Elemento(Color color) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(color);
	}

}
