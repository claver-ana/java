package Pac03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {

	public static void main(String[] args) {

// Creamos objeto de Calculadora con constuctor 1 (sin parámetros)
		Calculadora Calculo1 = new Calculadora();
		
// Creamos objeto de Calculadora con constructor 2 (pasamos 2 valores introducidos por el usuario por teclado):

					/*double num1, num2;
					
					try {
					System.out.println("Introduce el primer número:");
					BufferedReader entrada1 = new BufferedReader(new InputStreamReader(System.in));
					num1 = Double.parseDouble(entrada1.readLine());
			
					//System.out.println(num1);
					
					System.out.println("Introduce el segundo número:");
					BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
					num2 = Double.parseDouble(entrada2.readLine());
			
						//System.out.println(num2);
					Calculadora Calculo2 = new Calculadora(num1, num2);
					
						} catch (IOException ex) {
							System.out.println("Error de E/S");
							}*/

					
					Calculadora Calculo2 = new Calculadora(2,5);
// Comprobamos los métodos de la clase Calculadora
		
		
		System.out.println("La suma de los dos numeros es: " + Calculo2.sumar());
		
		System.out.println("La suma de los dos numeros es: " + Calculo2.sumar(2));
		
		System.out.println("La resta de los dos numeros es: " + Calculo2.restar());
		
		System.out.println("El primer número de la clase es: " + Calculo2.getNum1());
		
		System.out.println("El segundo número de la clase es: " + Calculo2.getNum2());
		
		Calculo2.setNum1(3);
		
		Calculo2.setNum2(6);
		
		System.out.println("El primer número elevado a la potencia del segundo es: " + Calculo2.potencia());
		
		System.out.println("La raíz cuadrada del primer número es: " + Calculo2.raizCuadrada());
		
		// fin del Main
	}
// fin de la clase Principal
}
