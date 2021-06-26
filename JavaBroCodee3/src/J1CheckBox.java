import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*import javax.swing.JButton;
import javax.swing.JFrame;*/


public class J1CheckBox extends JFrame implements ActionListener {
	JButton button1;
	JCheckBox checkBox;
	J1CheckBox(){
		button1=new JButton("Submit");
		button1.setBounds(25, 100, 100, 35);
		button1.setFocusable(false);
		button1.addActionListener(this);
		checkBox= new JCheckBox("  I'm not a robot");
		checkBox.setFont(new Font("MV Boli",Font.BOLD,25));
		
		//Appearance of checkBox can be changed
		ImageIcon ximage=new ImageIcon("images\\x.png");
		ImageIcon tickimage=new ImageIcon("images\\tick.png");
		checkBox.setIcon(ximage);
		//!!!!!!!!!!!!!!!!!!!!!!!!
		checkBox.setSelectedIcon(tickimage);
		
		
		
		this.setSize(450, 320);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(button1);
		this.add(checkBox);
		//this.pack();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(checkBox.isSelected());
		
	}

}
