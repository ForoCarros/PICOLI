package logica;

import modelo.Datos;

public class Juego implements Jugable{
	
	Datos datos;

	@Override
	public void disminuirIntentos(int c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarGanador() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void incrementarMonedas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean comprobarListaLlena() {
		// TODO Auto-generated method stub
		return false;
	}

	public Datos getDatos() {
		return datos;
	}
	
	
	
	

}
