package ejercicio14;

public class Acumulador {
	private int valor;
	
	public Acumulador() {
		valor = 0;
	}
	
	public void incrementarValor(int incremento) {
		this.valor += incremento;
	}
	
	public int obtenerValor() {
		return this.valor;
	}
}
