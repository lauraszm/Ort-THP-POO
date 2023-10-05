package ejercicio9;

public class Domicilio {
	private String calle;
	private int altura;
	private String barrio;
	
	public Domicilio(String calle, int altura, String barrio) {
		this.setCalle(calle);
		this.setAltura(altura);
		this.setBarrio(barrio);
	}
	
	private String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getCalle() {
		return calle;
	}
	public int getAltura() {
		return altura;
	}
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + altura + ", barrio=" + barrio + "]";
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setAltura(int numero) {
		this.altura = numero;
	}
}
