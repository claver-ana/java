package pac2;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancio dos veces la clase Coche
		// La primera no paso parámetros
		Coche V1 = new Coche ();
		// A la segunda le paso parámetros para los dos atributos de la clase
		Coche V2 = new Coche ("Suzuki", "Swift");
		
		// Utilizo los 2 métodos setter para pasar valores a los atributos de la clase
		V1.setMarca("Opel");
		V1.setModelo("Astra");
		
		// Imprimo por pantallo los dos atributos de los dos objetos
		System.out.println("Coche V1: " + V1.getDatos());
		System.out.println("Coche V2: " + V2.getDatos());
		
	} 

} 


