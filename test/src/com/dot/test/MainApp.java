package com.dot.test;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ButtonCorrdinator corrdinator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainApp();

	}

	public MainApp() throws HeadlessException {
		JPanel panel = new JPanel();
		AddCarButton button1 = new AddCarButton();
		button1.addActionListener(this);
		AddHouseButton button2 = new AddHouseButton();
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		
		Label label = new Label();		
		corrdinator = new ButtonCorrdinator(button2, button1, label);
		getContentPane().add(label, BorderLayout.NORTH);
		getContentPane().add(panel, BorderLayout.SOUTH);
		
	    setTitle("***********WOW*********");
	    
	    setSize(400, 300);
	    setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof AddHouseButton){
			corrdinator.excuteAddHouse();;
		}
		
        if(e.getSource() instanceof AddCarButton){
        	corrdinator.excuteAddCar();
		}
		
	}

	
}
