package uvsq21921358;

import Exception.DivisionParZeroException;

public enum Operation {

	PLUS("+"){
		@Override
		public double eval(double x, double y) {
			return x + y;
		}
	}, 

	MOINS("-"){
		@Override
		public double eval(double x, double y) {
			return x - y;
		}
	},


	MULT("*"){
		@Override
		public double eval(double x, double y) {
			return x * y;
		}
	},


	DIV("/"){
		@Override
		public double eval(double x, double y) {
			if(y == 0) {
				throw new DivisionParZeroException();
			}
			return x / y;
		}
	};

	private String symbole;
	
	private Operation(String symbole) {
		this.symbole = symbole; 
	}
	
	public abstract double eval(double x , double y);
	
	public String getSymbole() {

		return symbole;

	}
}
