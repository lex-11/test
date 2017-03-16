package com.dot.test;

public class Car {
	private String model;
	private String plateId;
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlateId() {
		return plateId;
	}

	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}
	
	
 public Memento saveToMemento(){
	 return new Memento(state);
 }
 
 public void restoreFromMemento(Memento m){
	 state = m.getState();
	 System.out.println("****************** RESTORE STATE TO ************"  + state.getValue().toString());
 }
	
	
}
