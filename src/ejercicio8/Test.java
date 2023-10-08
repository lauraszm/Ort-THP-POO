package ejercicio8;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez", 10000);
		
		boolean compra1 = tarjeta1.realizarCompra(4000);
		System.out.println("compra1 exitosa: " + compra1);
		System.out.println(tarjeta1.toString());
		
		tarjeta1.actualizarLimite(3000);
		boolean compra2 = tarjeta1.realizarCompra(4000);
		System.out.println("compra2 exitosa: " + compra2);
		System.out.println(tarjeta1.toString());
		
	}

}
