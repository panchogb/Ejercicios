package modelo;

public class DatoCargaInvalido {
	private String combustible;
	private double cantidadRequerida;
	private double cantidadDisponible;

	public DatoCargaInvalido(String combustible, double cantidadRequerida, double cantidadDisponible) {
		super();
		this.combustible = combustible;
		this.cantidadRequerida = cantidadRequerida;
		this.cantidadDisponible = cantidadDisponible;
	}

	public double getCantidadDisponible() {
		return cantidadDisponible;
	}

	public double getCantidadRequerida() {
		return cantidadRequerida;
	}

	public String getCombustible() {
		return combustible;
	}

}
