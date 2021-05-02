package Arrays_strings_collections;

import java.util.ArrayList;
import java.util.Random;

public class Listas {

	
	//EJERCICIO 4A
	
	public static ArrayList<String> crear_nombres_completos (ArrayList<String> Nombres, ArrayList<String> Apellidos, int num_nombres_completos){
		
		ArrayList<String> lista_nombres_completos = new ArrayList<String>();
		Random num_aleatorio = new Random();
		
		for (int i=0; i<num_nombres_completos; i++){
			
		int num_aleatorio_N=num_aleatorio.nextInt(Nombres.size());
		int num_aleatorio_A1=num_aleatorio.nextInt(Apellidos.size());
		int num_aleatorio_A2=num_aleatorio.nextInt(Apellidos.size());
		
		String Nombre = Nombres.get(num_aleatorio_N);
		String Apellido1 = Apellidos.get(num_aleatorio_A1);
		String Apellido2 = Apellidos.get(num_aleatorio_A2);
		
		lista_nombres_completos.add(Nombre + " " + Apellido1 + " " + Apellido2);
		
		}
		
		
		return lista_nombres_completos;	
	}
	
	//EJERCICIO 4B
	
	public static int[] contar_prestamos (ArrayList<String> lista_libros){
		//int elementos_lista= lista_libros.size();
		int cont_diario = 0, cont_semanal = 0, cont_mensual = 0;
		int [] array_resultados = new int [3];
		
		
		
		for (int i=0; i<lista_libros.size(); i++){
			if (Libro.dame_prestamo() == tipo_prestamo.DIARIO){
				cont_diario++;
			}
			
			if (Libro.dame_prestamo() == tipo_prestamo.SEMANAL){
				cont_semanal++;
			}
			
			if (Libro.dame_prestamo() == tipo_prestamo.MENSUAL){
				cont_mensual++;
			}
		}
		array_resultados[0]= cont_diario;
		array_resultados[1]= cont_semanal;
		array_resultados[2]= cont_mensual;
		
		return array_resultados;
	}
	
}
