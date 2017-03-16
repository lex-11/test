package com.dot.test;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> states = new ArrayList<Memento>();
	public void saveTomemento(Memento state){
		states.add(state);
	}
	
	public Memento restoreFromMemento(){
		return states.remove(states.size() - 1);
	}

}
