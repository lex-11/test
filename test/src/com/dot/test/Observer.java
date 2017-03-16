package com.dot.test;

public class Observer {
	
	public void handleEvent(Event e){
		System.out.println(  "Observer received data *******   " + e.getData());
	}

}
