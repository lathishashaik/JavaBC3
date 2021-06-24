import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class D2BorderLayout extends JFrame{
	D2BorderLayout(){
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		
		
		
		JPanel panel6=new JPanel();
		JPanel panel7=new JPanel();
		JPanel panel8=new JPanel();
		JPanel panel9=new JPanel();
		JPanel panel10=new JPanel();
		
		panel1.setBackground(Color.red);
		panel1.setPreferredSize(new Dimension(70,80));

		panel2.setBackground(Color.MAGENTA);
		panel2.setPreferredSize(new Dimension(70,80));
		
		panel3.setBackground(Color.green);
		panel3.setPreferredSize(new Dimension(70,80));
		
		panel4.setBackground(Color.yellow);
		panel4.setPreferredSize(new Dimension(70,80));
		
		panel5.setBackground(Color.blue);
		//whatever the dimension may be ,center occupies all remaining space
		panel5.setPreferredSize(new Dimension(10,10));
		
		panel6.setBackground(Color.gray);
		panel6.setPreferredSize(new Dimension(50,40));

		panel7.setBackground(Color.black);
		panel7.setPreferredSize(new Dimension(50,40));
		
		panel8.setBackground(Color.orange);
		panel8.setPreferredSize(new Dimension(50,40));
		
		panel9.setBackground(Color.pink);
		panel9.setPreferredSize(new Dimension(50,40));
		
		panel10.setBackground(Color.DARK_GRAY);
		//whatever the dimension may be ,center occupies all remaining space
		panel10.setPreferredSize(new Dimension(10,10));
		
		this.setLayout(new BorderLayout(7,7));
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
	//	this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.SOUTH);
		this.add(panel3,BorderLayout.WEST);
		this.add(panel4,BorderLayout.EAST);
		this.add(panel5,BorderLayout.CENTER);
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		panel5.setLayout(new BorderLayout(5,5));
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
	}

}
