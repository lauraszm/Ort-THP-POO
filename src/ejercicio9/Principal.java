package ejercicio9;

public class Principal {

	public static void main(String[] args) {
		Domicilio domicilioFulano = new Domicilio ("Yatay", 240, "Almagro");
		Persona fulano = new Persona("Fulano", "Gomez", domicilioFulano, "12345678");
		CuentaBancaria cuentaFulano = new CuentaBancaria (fulano, TipoCuenta.CAJA_DE_AHORRO);
		
		Persona mengana = new Persona("Mengana", "Torres", domicilioFulano, "9123456");
		CuentaBancaria cuentaMengana = new CuentaBancaria(mengana, TipoCuenta.CUENTA_CORRIENTE);
		
		System.out.println("El CBU de fulano es " + cuentaFulano.getCbu());
		System.out.println("El CBU de mengana es " + cuentaMengana.getCbu());

		
	}

}
