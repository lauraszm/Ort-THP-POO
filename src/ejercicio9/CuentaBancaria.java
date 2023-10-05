package ejercicio9;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	
	public CuentaBancaria(Persona titular, TipoCuenta tipo) {
		this.saldo = 0;
		this.titular = titular;
		this.tipo = tipo;
		this.cbu = generarCBU();
	}
	
	private String generarCBU() {
		String cbu;
		String dni = titular.getDni();
		cbu = (tipo.ordinal()+10) + "-" + dni + "-" + dni.charAt(dni.length()-1);
		return cbu;
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void incrementarSaldo(double incremento) {
		this.saldo += incremento;
	}
	
	public void restarSaldo(double retiro) {
		this.saldo -= retiro;
	}
	
	public void depositar(double deposito) {
		if (deposito > 0) {			
			this.incrementarSaldo(deposito);
		}
	}
	
	public String getCbu() {
		return this.cbu;
	}
	
	public boolean extraer(double retiro) {
		boolean estado = false;
		if (retiro < this.saldo) {
			this.restarSaldo(retiro);
			estado = true;
		}
		return estado;
	}
	
}
