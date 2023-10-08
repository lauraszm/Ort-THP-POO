package ejercicio13;

public class Test {

	public static void main(String[] args) {
		SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe superHeroe3 = new SuperHeroe("Wonderwoman", 108, -5, 90);
		System.out.println(superHeroe1.toString());
		System.out.println(superHeroe2.toString());
		System.out.println(superHeroe3.toString());
		
		System.out.println("competir: " +superHeroe1.competir(superHeroe2));
		System.out.println("competir: " +superHeroe2.competir(superHeroe1));

	}

}
