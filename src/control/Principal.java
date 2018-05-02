package control;

import java.awt.EventQueue;

import vista.UI;

public class Principal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUi frame = new ParaUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cosas que faltan:
	 * 
	 * mirar el seleccionar por lo de bloquear botones
	 * 
	 * mirar lo de verterListaenPilas, algo pasa que no los intercambia
	 * correctamente en barajar
	 * 
	 * el boton pedir creo que no hace falta hacer nada...simplemente es tenerlo y
	 * que no desbloquee ningun botonde colores
	 * 
	 * meter mensajes en el txtMensaje segun lo que esta pasando en cada momento
	 * 
	 * meter las monedas que tenemos en cada momento en su txtMonedas,aunque al
	 * realizar la jugada ya se comprueba
	 * 
	 * y poco mas....
	 * 
	 */

}
