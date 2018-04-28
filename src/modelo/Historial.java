package modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import utiles.Constantes;

public class Historial<T> implements Historiable<T> {
	
	int numComprobaciones = Constantes.TAMANO_HISTORICO;
	private ArrayList<T> historial;
	private ArrayList<Colores> ultimosColores;
	
	public ArrayList<T> comprobarHistorial(Cola<T> e) {
		ArrayDeque<T> cola = (ArrayDeque<T>) e.getCollectionCola();
		ArrayDeque<T> colaApoyo=cola.clone();
		extraerColores(colaApoyo);
		comprobarColoresRepetidos();
		return historial;
	}

	private void comprobarColoresRepetidos() {
		int[] repColores = {0,0,0,0,0};
		for (Colores t : ultimosColores) {
			switch (t) {
			case rojo:
				repColores[0]++;
				break;
			case amarillo:
				repColores[1]++;
				break;
			case azul:
				repColores[2]++;
				break;
			case verde:
				repColores[3]++;
				break;
			case naranja:
				repColores[4]++;
				break;
			}
		}
		addColoresDisponibles(repColores);
	}

	private void addColoresDisponibles(int[] repColores) {
		historial = new ArrayList<>();
		for (int i = 0; i < repColores.length; i++) {
			if (repColores[i]<2) {
				historial.add((T) Colores.getElement(i));
			}
		}
	}
	
	private void extraerColores(ArrayDeque<T> cola) {
		ultimosColores = new ArrayList<>();
		for (int i = 0; i < numComprobaciones; i++) {
			ultimosColores.add((Colores) cola.pollLast());
		}
	}

}
