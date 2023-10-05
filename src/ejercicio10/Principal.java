package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		Robot robot = new Robot("Robotino");
		Persona ivan = new Persona ("Ivan", "Maldonado");
		Persona juan = new Persona ("Juan Agustin", "Etter");
		Robot laura = new Robot("Laura");
		
		robot.saludar(ivan);
		laura.saludar(juan);
		robot.saludar();
	}

}
