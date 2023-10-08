package ejercicio7;

public class Procesador {
	private String marca;
	private String modelo;
	private double temperaturaActual;
	private double temperaturaCritica;
	
	public Procesador(String marca, String modelo, double temperatura) {
		this.marca = marca;
		this.modelo = modelo;
		this.temperaturaActual = temperatura;
	}
	
	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private double getTemperaturaActual() {
		return temperaturaActual;
	}

	private void setTemperaturaActual(double temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}

	public String temperaturaCritica() {
		String mensaje = "";
		if (this.getTemperaturaActual() >= this.temperaturaCritica) {
			mensaje = "El procesador alcanzo la temperatura critica";
		}
		return mensaje;
	}
}
