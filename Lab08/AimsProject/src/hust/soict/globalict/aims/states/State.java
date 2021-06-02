package hust.soict.globalict.aims.states;

import javax.swing.JPanel;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.graphics.StoreScreen;

public abstract class State {
	protected DataBase database;
	protected StoreScreen screen;
	public State(DataBase database,StoreScreen screen) {
		// TODO Auto-generated constructor stub
		this.database=database;
		this.screen=screen;
	}
	public abstract JPanel showState();
}
