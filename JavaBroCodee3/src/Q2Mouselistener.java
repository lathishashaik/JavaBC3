

	import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
	import javax.swing.*;

	public class Q2Mouselistener extends JFrame implements MouseListener{
		JLabel label1;
		ImageIcon smile;
		ImageIcon nervous;
		ImageIcon pain;
		ImageIcon dizzy;
		
		Q2Mouselistener(){		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(700,700);
			this.setLayout(new FlowLayout());
			
			label1=new JLabel();
			
			smile=new ImageIcon("images//smile.png");
			nervous=new ImageIcon("images//nervous.png");
			pain=new ImageIcon("images//pain.png");
			dizzy=new ImageIcon("images//dizzy.png");
			
			
			label1.setIcon(smile);
			label1.addMouseListener(this);
			
			
			this.add(label1);
			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// Invoked when the mouse button has been clicked (pressed and released) on a component
			System.out.println("You clicked the mouse");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// Invoked when a mouse button has been pressed on a component
			System.out.println("You pressed the mouse");
			label1.setIcon(pain);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// Invoked when a mouse button has been released on a component
			System.out.println("You released the mouse");
			label1.setIcon(dizzy);
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// Invoked when the mouse enters a component
			System.out.println("You entered the component");
			label1.setIcon(nervous);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// Invoked when the mouse exits a component
			System.out.println("You exited the component");
			label1.setIcon(smile);
			
		}

	}


