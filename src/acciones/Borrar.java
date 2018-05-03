package acciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import control.ParaUi;
import modelo.Colores;

public class Borrar implements Borrable {

	private ParaUi paraui;

	public Borrar(ParaUi paraui) {
		super();
		this.paraui = paraui;
	}

	@Override
	public void buscarColor(String color) {
		if(!(paraui.getJuego().getDatos().getLista().getListaColores().isEmpty())) {
			ArrayList<Colores> listaRemover = new ArrayList<>();
			ArrayList<Colores> lista = this.paraui.getJuego().getDatos().getLista().getListaColores();
			Colores colorcito = comprobarColor(color);
			for (Colores colores : lista) {
				if (colores.toString().equals(colorcito.toString())) {
					listaRemover.add(colores);
				}
			}
			lista.removeAll(listaRemover);
			paraui.getJuego().disminuirIntentosBorrar();
			this.paraui.getJuego().comprobarDatosLista();
		}
	}

	/**
	 * comprueba el color elegido
	 * 
	 * @param color
	 * 
	 * @return
	 */
	private Colores comprobarColor(String color) {
		Colores colorDummy = null;
		switch (color) {
		case "rojo":
			colorDummy = Colores.rojo;
			break;
		case "amarillo":
			colorDummy = Colores.amarillo;
			break;
		case "azul":
			colorDummy = Colores.azul;
			break;
		case "verde":
			colorDummy = Colores.verde;
			break;
		case "naranja":
			colorDummy = Colores.naranja;
			break;
		}
		return colorDummy;
	}
	
	/**
	 * Comprueba los intentos de borrar
	 * @return
	 */
	public boolean comprobarIntentos() {
		if (this.paraui.getJuego().getIntentosBorrar() > 0)
			return true;
		return false;
	}
}
