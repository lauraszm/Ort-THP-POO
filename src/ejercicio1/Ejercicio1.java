package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	private static final Scanner input = new Scanner(System.in);
	
	public int sumar(int n1, int n2) {
		int suma;
		suma = n1 + n2;
		return suma;
	}
	
	public int pedirNumero(String mensaje, int min, int max) {
		int numero;
		do {
			System.out.println(mensaje);
			numero = Integer.parseInt(input.nextLine());
		} while (numero < min || numero > max);
		return numero;
	}
	
	//sobrecarga de metodos (o overload) - el metodo se va a llamar igual pero va a recibir otro tipo de datos. tiene otra firma
	public double sumar(double n1, double n2) {
		double suma;
		suma = n1 + n2;
		return suma;
	}
}


