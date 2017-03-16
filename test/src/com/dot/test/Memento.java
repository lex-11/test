
package com.dot.test;

public class Memento {

    private State state;

	public State getState() {
		return state;
	}

	public Memento(State state) {
		super();
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	} 
	
}
