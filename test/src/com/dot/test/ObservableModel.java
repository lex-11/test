package com.dot.test;

import java.util.ArrayList;
import java.util.List;

public class ObservableModel {
	
	private List<Observer> obs = new ArrayList<Observer>();
	
	
	public void registerObserver(Observer ob){
		obs.add(ob);
	}
	
	public void sendData(String data){
		Event e = new Event(data);
		notifyModelUpdated(e);
	}
	
	public void notifyModelUpdated(Event e){
		for(Observer ob : obs){
			ob.handleEvent(e);
		}
	}

}
