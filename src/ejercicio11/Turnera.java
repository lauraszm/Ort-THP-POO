package ejercicio11;

public class Turnera {
	
	private static int ultimoNumero;
	private static int NUMERO_INICIAL = 0;
	
	private Turnera() {
		ultimoNumero = 0;
	}
	
	private static int getUltimoNumero() {
		return ultimoNumero;
	}

	public static void setUltimoNumero(int numero) {
		ultimoNumero = numero;
	}

	public static void otorgarProximoNumero() {
		ultimoNumero++;
	}
	
	public static int obtenerUltimoNumeroOtorgado() {
		return getUltimoNumero();
	}
	
	/**** SOBRECARGA DE METODOS ****/
	public static void resetearContador(int numero) {
		if(numero >=0) {
			
			setUltimoNumero(numero);
		}
		//this.ultimoNumero = numero;
	}
	
	/*
	public static void resetearContador() {
		setUltimoNumero(NUMERO_INICIAL);
		//this.ultimoNumero = 0;
	}
	*/
}
