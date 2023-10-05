package ejercicio9;

public class Persona {

	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private String dni;
	
	public Persona(String nombre, String apellido, Domicilio miDomicilio, String dni) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDomicilio(domicilio);
		this.setDni(dni);
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public String getDni() {
		return dni;
	}
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	private void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
}
