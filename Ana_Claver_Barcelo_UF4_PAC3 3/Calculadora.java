package Pac03;

public class Calculadora implements ICalculadora {

	// Atributos de la clase
	private double num1;
	private double num2;
	
	//Constructor 1
		public Calculadora() { 
			num1=0;
			num2=0;
		} 
	
	//Constructor 2
		public Calculadora(double num1, double num2) { 
			this.num1=num1;
			this.num2=num2;
		} 
	
		
	// Métodoes de la interfaz
	@Override
	public double sumar() {
		return  num1 + num2;
	}

	@Override
	public double sumar(double numero) {
		return  num1 + num2 + numero;
	}

	@Override
	public double restar() {
		return num1-num2;
	}

	@Override
	public double getNum1() {
		return num1;
	}

	@Override
	public double getNum2() {
		return num2;
	}

	@Override
	public void setNum1(double num1) {
		this.num1=num1;
		
	}

	@Override
	public void setNum2(double num1) {
		this.num1=num1;	
	}

	// Métodos propios de la clase
	public double potencia() {
		return Math.pow(this.num1, this.num2);
	}
	
	public double raizCuadrada () {
		return Math.sqrt(this.num1);
	}
	
	
	
	
}
