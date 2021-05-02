package Arrays_strings_collections;

enum tipo_prestamo {DIARIO,	SEMANAL, MENSUAL}
	

public class Libro {
	
		
		public Libro (String ISBN, String Titulo, String Autor, int num_paginas, double precio, int ejemplares_vendidos, tipo_prestamo prestamo){
			this.ISBN = ISBN;
			this.Titulo = Titulo;
			this.Autor = Autor;
			this.num_paginas=num_paginas;
			this.precio = precio;
			this.ejemplares_vendidos=ejemplares_vendidos;
			this.prestamo= prestamo;
		}
		
		static String ISBN;
		static String Titulo;
		static String Autor; 
		static int num_paginas; 
		static double precio;
		static int ejemplares_vendidos;
		static tipo_prestamo prestamo;
	
public static String dame_datos_libro() {
	return "ISBN :" + ISBN + ". Título: " + Titulo + ". Autor: " + Autor + ". Numero de páginas: " + num_paginas + ". Precio: " + precio + ". Ejemplares vendidos: " + ejemplares_vendidos +  ". Tipo de préstamo: " + prestamo;
}

public static tipo_prestamo dame_prestamo() {
	return prestamo;

}
}
