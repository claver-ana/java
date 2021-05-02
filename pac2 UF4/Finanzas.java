package pac2;

public class Finanzas {
	
		// declaro campos de la clase
		private double rate;
		
		//declaro el primer constructor
		public Finanzas(){
			rate=1.12;	
		}
		
		//declaro el segundo constructor
		public Finanzas(double rate){
			this.rate=rate;
		}
		
		// declaro método para pasar USD a EUR
		public double dolares_a_euros (double usd){
			double eur=usd/rate;
			return Math.rint(eur*100)/100;
		}
		
		// declaro método para pasar EUR a USD
		public double euros_a_dolares (double eur) {
			double usd=eur*rate;
			return Math.rint(usd*100)/100;
		}
		
			

}
