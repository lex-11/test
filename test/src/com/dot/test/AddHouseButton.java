package com.dot.test;

import java.awt.Button;
import java.awt.event.ActionListener;

public class AddHouseButton extends Button {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ButtonCorrdinator _cordinator;
	
	void addCar(){
		_cordinator.excuteAddHouse();
	}
	
	void addActionListner(ActionListener lisner ){
		addActionListener(lisner);
	}

}
