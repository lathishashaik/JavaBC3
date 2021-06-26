import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MSlider extends JFrame implements ChangeListener {
	JPanel panel1;
	JSlider slider;
	JLabel label1;
	
	MSlider(){
		
		 panel1=new JPanel();
		 label1=new JLabel();
		//here 0,100 is range
	 // slider=new JSlider(0,100);
	  slider=new JSlider(0,100,50);//50 is starting point
//setPreferred size male comp be placed with mentioned dimension within parent comp
		 slider.setPreferredSize(new Dimension(480,480));
		 slider.setPaintTicks(true);
	//below works only setPaintTicks is set to true
		 slider.setMinorTickSpacing(10);
		 slider.setMajorTickSpacing(25);
		 
		 slider.setPaintLabels(true);
		 slider.setFont(new Font("MV Boli",Font.BOLD,15));
		 
//Slider is bydefault hrzntl,can be changed to vertical to resemble thermometer
		 slider.setOrientation(SwingConstants.VERTICAL);
		 
		 slider.addChangeListener(this);
		
		
		
		
		this.setSize(680, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		panel1.add(slider);
		panel1.add(label1);
		this.add(panel1);
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		//label will be right of slider
		label1.setText("temp = "+slider.getValue());
		label1.setForeground(Color.RED);
		label1.setFont(new Font("MV Boli",Font.BOLD,15));
		
	}

}
