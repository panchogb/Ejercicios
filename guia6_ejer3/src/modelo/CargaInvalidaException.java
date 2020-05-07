package modelo;

public class CargaInvalidaException extends Exception {
	private DatoCargaInvalido datoCargaInvalida;

	public CargaInvalidaException(String combustible, double cantidadRequerida, double cantidadDisponible) {
		super("La cantidad a cargar es invalida");
		this.datoCargaInvalida = new DatoCargaInvalido(combustible, cantidadRequerida, cantidadDisponible);
	}

	public DatoCargaInvalido getDatoCargaInvalida() {
		return datoCargaInvalida;
	}

}
