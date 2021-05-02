package pac2;

public class Coche {

		// declaro campos de clase
		private String marca;
		private String modelo;
		
		
		// declaro primer constructor (vacío)
		public Coche (){
			this.marca="";
			this.modelo="";
		}
		
		// declaro segundo constructor (con parámetros)
		public Coche (String marca, String modelo){
			this.marca=marca;
			this.modelo=modelo;
		}
		
		// declaro método setter que modifica la marca del coche
				public void setMarca (String marca){
					this.marca=marca;
				}
				
		// declaro método setter que modifica el modelo del coche
				public void setModelo (String modelo){
					this.modelo=modelo;
				}
		
		// declaro método getter que devuelve el nombre de la marca y el modelo del coche
				public String getDatos(){
					return "La marca y modelo es " + marca + " " + modelo;
				}
	
}
