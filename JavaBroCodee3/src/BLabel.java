/*import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BLabel{
	BLabel(){
		JFrame frame1=new JFrame();
		JLabel label1=new JLabel("Bro ,do you even code");
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\dude.png");
		label1.setForeground(Color.green);
		label1.setFont(new Font("MV Boli",Font.PLAIN,20));
		label1.setBackground(Color.black);
		label1.setOpaque(true);

		//to know space occupied by Label
		Border border=BorderFactory.createLineBorder(Color.green);
		label1.setBorder(border);
		//we can clearly see label occupies total frame
		label1.setIcon(image);//bydefault text will right of pic & pic will be in West
		//to set text position wrto image
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		//to set both text and icon position wrto frame
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		frame1.add(label1);
		frame1.setVisible(true);
		frame1.setSize(500, 500);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
	}
}*/
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class BLabel{
	BLabel(){
		JFrame frame1=new JFrame();
		JLabel label1=new JLabel("Bro ,do you even code");
		ImageIcon image=new ImageIcon("images\\dude.png");
		label1.setForeground(Color.green);
		label1.setFont(new Font("MV Boli",Font.PLAIN,20));
		label1.setBackground(Color.black);
		label1.setOpaque(true);

		//to know space occupied by Label
		Border border=BorderFactory.createLineBorder(Color.RED);
		label1.setBorder(border);
		//we can clearly see label occupies total frame
		label1.setIcon(image);//bydefault text will right of pic & pic will be in West
		//to set text position wrto image
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		//to set both text and icon position wrto frame
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		frame1.add(label1);
		frame1.setVisible(true);
		
		label1.setBounds(0, 0, 350, 350);
		frame1.setResizable(false);
		frame1.pack();//works for default layout only
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
	}
}