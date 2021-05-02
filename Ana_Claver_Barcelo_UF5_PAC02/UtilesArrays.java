package Arrays_strings_collections;

public class UtilesArrays {

	
	// Ejercicio 1a
	public static int[] array_aleatorios (int tamano, int num_min, int num_max){ 
		int [] matriz_aleatorios = new int [tamano];
		num_max = num_max - num_min;
		for (int i=0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int)Math.round(Math.random()*num_max) + num_min;
			}
		return matriz_aleatorios;
	}
	
	
	// Ejercicio 1b
	
	public static int[] invertir_array (int[] array_normal){
		int [] array_invertida = new int [array_normal.length];
	 
		for (int i = 0; i < array_normal.length; i++) {
			array_invertida[i] = array_normal[array_normal.length - 1 -i];
			}
		return array_invertida;
	}
	
	
	// Ejercicio 1c
	
	public static int[] array_consecutiva (int tamano){
		int [] array_con_numeros = new int [tamano];
		
		for (int i = 0; i < tamano; i++) {
			array_con_numeros[i] = i;
			}
		return array_con_numeros;
	}
	
	// Ejercicio 1d
	
		public static int[] multiplicar_arrays (int [] array1, int[] array2){
			int [] array_con_multiplicacion = new int [array1.length];
			
			for (int i = 0; i < array1.length; i++) {
				array_con_multiplicacion[i] = array1[i]*array2[i];
				}
			return array_con_multiplicacion;
		}		
	
}
