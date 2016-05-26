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
	private JButton restoreButton;
	private JButton deleteButton;
	private JButton addButton;
	private JButton renameButton;

	private String textingArr[]={"test","test","test","test","test","test","test","test"};
	// fileds...

	@SuppressWarnings("unchecked")
	public AppFrame() {
		super("FIle Manager");
		//setLayout(new FlowLayout());// check layout in the of unit 11
		
		BorderLayout layout = new BorderLayout(5,5);
		setLayout(layout);

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
