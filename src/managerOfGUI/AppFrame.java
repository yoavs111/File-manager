package managerOfGUI;

import java.awt.*;
import javax.swing.*;
// import handlers...?

public class AppFrame extends JFrame {
	private JPanel panelMain;
	
	private JPanel panelNorth;
	private JPanel panelInerNorth1;//labels(in the north of panelNorth)
	private JLabel labelSuorceTitel, labelBackupTitel;
	private JPanel panelInerNorth2;//text fils (in the suoth of panelNorth)
	private JTextField textFieldSuorcePath,textFieldBackupPath;
	
	private JPanel panelCenter;//lists
	private JList listSuorce, listBackup;
	
	private JPanel panelSuoth;//buttos
	private JButton buttonBackup, buttonRestore, buttonDelete, buttonAdd, buttonRename;
	
	private String textingArr[]={"test1","test2","test3","test4","test5","test6","test7","test8"};
	// fileds...

	@SuppressWarnings("unchecked")
	public AppFrame() {
		super("FIle Manager");
		setLayout(new BorderLayout());// check layout in the of unit 11
		//frame/panel.setBorder( new EmptyBorder (10,10,10,10));--> check in google
		panelMain = new JPanel(new BorderLayout());
		add(panelMain);
		//לצריך לקבוע גידל של רכיבי GUI
		//BorderLayout do it by it self
		//BorderLayout only allows one component per section. 
		//If you want to keep BorderLayout, but have 2+ buttons, 
		//I suggest first putting each of those buttons into a JPanel and then putting that JPanel into the east slot.
		//FlowLayout is go for the buttons panels bicus it orgnaze them in a row
		
		
		//panelNorth
		   panelNorth = new JPanel(new BorderLayout());
		   panelMain.add(panelNorth, BorderLayout.NORTH);
		    
		   //inerNorth1
		       panelInerNorth1 = new JPanel(new BorderLayout());
		       panelNorth.add(panelInerNorth1, BorderLayout.NORTH);
		       
		       //SuorceTitel
		         labelSuorceTitel = new JLabel("Source Folder");
		         labelSuorceTitel.setSize(15,15);
			     panelInerNorth1.add(labelSuorceTitel,BorderLayout.WEST);
			   //end SuorceTitel
			     
               //BackupTitel
			     labelBackupTitel = new JLabel("Backup Folder");
			     labelBackupTitel.setSize(15,15);
			     panelInerNorth1.add(labelBackupTitel,BorderLayout.EAST);
			   //end BackupTitel
			     
	        //end inerNorth1
			
			//inernorth2
			  panelInerNorth2 = new JPanel(new BorderLayout());
			  panelNorth.add(panelInerNorth2, BorderLayout.SOUTH);
			  
			  //textFieldSuorcePath
			    textFieldSuorcePath = new JTextField(25);
			  //SuorcePathHanler textHandler = new SuorcePathHanler();
			  //suorcePath.addActionListener( textHandler );
			    panelInerNorth2.add(textFieldSuorcePath,BorderLayout.WEST);
			  //end textFieldSuorcePath
			    
              //textFieldBackupPath
			    textFieldBackupPath = new JTextField("here I need to set the path to the backup folder");
			    textFieldBackupPath.setEnabled(false);
			    panelInerNorth2.add(textFieldBackupPath,BorderLayout.EAST);
			  //endtextFieldBackupPath
			    
		    //end inernorth2	
			    
		//end panelNorth
		
         
		
		
		
		//center
		
		//
		
		//south
		
		//

		

		

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
