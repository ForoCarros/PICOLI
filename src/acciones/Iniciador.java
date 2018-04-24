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
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			this.datos.getCola().introducir(Colores.getElement(ran));
		}
	}

}
