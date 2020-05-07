package modelo;

public class Surtidor {
	private double[] cantidadCombustible;
	private final double capacidad = 2000;

	public Surtidor() {
		super();
		this.cantidadCombustible = new double[3];
		for (int i = 0; i < this.cantidadCombustible.length; i++)
			this.cantidadCombustible[i] = this.capacidad;
	}

	private int TipoCombustible(String combustible) {
		if (combustible.equals("DIESEL"))
			return 0;
		else if (combustible.equals("PREMIUM"))
			return 1;
		else if (combustible.equals("SUPER"))
			return 2;
		return -1;
	}

	public void cargarCombustible(String combustible, double cantidad)
			throws CargaInvalidaException, FaltaCombustibleException, TipoCombustibleInvalidoException {
		int tipo = TipoCombustible(combustible);

		if (tipo < 0)
			throw new TipoCombustibleInvalidoException(combustible, cantidad, 0);
		if (cantidad < 0)
			throw new CargaInvalidaException(combustible, cantidad, this.cantidadCombustible[tipo]);
		if (this.cantidadCombustible[tipo] + cantidad > this.capacidad) {
			this.cantidadCombustible[tipo] = this.capacidad;
			throw new FaltaCombustibleException(combustible, cantidad, this.cantidadCombustible[tipo]);
		} else {
			this.cantidadCombustible[tipo] += this.capacidad;
		}
	}

	public double getCantidadDiesel() {
		return this.cantidadCombustible[0];
	}

	public double getCantidadPremium() {
		return this.cantidadCombustible[1];
	}

	public double getCantidadSuper() {
		return this.cantidadCombustible[2];
	}

	public void llenarDiesel() {
		this.cantidadCombustible[0] = this.capacidad;
	}

	public void llenarPremium() {
		this.cantidadCombustible[1] = this.capacidad;
	}

	public void llenarSuper() {
		this.cantidadCombustible[2] = this.capacidad;
	}
}
