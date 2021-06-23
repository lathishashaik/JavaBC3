import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BLabelWithDiffLayouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label1=new JLabel("Bro do you even code?");
		JLabel label2=new JLabel("hey,there?");
		JFrame frame1=new JFrame();
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\index student.png");
		
		//if default layout is used labels gets hidden as all
		//labels in center West so only last added label showup
		/*frame1.add(label1);
		label2.setIcon(image);
		frame1.add(label2);*/
		
		
		//In such case borderlayout is useful
	    /*frame1.setLayout(new BorderLayout());
		
		frame1.add(label1,BorderLayout.NORTH);
		label2.setIcon(image);
		frame1.add(label2,BorderLayout.SOUTH);*/
		
		//if layout is null
		/*frame1.setLayout(null);
		label1.setBounds(0,0,300,250);
		label2.setBounds(150, 150, 100, 100);
		label1.setIcon(image);
		frame1.add(label1);
		frame1.add(label2);
		Border border1=BorderFactory.createLineBorder(Color.green);
		label1.setBorder(border1);
		Border border2=BorderFactory.createLineBorder(Color.blue);
		label2.setBorder(border2);*/
		

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(500,500);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);

	}

}
