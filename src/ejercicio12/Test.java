package ejercicio12;

import java.util.Scanner;

public class Test {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		int num1 = 1, num2 = 2, num0 = 0, suma, resta, multiplicar, dividir;
		
		suma = calculadora.sumar(num1,  num2);
		System.out.println(num1 + "+" + num2 + "=" + suma);
		resta = calculadora.restar(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + resta);
		resta = calculadora.restar(num2, num1);
		System.out.println(num2 + "-" + num1 + "=" + resta);
		multiplicar =  calculadora.multiplicar(num1, num2);
		System.out.println(num1 + "*" + num2 + "=" + multiplicar);
		dividir = calculadora.dividir(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + dividir);
		dividir = calculadora.dividir(num2, num1);
		System.out.println(num2 + "/" + num1 + "=" + dividir);
		dividir = calculadora.dividir(num1, num0);
		System.out.println(num1 + "/" + num0 + "=" + dividir);
		dividir = calculadora.dividir(num2, num0);
		System.out.println(num2 + "/" + num0 + "=" + dividir);
		dividir = calculadora.dividir(num0, num1);
		System.out.println(num0 + "/" + num2 + "=" + dividir);
		dividir = calculadora.dividir(num0, num2);
		System.out.println(num0 + "/" + num2 + "=" + dividir);
		
	}

}
