package modelo;

public class FaltaCombustibleException extends CargaInvalidaException {

	public FaltaCombustibleException(String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(combustible, cantidadRequerida, cantidadDisponible);
		// TODO Auto-generated constructor stub
	}

}
