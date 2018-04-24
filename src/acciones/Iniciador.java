package acciones;

import modelo.Colores;
import modelo.Datos;
import utiles.Constantes;

public class Iniciador implements Iniciable{
	
	Datos datos;

	public Iniciador(Datos datos) {
		super();
		this.datos = datos;
	}

	@Override
	public void sortearColor() {
		int ran = (int)(Math.random()*Colores.getCantidadElementos());
		this.datos.getCola().introducir(Colores.);
	}

}
