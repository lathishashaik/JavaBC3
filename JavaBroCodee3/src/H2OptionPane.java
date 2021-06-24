import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class H2OptionPane {
	H2OptionPane(){
		
//all the below 5 has different symbols based on type of msg with OK BUTTON		
		//								parent comp,msg,title,msg type of dialog box
		//JOptionPane.showMessageDialog(null, "This is useless info","Title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Here's more  useless info","Title",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, " Really?","Title",JOptionPane.QUESTION_MESSAGE);
		
		// below statement can be kept in while(true) loop to annoy anyone
		//JOptionPane.showMessageDialog(null, " Your computer has VIRUS!!!!!!!","Title",JOptionPane.WARNING_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Call TECH immediately","Title",JOptionPane.ERROR_MESSAGE);
		
		//											parent comp,obj msg,       title   ,int type
	//System.out.println(JOptionPane.showConfirmDialog(null, "Bro,do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION));
	//output:0-YES , 1-NO,2-CANCEL,-1:EXIT
		
	//												parent comp,obj msg,		title   ,int type	
	//String name=JOptionPane.showInputDialog(null, "What is your name?","Title",JOptionPane.QUESTION_MESSAGE);	
		//System.out.println("Hello "+name);
		String[] responses= {"No,You're awesome","Thank You!","*blush*"};
		ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Documents\\Qems Icon Jframe\\smiley.png");
		//                          parent comp,   obj msg,        title,        options                             msg type         overrides msg type  overides options  0=>initial alue           ,           
		JOptionPane.showOptionDialog(null, "You're awesome", "secert message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, image, responses, 0);
		
	}

}
