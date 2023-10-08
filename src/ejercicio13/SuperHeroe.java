package ejercicio13;

public class SuperHeroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoder;
	
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoder) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoder(superpoder);	
	}
	
	final int MAX = 100;
	final int MIN = 0;
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setFuerza(int fuerza) {
		this.fuerza = validarDato(fuerza);
	}
	private void setResistencia(int resistencia) {
		this.resistencia = validarDato(resistencia);
	}
	private void setSuperpoder(int superpoder) {
		this.superpoder = validarDato(superpoder);
	}
	private String getNombre() {
		return nombre;
	}
	private int getFuerza() {
		return fuerza;
	}
	private int getResistencia() {
		return resistencia;
	}
	private int getSuperpoder() {
		return superpoder;
	}
	
	private int validarDato(int dato) {
		if (dato < MIN) {
			return MIN;
		} else if (dato > MAX) {
			return MAX;
		} else {			
			return dato;
		}
	}
	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", superpoder="
				+ superpoder + "]";
	}
	int triunfoLocal = 0;
	int triunfoVisitante = 0;
	public Resultado competir(SuperHeroe superHeroe2) {
		if (this.fuerza > superHeroe2.getFuerza()) { triunfoLocal++;} else {triunfoVisitante++;}
		if (this.resistencia > superHeroe2.getResistencia()) { triunfoLocal++;} else {triunfoVisitante++;}
		if (this.superpoder > superHeroe2.getSuperpoder()) {triunfoLocal++;} else {triunfoVisitante++;}
		
		if (triunfoLocal > triunfoVisitante) {	return Resultado.TRIUNFO;}
		else if (triunfoLocal < triunfoVisitante) {return Resultado.DERROTA;}
		else {return Resultado.EMPATE;}
	}
}
