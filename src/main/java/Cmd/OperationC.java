package Cmd;

import java.util.Stack;

import uvsq21921358.Exceptions;
import uvsq21921358.Operation;

public class OperationC implements UndoableCommand  {

	
	private double dernier;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	public OperationC(Stack<Double> pile, Operation operation) {

		Exceptions.StackSize(pile.size(), 2);
		this.pile = pile;
		this.operation = operation;

	}
	
	public void apply() {

		double result;
		this.dernier = this.pile.pop();
		this.avantDernier = this.pile.pop();
		
		try {
			result = operation.eval(avantDernier, dernier);
			Exceptions.MinMax(result);
			this.pile.push(result);
		}

		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(dernier);
			throw e;
		}
	}

	

	@Override
	public void undo() {

		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(dernier);

	}


}
