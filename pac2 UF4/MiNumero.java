package pac2;

public class MiNumero {

		//declaro campos de clase
		private int base;

		// declaro constructor
		public MiNumero (int base){
			this.base=base;
		}
		
		// declaro el m�todo que devuelve el doble
		public int doblar (){
			int doblado = (int)Math.pow(base,2);
			return doblado;
		}
		
		// declaro el m�todo que devuelve el triple
			public int triplicar (){
				int triplicado = (int)Math.pow(base,3);
				return triplicado;
			}
			
			// declaro el m�todo que devuelve el cu�druple
			public int cuadrupliar (){
				int cuadruplicado = (int)Math.pow(base,4);
				return cuadruplicado;
			}

}
