import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class GLayeredPane extends JFrame {
	GLayeredPane(){
		JLayeredPane pane1=new JLayeredPane();
		pane1.setBounds(0,0,50,500);
		JLabel label1=new JLabel();
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		label1.setOpaque(true);
		
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 200, 200);
		
		
		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100, 100, 200, 200);
		
		
		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150, 150, 200, 200);
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		
		/*BYDEFAULT one goes behind another
		 pane1.add(label1);
		pane1.add(label2);
		pane1.add(label3);*/
		
		pane1.add(label1,JLayeredPane.DEFAULT_LAYER);
		//**************************OR************
		//pane1.add(label1,Integer.valueOf(0));
		pane1.add(label2,JLayeredPane.PALETTE_LAYER);
		pane1.add(label3,JLayeredPane.MODAL_LAYER);
		
		this.add(pane1);
	}

}
