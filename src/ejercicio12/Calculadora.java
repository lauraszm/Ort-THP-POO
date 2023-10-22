package ejercicio12;

public class Calculadora {
	
	final int dividirPorCero = 0;
	public Calculadora() {
		
	}
	
	public int sumar(int nroA, int nroB) {
		return nroA + nroB;
	}
	
	public int restar (int nroA, int nroB) {
		return nroA - nroB;
	}
	
	public int multiplicar (int nroA, int nroB) {
		return nroA * nroB;
	}
	
	public int dividir (int nroA, int nroB) {
		if (nroB == dividirPorCero) {
			return dividirPorCero;
		} else {
			return nroA / nroB;
		}
	}
}
