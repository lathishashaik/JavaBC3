import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class KRadioButton extends JFrame implements ActionListener{
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	KRadioButton(){
		
		  pizzaButton=new  JRadioButton("Pizza");
		  hamburgerButton=new  JRadioButton("Hamburger");
		  hotdogButton=new  JRadioButton("Hotdog");
		  
		  pizzaButton.addActionListener(this);
		  hamburgerButton.addActionListener(this);
		  hotdogButton.addActionListener(this);
		  
		  //Allows us to select onlly one item
		  ButtonGroup group=new ButtonGroup();
		  group.add(pizzaButton);
		  group.add(hamburgerButton);
		  group.add(hotdogButton);
		
		ImageIcon pizzaimage=new ImageIcon("images\\pizza.png");
		ImageIcon hamburgerimage=new ImageIcon("images\\burger.png");
		ImageIcon hotdogimage=new ImageIcon("images\\hotdog.png");
		
		pizzaButton.setIcon(pizzaimage);
		hamburgerButton.setIcon(hamburgerimage);
		hotdogButton.setIcon(hotdogimage);
		
		

		this.setSize(450, 320);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered hotdog");
		}
		
	}

}
