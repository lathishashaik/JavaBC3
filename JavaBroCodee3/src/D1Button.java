import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class D1Button  implements ActionListener{
	JButton button1;
	JFrame frame1;
	JLabel label;
	D1Button(){
		 frame1=new JFrame();
		button1=new JButton();
		button1.setBounds(120, 120, 200, 100);
		button1.setFocusable(false);
		button1.setBackground(Color.lightGray);
		button1.addActionListener(this);
		JLabel label1=new JLabel("   I'm a Button");
		label1.setForeground(Color.blue);
		label1.setFont(new Font("MV Boli",Font.PLAIN,20));
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\indexfinger.png");
		label1.setIcon(image);
		
		ImageIcon image2=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\happy.png");
		label=new JLabel();
		label.setBounds(200, 250, 120, 140);
		label.setIcon(image2);
		label.setVisible(false);
		
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setHorizontalAlignment(JButton.CENTER);
		label1.setVerticalAlignment(JButton.CENTER);
		
		
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setDefaultCloseOperation(3);
		frame1.setSize(500, 500);
		frame1.setResizable(false);
		frame1.getContentPane().setBackground(Color.magenta);
		frame1.setLocationRelativeTo(null);
		button1.add(label1);
		frame1.add(button1);
		frame1.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			//System.out.println("poo");
			label.setVisible(true);
			
			
			//if want to make button click once
			button1.setEnabled(false);
		}
		
	}

}
