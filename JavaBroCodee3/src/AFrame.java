import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
/*public class AFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1=new JFrame();
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\rocket.png");
		
		frame1.setTitle("This is a title");
		frame1.getContentPane().setBackground(Color.blue);
		//different RGB values gives different colors range 0-255
		frame1.getContentPane().setBackground(new Color(36,15,67));
		frame1.setIconImage(image.getImage());
		frame1.setResizable(false);
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(500,500);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);
		

	}

}*/
public class AFrame extends JFrame{
	ImageIcon image=new ImageIcon("images\\rocket.png");
	AFrame(){
	this.setTitle("This is a title");
	this.getContentPane().setBackground(Color.blue);
	//different RGB values gives different colors range 0-255
	this.getContentPane().setBackground(new Color(36,15,67));
	//FOR ICON OF THE FRAME
	this.setIconImage(image.getImage());
	this.setResizable(false);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	
}
}
