import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OMenubar extends JFrame implements ActionListener{
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	OMenubar(){

		JMenuBar menuBar=new JMenuBar();
		
		JMenu fileMenu=new JMenu("File");
		JMenu editMenu=new JMenu("Edit");
		JMenu helpMenu=new JMenu("Help");
		
		
		loadItem=new JMenuItem("load");
		saveItem=new JMenuItem("Save");
		exitItem=new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		//SHORTCUTS for menu (WORKING:  press   Alt + (mentioned letter))
		fileMenu.setMnemonic(KeyEvent.VK_F); 
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		//SHORTCUTS for menu items	(WORKING:  press mentioned letter)
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		//icons to menuitems
		ImageIcon loadImage=new ImageIcon("images\\load.png");
		ImageIcon saveImage=new ImageIcon("images\\saved.png");
		ImageIcon exitImage=new ImageIcon("images\\exit.png");
		loadItem.setIcon(loadImage);
		saveItem.setIcon(saveImage);
		exitItem.setIcon(exitImage);
		//this.add(menuBar);//!!!!!!!!!!!!!!!!!Starts from middle & shows only occuped space
		//if we use below..it starts from top left & shows full horizontal line
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem) {
			System.out.println("loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}

}
