package Pac03;

public class Peso {

	// Atributo de la clase
	private double peso_en_kg;
	private String medida;
	
	// Constructor
	public Peso (double peso, String medida) { 
		if (medida == "Lb") {peso_en_kg=peso*0.453;}
		if (medida == "Lg") {peso_en_kg=peso*14.59;}
		if (medida == "Oz") {peso_en_kg=peso*0.02835;}
		if (medida == "P") {peso_en_kg=peso*0.00155;}
		if (medida == "K") {peso_en_kg=peso;}
		if (medida == "G") {peso_en_kg=peso*1000;}
		if (medida == "Q") {peso_en_kg=peso*45.3;}	
		
		this.medida=medida;
	}
	
	public double getLibras () {
		return this.peso_en_kg/0.453;
	}
	
	public double getLingotes () {
		return this.peso_en_kg/14.59;
	}
	
	public String getPeso () {
		if (this.medida == "Lb") {return "El peso en " + this.medida + " es de: " + peso_en_kg/0.453;}
		if (this.medida == "Lg") {return "El peso en " + this.medida + " es de: " + peso_en_kg/14.59;}
		if (this.medida == "Oz") {return "El peso en " + this.medida + " es de: " + peso_en_kg/0.028359;}
		if (this.medida == "P") {return "El peso en " + this.medida + " es de: " + peso_en_kg/0.00155;}
		if (this.medida == "K") {return "El peso en " + this.medida + " es de: " + peso_en_kg;}
		if (this.medida == "G") {return "El peso en " + this.medida + " es de: " + peso_en_kg/1000;}
		else {return "El peso en " + this.medida + " es de: " + peso_en_kg/45.3;}
		
	}	
		

}



