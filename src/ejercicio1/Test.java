package ejercicio1;

public class Test {

	public static void main(String[] args) {
		int suma, num1 = 90, num2 = 986453;
		
		Ejercicio1 objeto = new Ejercicio1();
		
		
		num1 = objeto.pedirNumero("Ingrese un numero entre 1 y 25", 1, 25);
		num2 = objeto.pedirNumero("Ingrese un numero entre 1 y 25", 1, 25);
		
		suma = objeto.sumar(num1, num2);
		System.out.println(suma);
		

	}

}
