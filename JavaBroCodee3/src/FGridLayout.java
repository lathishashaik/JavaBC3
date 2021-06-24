import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FGridLayout extends JFrame{
	 FGridLayout(){
			JButton button1=new JButton("1");
			JButton button2=new JButton("2");
			JButton button3=new JButton("3");
			JButton button4=new JButton("4");
			JButton button5=new JButton("5");
			JButton button6=new JButton("6");
			JButton button7=new JButton("7");
			JButton button8=new JButton("8");
			JButton button9=new JButton("9");
			
			
			//this.setLayout(new GridLayout());//by default takes 1,row & x columns
			//rows,columns,horizontal spacing,vertical spacing
			this.setLayout(new GridLayout(3,3,1,1));
			//if given 10 buttons instead of 9 then creates an column
			//& tries to makes the button as evenly balanced as possbile
			JButton button10=new JButton("10");
			
			this.setVisible(true);
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			this.add(button1);
			this.add(button2);
			this.add(button3);
			this.add(button4);
			this.add(button5);
			this.add(button6);
			this.add(button7);
			this.add(button8);
			this.add(button9);
			this.add(button10);
			
			
	 }

}
