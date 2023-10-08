package ejercicio7;

public class DVD {
	private String marca;
	private boolean puedeGrabar;
	
	public DVD(String marca, boolean puedeGrabar) {
		this.marca = marca;
		this.puedeGrabar = puedeGrabar;
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private boolean isPuedeGrabar() {
		return puedeGrabar;
	}

	private void setPuedeGrabar(boolean puedeGrabar) {
		this.puedeGrabar = puedeGrabar;
	}
		
}
