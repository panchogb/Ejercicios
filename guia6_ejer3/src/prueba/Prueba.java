package prueba;

import modelo.CargaInvalidaException;
import modelo.Surtidor;

public class Prueba {

	public static void main(String[] args) {
		Surtidor surtidor = new Surtidor();
		
		try {
			surtidor.cargarCombustible("DIESEL", 1);
		} catch (CargaInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
