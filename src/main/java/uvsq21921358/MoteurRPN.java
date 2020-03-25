package uvsq21921358;

import java.util.Stack;

import Cmd.NbCommand;
import Cmd.OperationC;

public class MoteurRPN extends Interpreteur {

	private Stack<Double> pile;
	
	public MoteurRPN() {
		this.pile = new Stack<Double>();
	}
	
	
	public void EnregistrerO(double nbre) {
		this.applyStoreCommand(new NbCommand(pile, nbre));
	}
	
	public void calcul(Operation op) {
		this.applyStoreCommand(new OperationC(pile, op));
	}
	
	public String afficherPile() {
		String s = "[";
		for (Double d : this.pile) {
			s += (d + " ");
		}	
		return s.trim() + "]";
	}
	
	
	public int getSizePile(){
		return this.pile.size();
	}

	public void appliquerOperation(Operation renvoieOperation) {
		// TODO Auto-generated method stub
		
	}
}
