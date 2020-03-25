package Cmd;

import java.util.Stack;

import uvsq21921358.Exceptions;

public class UndoCommand implements Command{

	private UndoableCommand lastCmd;
	
	public UndoCommand(Stack<UndoableCommand> historique) {
		Exceptions.StackSize(historique.size(), 1);
		this.lastCmd = historique.pop();
	}

	public void apply() {
		lastCmd.undo();		

	}
}
