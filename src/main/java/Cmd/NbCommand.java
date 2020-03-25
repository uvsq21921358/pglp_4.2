package Cmd;

import java.util.Stack;

import uvsq21921358.Exceptions;

public class NbCommand implements UndoableCommand{

	private double nbre;

	private Stack<Double> pile;


	public NbCommand(Stack<Double> pile, double nbre) {

		this.pile = pile;
		this.nbre = nbre;		
	}
	
	public void apply() {
		Exceptions.MinMax(nbre);
		this.pile.push(nbre);
	}

	public void undo() {
		this.pile.pop();
	}
}
