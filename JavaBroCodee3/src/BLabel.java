import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
//USING DEFAULT LAYOUT
public class BLabel  extends JFrame{
	BLabel(){
		JLabel label1=new JLabel();
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\index student.png");
		label1.setText("Bro,do you even code?");
		label1.setFont(new Font("MV BOLI",Font.PLAIN,25));
		label1.setForeground(Color.green);
		//**********************
		label1.setBackground(Color.black);
		label1.setOpaque(true);
		//***************************
		label1.setIcon(image);
		
		//to know space occupied by Label
		Border border=BorderFactory.createLineBorder(Color.green);
		label1.setBorder(border);
		//we can clearly see label occupies total frame..to avoid this
		//see B2Label
		
		
		this.add(label1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	

}
