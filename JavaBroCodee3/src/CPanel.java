import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPanel {
	CPanel(){
		JFrame frame1=new JFrame();
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		
		JLabel label1=new JLabel("Hi");
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\thumbsup.png");
		label1.setIcon(image);
		
		panel1.setBounds(0, 0, 250, 250);
		panel1.setBackground(Color.red);
		panel2.setBounds(250,0, 250, 250);
		panel2.setBackground(Color.blue);
		panel3.setBounds(0,250, 500, 500);
		panel3.setBackground(Color.green);
		
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		
		
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(null);
		frame1.setSize(700, 700);
		frame1.setLocationRelativeTo(null);
		//the label moves relative to panel not necessarily relative to frame
		label1.setBounds(0, 0, 200, 200);
		panel1.add(label1);
		
		label1.setBounds(0, 0, 200, 200);
		panel2.add(label1);
		
		label1.setBounds(200, 200, 200, 200);
		panel3.add(label1);
		
		frame1.add(panel1);
		frame1.add(panel2);
		frame1.add(panel3);
		
		
	}

}
