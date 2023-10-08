package ejercicio7;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, String dni, Computadora computadora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	private String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private String getApellido() {
		return apellido;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	private String getDni() {
		return dni;
	}
	
	private void setDni(String dni) {
		this.dni = dni;
	}
	private Computadora getComputadora() {
		return computadora;
	}

	private void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
	public void trabajar() {
		
	}
	public void descansar() {
		
	}
	
}
