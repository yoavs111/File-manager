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

	// fileds...

	public AppFrame() {
		super("FIle Manager");
		setLayout(new FlowLayout());// check layout in the of unit 11

		suorceTitel = new JLabel("Source Folder");
		suorceTitel.setVerticalTextPosition(SwingConstants.TOP);
		suorceTitel.setHorizontalTextPosition(SwingConstants.LEFT);
		add(suorceTitel);

		backupTitel = new JLabel("Backup Folder");
		backupTitel.setVerticalTextPosition(SwingConstants.TOP);
		backupTitel.setHorizontalTextPosition(SwingConstants.LEFT);
		add(backupTitel);

		suorcePath = new JTextField(40);
		// SuorcePathHanler textHandler = new SuorcePathHanler();
		// suorcePath.addActionListener( textHandler );
		add(suorcePath);

		backupPath = new JTextField("here I need to set the path to the backup folder");
		backupPath.setEnabled(false);
		add(backupPath);

		suorceList = new JList();
		suorceList.setVisibleRowCount(10);
		suorceList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// add a JScrollPane containing JList to frame
		add(new JScrollPane(suorceList));
		// ListListener suorceListHandler = new SuorceListListener();
		// suorceList.addActionListener( suorceListHandler );
		// check again in unit 11 pages 31-36
		add(suorceList);

		backupList = new JList();
		backupList.setVisibleRowCount(10);
		backupList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// add a JScrollPane containing JList to frame
		add(new JScrollPane(backupList));
		// ListListener backupListHandler = new BackupListListener();
		// backupList.addActionListener( backupListHandler );
		// check again in unit 11 pages 31-36
		add(backupList);

		backupButton = new JButton("Backup");
		// create new ButtonHandler for button event handling
		// ButtonHandler backupHandler = new BackupHandler();
		// backupButton.addActionListener( backupHandler );
		// check again in unit 11 pages 31-36
		add(backupButton);

		restoreButton = new JButton("Restore");
		// create new ButtonHandler for button event handling
		// ButtonHandler restoreHandler = new restoreHandler();
		// restoreButton.addActionListener( RestoreHandler );
		// check again in unit 11 pages 31-36
		add(restoreButton);

		deleteButton = new JButton("Delete");
		// create new ButtonHandler for button event handling
		// ButtonHandler deleteHandler = new DeleteHandler();
		// deleteButton.addActionListener( deleteHandler );
		// check again in unit 11 pages 31-36
		add(deleteButton);

		addButton = new JButton("Add");
		// create new ButtonHandler for button event handling
		// ButtonHandler addHandler = new AddHandler();
		// addButton.addActionListener( addHandler );
		// check again in unit 11 pages 31-36
		add(addButton);

		renameButton = new JButton("Rename");
		// create new ButtonHandler for button event handling
		// ButtonHandler renameHandler = new RenameHandler();
		// renameButton.addActionListener( renameHandler );
		// check again in unit 11 pages 31-36
		add(renameButton);

		// code...
	}

}
