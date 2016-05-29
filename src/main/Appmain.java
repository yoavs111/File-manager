package main;

import javax.swing.JFrame;

import managerOfGUI.AppFrame;

public class Appmain {

	public static void main(String[] args) {
		AppFrame appFrame = new AppFrame();//// create appFrame
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.setSize(500, 500); // set frame size
		//pack is used when you are using layout managers and you want the JFrame to be the smallest size showing all components. 
		//If you set the size of your JFrame manually ( setSize(), setBounds() ) then you don't need to call pack().
		//appFrame.pack();
		//appFrame.setResizable(false);//Disable resize 
		appFrame.setLocationRelativeTo(null);//Set the start position 
		appFrame.setVisible(true); // display frame
	} // end main
} // end class LabelTest
