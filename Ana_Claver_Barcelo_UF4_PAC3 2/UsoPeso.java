package Pac03;

public class UsoPeso {

	public static void main(String[] args) {
		
		//por ejemplo le pasamos:
		Peso p = new Peso(2, "Oz");
		System.out.println("El peso en libras es: " + p.getLibras());

		System.out.println("El peso en lingotes es: " + p.getLingotes());
		
		System.out.println("El peso en lingotes es: " + p.getPeso());
	}

}
