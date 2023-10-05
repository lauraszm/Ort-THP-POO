package ejercicio2a5;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private Genero miGenero;
	
	//ejercicio3, constructor x defecto
	public Persona() {
		this.ponerApellido("");
		this.ponerNombre("");
		//this.domicilio = new Domicilio();
	}
	
	public Persona (String nombre, String apellido, Genero miGenero) {
		this.nombre= nombre;
		this.apellido = apellido;
		this.miGenero = miGenero;
	}
	
	//ejercicio3
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String obtenerNombreCompleto() {
		return this.getNombre() + " " + this.getApellido();
		//return this.nombre + " " + this.apellido;
	}
	
	/*public void setDomicilio(Domicilio domicilio) {
		aca piso la instancia anterior que hice en el constructor
		this.domicilio = domicilio;
	}*/
	public void setDomicilio(String calle, String ciudad, int numero) {
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle(calle);
		domicilio.setCiudad(ciudad);
		domicilio.setNumero(numero);
		this.domicilio = domicilio;
	}
	
	public String mostrarDomicilio() {
		if(this.domicilio != null) {			
			return this.domicilio.toString();
		} else {
			String mensaje = "No tiene domicilio";
			return mensaje;
		}
	}
}
