package ejercicio14;

public class Promedio {
	private Contador contador;
	private Acumulador acumulador;
	
	public Promedio() {
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}
	
	public void incrementar(int incremento) {
		this.acumulador.incrementarValor(incremento);
		this.contador.incrementarValor();
	}
	
	public double obtenerValor() {
		if (this.acumulador.obtenerValor() == 0 || this.contador.obtenerValor() == 0) {
			return 0;
		} else {
			double promedio = (double)this.acumulador.obtenerValor()/this.contador.obtenerValor();
			return promedio;
		}
	}
}
