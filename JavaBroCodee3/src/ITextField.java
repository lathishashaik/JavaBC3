import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ITextField extends JFrame implements ActionListener{
	JButton button1;
	JTextField field1;
	ITextField(){
		button1=new JButton("Submit");
		//button1.setBounds(25, 100, 100, 35);
		button1.setFocusable(false);
		
		field1=new JTextField();
		field1.setPreferredSize(new Dimension(250,38));
		//field1.setBounds(150, 100, 250, 38);
		field1.setFont(new Font("MV Boli",Font.BOLD,24));
		field1.setForeground(Color.cyan);
		field1.setBackground(Color.black);
		field1.setText("username");
		//color of cursor in text field
		field1.setCaretColor(Color.white);
		
		button1.addActionListener(this);
		
		this.setSize(450, 320);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(button1);
		this.add(field1);
		this.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			button1.setEnabled(false);
			field1.setEditable(false);
			System.out.println("Welcome "+field1.getText());
			
			
			
		}
		
	}

}
