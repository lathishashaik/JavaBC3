import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EFlowLayout extends JFrame{
	EFlowLayout(){
		
		JPanel panel1=new JPanel();
		panel1.setPreferredSize(new Dimension(300,300));
		panel1.setBackground(Color.LIGHT_GRAY);
		JButton button1=new JButton("1");
		JButton button2=new JButton("2");
		JButton button3=new JButton("3");
		JButton button4=new JButton("4");
		JButton button5=new JButton("5");
		JButton button6=new JButton("6");
		JButton button7=new JButton("7");
		JButton button8=new JButton("8");
		JButton button9=new JButton("9");
		
		
		//here 60,60 horizontal & vertical spacing of panel and frame
		this.setLayout(new FlowLayout(FlowLayout.CENTER,60,60));
		this.setVisible(true);
		this.setSize(500, 500);
		//even if we resize the frame,the components stay in center	
		// FlowLayout.CENTER applies by default event if not mentioned
//this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//even if we resize the frame,the main component(here panel) stick to left	
//this.setLayout(new FlowLayout(FlowLayout.LEADING));
		//even if we resize the frame,the main component(here panel) stick to right	
//this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		this.setLocationRelativeTo(null);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(button7);
		panel1.add(button8);
		panel1.add(button9);
		this.add(panel1);
		
		
	}

}
