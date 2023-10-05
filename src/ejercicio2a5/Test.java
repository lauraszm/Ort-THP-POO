package ejercicio2a5;

public class Test {
	
	public static void main(String[] args) {
		//ejercicio4
		Persona laura = new Persona();
		laura.ponerNombre("Laura");
		laura.ponerApellido("Szmulewicz");
		
		
		Persona gabriel = new Persona();
		gabriel.ponerApellido("Volco");
		gabriel.ponerNombre("Gabriel");
		
		Persona persona = new Persona();
		persona.ponerNombre("Fulano");
		persona.ponerApellido("Gomez");
		
		System.out.println(persona.obtenerNombreCompleto());
		System.out.println(laura.obtenerNombreCompleto());
		
		Domicilio direccion = new Domicilio();
		direccion.setCalle("Cucha Cucha");
		direccion.setNumero(1191);
		direccion.setCiudad("Caba");
		
		persona.setDomicilio(direccion.getCalle(), direccion.getCiudad(), direccion.getNumero());
		System.out.println(persona.mostrarDomicilio());
		
		// para usar el enum
		Persona p;
		p = new Persona ("Juan", "Perez", Genero.NO_BINARIO);
		int numeroOrdinal = Genero.NO_BINARIO.ordinal();
		System.out.println(numeroOrdinal);
	}

}
