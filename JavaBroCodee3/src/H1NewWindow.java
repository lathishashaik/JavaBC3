import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class H1NewWindow extends JFrame implements ActionListener{
	H1NewWindow(){
		JButton button1=new JButton("New Window");
		button1.setBounds(140, 120, 140, 25);
		button1.setFocusable(false);
		button1.addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLayout(null);
		this.add(button1);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//button can be clicked only once so no additional hello frames produce
		this.dispose();
		
		H1HelloPage hello=new H1HelloPage();
		
	}

}
