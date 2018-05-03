package acciones;

import modelo.Colores;
import modelo.Datos;
import utiles.Constantes;

public class Iniciador implements Iniciable{
	
	private Datos datos;

	public Iniciador(Datos datos) {
		super();
		this.datos = datos;
	}

	@Override
	public void sortearColor() {
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			int ran = (int)(Math.random()*Colores.getCantidadElementos());
			this.datos.getCola().introducir(Colores.getElement(ran));
		}
	}

}
