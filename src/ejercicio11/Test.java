package ejercicio11;

import java.util.Scanner;

public class Test {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*
		* Turnera t = new Turnera();
		* System.out.println(t.obtenerUltimoNumeroOtorgado());
		* t.otorgarProximoNumero();
		* System.out.println(t.obtenerUltimoNumeroOtorgado());
		*/
		
		//SIENDO QUE TODO ES STATIC PUEDO REFERENCIAR A LA CLASE DIRECTAMENTE SIN INSTANCIARLA
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		Turnera.resetearContador(45);
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		
		
		
		
		
		input.close();
	}

}
