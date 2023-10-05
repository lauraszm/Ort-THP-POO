package ejercicio6;

public class Dado {
	final static int CANT_CARAS_NORMALES = 6;
	//el valor del dado
	private int valor;
	
	//modificar el codigo para que el dado tenga n cantidad de caras
	private int cantidadCaras;
	
	public Dado() {
		this.tirarDado();
		this.setCantidadCaras(CANT_CARAS_NORMALES);
	}
	
	private void setCantidadCaras(int cant) {
		if (cant > 0) {
			this.cantidadCaras = cant;
		} else {
			this.cantidadCaras = CANT_CARAS_NORMALES;
		}
	}
	
	public Dado(int cantCaras) {
		this.tirarDado();
		setCantidadCaras(cantCaras);
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void tirarDado() {
		this.valor = (int)(Math.random() * this.cantidadCaras) + 1;
	}
}
