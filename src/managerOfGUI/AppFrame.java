package managerOfGUI;

import java.awt.*;
import javax.swing.*;
// import handlers...?

public class AppFrame extends JFrame {
	private JPanel panelMain;
	private JPanel panelNorth;
	private JPanel panelInerNorth1;//labels(in the north of panelNorth)
	private JPanel panelInerNorth2;//text fils (in the suoth of panelNorth)
	private JPanel panelCenter;//lists
	private JPanel panelSuoth;//buttos
	
	private JLabel suorceTitel;
	private JLabel backupTitel;

	private JTextField suorcePath;
	private JTextField backupPath;

	private JList suorceList;
	private JList backupList;

	private JButton backupButton;
	private JButton restoreButton;
	private JButton deleteButton;
	private JButton addButton;
	private JButton renameButton;


	private String textingArr[]={"test1","test2","test3","test4","test5","test6","test7","test8"};
	// fileds...

	@SuppressWarnings("unchecked")
	public AppFrame() {
		super("FIle Manager");
		//setLayout(new FlowLayout());// check layout in the of unit 11
		//frame/panel.setBorder( new EmptyBorder (10,10,10,10));--> check in google
		BorderLayout layout = new BorderLayout(5,5);
		setLayout(layout);
		//לצריך לקבוע גידל של רכיבי GUI
		//BorderLayout do it by it self
		//BorderLayout only allows one component per section. 
		//If you want to keep BorderLayout, but have 2+ buttons, 
		//I suggest first putting each of those buttons into a JPanel and then putting that JPanel into the east slot.
		//FlowLayout is go for the buttons panels bicus it orgnaze them in a row
		
		
		//north
		
		//
		
         //inernorth1
		
	    //
		
		//inernorth2
		
	    //
		
		//center
		
		//
		
		//south
		
		//

		suorceTitel = new JLabel("Source Folder");
		//suorceTitel.setVerticalTextPosition(SwingConstants.TOP);
		//suorceTitel.setHorizontalTextPosition(SwingConstants.LEFT);
		add(suorceTitel,BorderLayout.NORTH);

		backupTitel = new JLabel("Backup Folder");
		backupTitel.setVerticalTextPosition(SwingConstants.TOP);
		backupTitel.setHorizontalTextPosition(SwingConstants.LEFT);
		add(backupTitel,BorderLayout.NORTH);

		suorcePath = new JTextField(25);
		// SuorcePathHanler textHandler = new SuorcePathHanler();
		// suorcePath.addActionListener( textHandler );
		add(suorcePath,BorderLayout.NORTH);

		backupPath = new JTextField("here I need to set the path to the backup folder");
		backupPath.setEnabled(false);
		add(backupPath,BorderLayout.NORTH);

		suorceList = new JList(textingArr);
		suorceList.setVisibleRowCount(5);
		suorceList.setFixedCellWidth(200); // set width  
		suorceList.setFixedCellHeight(25); // set height 
		suorceList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// add a JScrollPane containing JList to frame
		add(new JScrollPane(suorceList));
		// ListListener suorceListHandler = new SuorceListListener();
		// suorceList.addActionListener( suorceListHandler );
		// check again in unit 11 pages 31-36
		add(suorceList,BorderLayout.WEST);

		backupList = new JList();
		backupList.setVisibleRowCount(5);
		backupList.setFixedCellWidth(100);// set width  
		backupList.setFixedCellHeight(25);// set height
		backupList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// add a JScrollPane containing JList to frame
		add(new JScrollPane(backupList));
		// ListListener backupListHandler = new BackupListListener();
		// backupList.addActionListener( backupListHandler );
		// check again in unit 11 pages 31-36
		add(backupList,BorderLayout.SOUTH);

		backupButton = new JButton("Backup");
		// create new ButtonHandler for button event handling
		// ButtonHandler backupHandler = new BackupHandler();
		// backupButton.addActionListener( backupHandler );
		// check again in unit 11 pages 31-36
		add(backupButton,BorderLayout.EAST);

		restoreButton = new JButton("Restore");
		// create new ButtonHandler for button event handling
		// ButtonHandler restoreHandler = new restoreHandler();
		// restoreButton.addActionListener( RestoreHandler );
		// check again in unit 11 pages 31-36
		add(restoreButton,BorderLayout.WEST);

		deleteButton = new JButton("Delete");
		// create new ButtonHandler for button event handling
		// ButtonHandler deleteHandler = new DeleteHandler();
		// deleteButton.addActionListener( deleteHandler );
		// check again in unit 11 pages 31-36
		add(deleteButton,BorderLayout.WEST);

		addButton = new JButton("Add");
		// create new ButtonHandler for button event handling
		// ButtonHandler addHandler = new AddHandler();
		// addButton.addActionListener( addHandler );
		// check again in unit 11 pages 31-36
		add(addButton,BorderLayout.EAST);

		renameButton = new JButton("Rename");
		// create new ButtonHandler for button event handling
		// ButtonHandler renameHandler = new RenameHandler();
		// renameButton.addActionListener( renameHandler );
		// check again in unit 11 pages 31-36
		add(renameButton,BorderLayout.EAST);

		// code...
	}

}
