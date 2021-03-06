package uvsq21921358;

import java.util.Scanner;

import Exception.ArgumentPileException;
import Exception.DivisionParZeroException;
import Exception.ErreurSaisieException;
import Exception.MinMaxException;
import Exception.NombreOperationsException;

public class SaisieRPN {

	private MoteurRPN moteur;
	private Scanner sc;

	public SaisieRPN(){
		moteur = new MoteurRPN();
	}
	
	public void setScanner(Scanner sc) {
		this.sc = sc;		
	}
	
	public void closeScanner() {
		sc.close();
	}

	public void saisie() {
		
		this.setScanner(new Scanner(System.in));
		String input = ""; 
		String str = "";

		while(moteur.isOn()) {

			System.out.println("Veuillez saisir un entier, une opération ou exit pour sortir, puis tapez sur la touche entrée");
			try {
				input = scanneLigne();
				str += input + " ";
				System.out.println(str);
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
			System.out.println(moteur.afficherPile());
		}
		System.out.println(" Fin d'execution!!! ");
		this.closeScanner();    
		
	}
	
	public String scanneLigne() throws DivisionParZeroException, MinMaxException, ArgumentPileException, ErreurSaisieException {
		String input;
		if (sc.hasNextDouble()) {
			Double d = sc.nextDouble();
			moteur.EnregistrerO(d);
			sc.nextLine();
			input = d.toString();
		} 
		else {
			input = sc.nextLine();

			if (input.equals("exit")) {
				moteur.shutdown();
			}
			else if (input.equals("undo")) {
				moteur.undoCommand();
			}
			else 
				if (isOperation(input)) {
				moteur.appliquerOperation(renvoieOperation(input));	
			}
			else {
				throw new ErreurSaisieException();
			}
		}
		return input;

	}
	
	private boolean isOperation(String str) {
		return this.renvoieOperation(str) != null;
	}
	
	private Operation renvoieOperation(String str) {
		for (Operation op : Operation.values()) {
			if (str.equals(op.getSymbole())) {
				return op;
			}
		}
		return null;

	}
	
	public void isStackValid() throws NombreOperationsException {
		if (!(this.moteur.getSizePile() == 1)) {throw new NombreOperationsException();}
	}
	
	private void checkNombreOperations() {
		try {
			this.isStackValid();
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}

