import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class NProgressbar extends JFrame{
	JProgressBar bar;
	NProgressbar(){
		//								 RANGE
		bar=new JProgressBar(0,100);
		bar.setBounds(0, 0,420, 50);
		
		//x% will be displays in progress bar
		bar.setStringPainted(true);
		bar.setFont(new Font("MV BOLI",Font.BOLD,25));
		bar.setForeground(Color.green);//fill color
		bar.setBackground(Color.black);
		
		
	
		
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(bar);
		
	}
	void fill() {
		int counter=0;
		while(counter<=100) {
			try {
			bar.setValue(counter);
			Thread.sleep(1000);//1000 milliseconds
			}
			catch(Exception e) {
				System.out.println(":(");
			}
			counter+=10;
			
		}
		bar.setString("Done!:)");
	}

}
