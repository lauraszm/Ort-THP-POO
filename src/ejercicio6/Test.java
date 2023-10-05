package ejercicio6;

public class Test {

	public static void main(String[] args) {
		//instanciar el Dado
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		final int CANT_TIROS = 100;
		int suma = 0;
		double promedio;
		
		dado1.tirarDado();
		dado2.tirarDado();
		
		if(dado1.getValor() == dado2.getValor()) {
			System.out.println("Son iguales con " + dado1.getValor());
		} else if (dado1.getValor() > dado2.getValor()) {
			System.out.println("el mayor es dado1 " + dado1.getValor());
		} else {
			System.out.println("el mayor es dado2 " + dado2.getValor());
		}
		
		for (int i = 0; i < CANT_TIROS; i++) {
			System.out.println("tiro " + (i+1));
			System.out.println("dado 1: " + dado1.getValor() + " / dado 2: " + dado2.getValor());
			dado1.tirarDado();
			dado2.tirarDado();
			suma += dado1.getValor();
			suma += dado2.getValor();
		}
		promedio = (double) suma / CANT_TIROS * 2;
		
		System.out.println("el promedio es " + promedio);
	}

}
