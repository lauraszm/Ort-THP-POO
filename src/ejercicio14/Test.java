package ejercicio14;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		final int SALIDA = -1, NOTA_MAX = 10;
		int nota;
		double promedioFinal;
		boolean notaValida;
		Promedio promedio = new Promedio();
		
		do {			
			System.out.println("Ingrese la nota");
			nota = Integer.parseInt(input.nextLine());
			notaValida = nota >=SALIDA && nota <=NOTA_MAX;
		} while (!notaValida);
		
		while (nota != SALIDA) {
			promedio.incrementar(nota);
			
			do {			
				System.out.println("Ingrese la nota");
				nota = Integer.parseInt(input.nextLine());
				notaValida = nota >=SALIDA && nota <=NOTA_MAX;
			} while (!notaValida);
		}
		
		promedioFinal = promedio.obtenerValor();
		System.out.println("el promedio de la clase es " + promedioFinal);
			
		input.close();
	}

}
