import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class H1HelloPage extends JFrame{
	public H1HelloPage() {
		JLabel label1=new JLabel("Hello!");
		label1.setBounds(0, 0, 50, 50);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setLayout(null);	
		this.setLocationRelativeTo(null);
		this.add(label1);
		
		
	}

}
