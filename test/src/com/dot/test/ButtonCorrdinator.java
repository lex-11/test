package com.dot.test;

import java.awt.Label;

public class ButtonCorrdinator {	
	AddHouseButton _button1;
	AddCarButton _button2;
	Label _label1;
	
	
	
	public ButtonCorrdinator(AddHouseButton _button1, AddCarButton _button2, Label _label1) {
		super();
		this._button1 = _button1;
		this._button2 = _button2;
		this._label1 = _label1;
	}

	void excuteAddCar(){
		_button2.setEnabled(false);         
		_button1.setEnabled(true);
		_label1.setText("CAR ADDED");
	}
	
    void excuteAddHouse(){
    	_button1.setEnabled(false);
		_button2.setEnabled(true);
		_label1.setText("HOUSE ADDED");
	}

}
