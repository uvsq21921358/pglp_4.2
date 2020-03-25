package Cmd;

import uvsq21921358.Switch;

public class QuitCommand implements Command {

	private Switch stop;
	
	public QuitCommand(Switch interrupteur) {
		this.stop = interrupteur;
	}

	public void apply() {
		stop.turnOff();
	}
}
