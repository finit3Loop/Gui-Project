package com.jarret.gui_project;

import javax.swing.*;

public class apples {

	public static void main(String[] args) {

		if (true) {
			System.out.println("hello");
		}

		//java GUI 1.0
		/*
		 * for (int i = 1; i<9999999;i++) { System.out.println(i); }
		 */
		/*
		 * String fn = JOptionPane.showInputDialog("Enter first number"); String sn =
		 * JOptionPane.showInputDialog("Enter second number");
		 * 
		 * int num1 = Integer.parseInt(fn); int num2 = Integer.parseInt(sn);
		 * 
		 * int sum = num1 + num2;
		 * 
		 * while (1 == 1) { JOptionPane.showMessageDialog(null, "The answer is " + sum,
		 * "the title", JOptionPane.PLAIN_MESSAGE); }
		 */
		
		
		//Continuing GUI 1.1
		tuna bucky = new tuna();
		
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(350, 100);
		bucky.setVisible(true);
		
	}

}
