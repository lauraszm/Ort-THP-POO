package ejercicio8;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	public double montoDisponible() {
		double diferencia = (double) this.getLimiteDeCompra() - this.getAcumuladoActual();
		if(diferencia < 0) {
			diferencia = 0;
		}
		return diferencia;
	}
	
	private boolean compraPosible(double monto) {
		double montoDisponible = this.montoDisponible();
		if (monto < montoDisponible) {
			return true;
		} else {
			return false;
		}
	}
	
	public void actualizarLimite(double nuevoLimite) {
		this.setLimiteDeCompra(nuevoLimite);
	}
	
	private void acumularGastoActual(double monto) {
		this.acumuladoActual += monto;
	}
	
	public boolean realizarCompra(double monto) {
		if(this.compraPosible(monto)) {
			this.acumularGastoActual(monto);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible()=" + montoDisponible() + "]";
	}
	
}
