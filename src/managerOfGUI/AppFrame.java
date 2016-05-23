package managerOfGUI;

import java.awt.*;
import javax.swing.*;
// import handlers...?

public class AppFrame extends JFrame {
	private JLabel suorceTitel;
	private JLabel backupTitel;
	private JTextField suorcePath;
	private JTextField backupPath;
	private JList suorceList;
	private JList backupList;
	private JButton backupButton;
	private JButton restoteButton;
	private JButton deleteButton;
	private JButton addButton;
	private JButton renameButton;
	//fileds...
	
	
	public AppFrame(){
		super ("FIle Manager");
		setLayout ( new FlowLayout());// check layout in the of unit 11
		
		suorceTitel = new JLabel("Source Folder");
		suorceTitel.setVerticalTextPosition(SwingConstants.TOP);
		suorceTitel.setHorizontalTextPosition(SwingConstants.LEFT);
		backupTitel
		
		//code...
	}

}
