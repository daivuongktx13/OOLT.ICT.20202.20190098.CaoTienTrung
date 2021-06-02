package hust.soict.globalict.aims.states;

import javax.swing.JPanel;

public class StatesManager {
	
	protected State currentState;
	
	public JPanel showState() {
		return currentState.showState();
	}
	public void setState(State state) {
		this.currentState=state;
	}
	
}
