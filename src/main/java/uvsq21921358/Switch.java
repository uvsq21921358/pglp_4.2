package uvsq21921358;

public class Switch {

	private boolean switchOn;

	public Switch() {
		this.switchOn = true;
	}
	
	public boolean isOn() {
		return switchOn;
	}

	public void turnOff() {
		switchOn = false;
	}	

	public void turnOn() {
		switchOn = true;
	}	
}
