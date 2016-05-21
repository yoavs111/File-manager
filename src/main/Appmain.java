package main;

import javax.swing.JFrame;

import managerOfGUI.AppFrame;

public class Appmain {

	public static void main(String[] args) {
		AppFrame appFrame = new AppFrame();//// create appFrame
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.setSize(275, 180); // set frame size
		appFrame.setVisible(true); // display frame
	} // end main
} // end class LabelTest
