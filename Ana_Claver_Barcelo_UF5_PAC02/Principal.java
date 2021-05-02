package Arrays_strings_collections;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1A
		    int[] ejemplo1 = UtilesArrays.array_aleatorios(5, 2, 10);
			
		    for(int elemento:ejemplo1){
		    	System.out.println(elemento);
				}
				
	    // EJERCICIO 1B
			int[] ejemplo2 = UtilesArrays.invertir_array(ejemplo1);
				
			for(int elemento:ejemplo2){
				System.out.println(elemento);
				}
			
			
		// EJERCICIO 1C
			int[] ejemplo3 = UtilesArrays.array_consecutiva(5);
			for(int elemento:ejemplo3){
				System.out.println(elemento);
				}
			
		// EJERCICIO 1D
			int[] ejemplo4 = UtilesArrays.multiplicar_arrays(ejemplo1, ejemplo2);
			for(int elemento:ejemplo4){
				System.out.println(elemento);
				}
			
			
		// EJERCICIO 2A
			int num_vocales = cadenas.contar_vocales("calculaDORA");
			System.out.println("La palabra contiene " + num_vocales + " vocales.");
			
			
		// EJERCICIO 2b
			boolean verificacion =cadenas.verificar_dni(38849456, 'H');
			if (verificacion == true) {System.out.println("La cifra y la letra hacen un número de DNI correcto.");}
			else {System.out.println("La cifra y la letra NO hacen un número de DNI correcto.");				
			}
		
			
		// EJERCICIO 2C	
			String palabra_reves = cadenas.invertir_palabra("calculaDORA");
			System.out.println("La palabra al revés es: " + palabra_reves);
		
		
		// EJERCICIO 2d	
			int numero_ocurrencias_caracter = cadenas.ocurrencias_caracter("tostadora", 't');
			System.out.println("La letra aparece " + numero_ocurrencias_caracter + " veces.");
	
	
	
		//EJERCICIO 4A
			ArrayList<String> Nombres = new ArrayList<String>();
			Nombres.add("Ana");
			Nombres.add("Elena");
			Nombres.add("Carmen");
			
			ArrayList<String> Apellidos = new ArrayList<String>();
			Apellidos.add("Claver");
			Apellidos.add("Barceló");
			Apellidos.add("Titus");
			
			ArrayList<String> Nombres_completos = new ArrayList<String>();
			Nombres_completos = Listas.crear_nombres_completos(Nombres, Apellidos, 3);
			System.out.println(Nombres_completos);
			
			
		//EJERCICIO 4B	
			ArrayList <Libro> lista_libros = new ArrayList <Libro>();
			Libro Libro1 = new Libro ("978-84-96208-96-4","Juego de Tronos","George R.R. Martin", 800,10.95, 3700000, tipo_prestamo.SEMANAL);
			lista_libros.add(Libro1); 
			Libro Libro2 = new Libro  ("978-84-339-2042-3","La conjura de los Necios","John Kennedy Toole", 392, 8.95,30000000, tipo_prestamo.DIARIO);
			lista_libros.add(Libro2); 
			Libro Libro3 = new Libro  ("978-84-450-7753-5","El Silmarilion","J.R.R. Tolkien", 448, 18.00, 35000000, tipo_prestamo.MENSUAL);
			lista_libros.add(Libro3); 
			
			int [] array_resultados = new int [3];
			for (int e : array_resultados){
				System.out.println(e);
			}
			
			
			//int num_total=lista_libros.size();
			//System.out.println(num_total);
			
			//System.out.println(Libro.dame_datos_libro());
			
	}

}
