package uvsq21921358;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

import Cmd.Command;
import Cmd.QuitCommand;
import Cmd.UndoCommand;
import Cmd.UndoableCommand;

public class Interpreteur {
	
	private Stack<UndoableCommand> historique;
	private Switch stop;
	private List<String> log;

	

	public Interpreteur() {
		this.historique = new Stack<UndoableCommand>();
		this.stop = new Switch();
		this.log = new ArrayList<String>();
	}
	
	private void applyCommand(Command command) {
		command.apply();
	}

	public void applyStoreCommand(UndoableCommand command) {
		try {
			command.apply();
			this.historique.add(command);	
		} 
		catch (Exception e) {
			throw e;
		}
	}
	
	public void undoCommand() {
		this.applyCommand(new UndoCommand(historique));
	}


	public void log(String str) {
		this.applyCommand(() -> log.add(str));
	}

	public String getLastLog() {
		return log.get(log.size() - 1);
	}

	public void shutdown() {
		this.applyCommand(new QuitCommand(stop));
	}

	public boolean isOn() {
		return stop.isOn();
	}
}
