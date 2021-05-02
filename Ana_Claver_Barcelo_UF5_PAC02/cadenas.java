package Arrays_strings_collections;

public class cadenas {
	 
	
		// Ejercicio 2a
		
		public static int contar_vocales (String palabra) {
			int contador= 0;
			
			for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'
					|| palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'U') {
				contador++;
				}
				}
			return contador;
		}
	
		
		// Ejercicio 2B
		public static boolean verificar_dni (int cifra, char letra){
			 char letra_may = Character.toUpperCase(letra);
			 char [] arrayLetrasdni ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			 int indice_array = (cifra %  23);  
			 
			 if (arrayLetrasdni[indice_array] == letra_may) {
				 return true;}
				 else {return false;}
			
		}
		
		
		// Ejercicio 2C
		public static String invertir_palabra (String palabra) {
			String palabra_invertida="";
            for (int i=palabra.length()-1; i >= 0; i--) {
            	palabra_invertida = palabra_invertida + palabra.charAt(i);
            }	
		    return palabra_invertida;
		}
		
		// Ejercicio 2D
		public static int ocurrencias_caracter (String cad, char letra) {
			int contador = 0;
			int posicion_inicio=cad.indexOf(letra);
			int posicion_final=cad.lastIndexOf(letra);
			
			for (int i=posicion_inicio; i<=posicion_final; i++) {
				if ( cad.charAt(i) == letra){
					contador++;
				}
			}
			
			return contador;
		}
		
}
