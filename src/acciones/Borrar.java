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
	//holjj

	@Override
	public void buscarColor(String color) {
		ArrayList<Colores> lista = this.paraui.getJuego().getDatos().getLista().getListaColores();
		Colores colorcito = comprobarColor(color);
		for (Iterator<Colores> i = lista.iterator(); i.hasNext();) {
			Colores elemento = i.next();
			if (elemento.equals(colorcito)) {
				borrarColor(elemento);
			}
		}
	}

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

	@Override
	public void borrarColor(Colores color) {
		ArrayList<Colores> lista = this.paraui.getJuego().getDatos().getLista().getListaColores();
		lista.remove(color);
		paraui.getJuego().disminuirIntentos(paraui.getJuego().getIntentosBorrar());
	}
}
