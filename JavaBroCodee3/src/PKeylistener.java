import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PKeylistener extends JFrame implements KeyListener{
	JLabel label1;
	PKeylistener(){
		label1=new JLabel();
		label1.setBounds(0, 0, 250, 400);
		//label1.setBackground(Color.red);
		//Above works only if !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//label1.setOpaque(true);
		ImageIcon image=new ImageIcon("images\\rocket1.png");
		label1.setIcon(image);
		
		this.addKeyListener(this);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(720, 720);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.add(label1);
		this.getContentPane().setBackground(Color.black);;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//invoked when key is typed...Uses keyChar
		//char output
	
	switch(e.getKeyChar()){
		case 'a':
			label1.setLocation(label1.getX()-10, label1.getY());//move towards left
			break;
		case 'w':
			label1.setLocation(label1.getX(), label1.getY()-10);//move towards up
			break;
		case 's':
			label1.setLocation(label1.getX(), label1.getY()+10);//move towards down
			break;
		case 'd':
			label1.setLocation(label1.getX()+10, label1.getY());//move towards right
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
// Invoked when a physical key is presses down..Uses keyCode(if q pressed=>81)
		//int output
		switch(e.getKeyCode()) {
//here 31,38,39,40 are arrow keys(these numbers are found by syso(..keycode()))
		case 37:
			label1.setLocation(label1.getX()-10, label1.getY());//move towards left
			break;
		case 38:
			label1.setLocation(label1.getX(), label1.getY()-10);//move towards up
			break;
		case 39:
			label1.setLocation(label1.getX()+10, label1.getY());//move towards down
			break;
		case 40:
			label1.setLocation(label1.getX(), label1.getY()+10);//move towards right
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a abutton is pressed 
		System.out.println("You released key char : "+e.getKeyChar());
		System.out.println("You released key code : "+e.getKeyCode());
		
	}

}
