package ejercicio10;

public class Robot {
	private String nombre;
	
	private String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Robot(String nombre) {
		this.setNombre(nombre);
	}
	
	public void saludar() {
		System.out.println("Hola, mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
	}
	
	public void saludar (Persona persona) {
		System.out.println("Hola " + persona.getNombreCompleto() +", mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
	}
}
