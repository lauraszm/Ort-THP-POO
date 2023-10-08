package ejercicio7;

public class Computadora {
	private String marca;
	private Tipo tipo;
	private Procesador procesador;
	private DVD lectoraDVD;
	
	public Computadora (String marca, Tipo tipo, Procesador procesador, DVD lectoraDVD) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.lectoraDVD = lectoraDVD;
	}
	
	private DVD getLectoraDVD() {
		return lectoraDVD;
	}

	private void setLectoraDVD(DVD lectoraDVD) {
		this.lectoraDVD = lectoraDVD;
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private Tipo getTipo() {
		return tipo;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	private Procesador getProcesador() {
		return procesador;
	}

	private void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public void prender() {
		
	}
	public void apagar() {
		
	}
	public void reiniciar() {
		
	}
}
