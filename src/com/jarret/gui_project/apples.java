package com.jarret.gui_project;

import javax.swing.*;

public class apples {

	public static void main(String[] args) {

		if (1 == 1) {
			System.out.println("hello");
		}

		/*
		 * for (int i = 1; i<9999999;i++) { System.out.println(i); }
		 */

		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");

		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);

		int sum = num1 + num2;

		JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
	}

}
