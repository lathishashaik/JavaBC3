import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class LComboBox extends JFrame implements ActionListener{
	JComboBox combo;
	LComboBox(){
		String animals[]= {"cat","dog","mice"};
//In JComboBox can pass array of reference datatypes like Strings,objects,Integer(Wrapper) etc
		combo=new JComboBox(animals);
		
		combo.addActionListener(this);
		//Some useful methods below
//can type & press enter if already present	 prints name number else name -1
		//but for below method we must press enter then it displays 2 times
		combo.setEditable(true);
		
		combo.addItem("pig");

//Even after making elephant at 0,the default selection when we run is still cat
		combo.insertItemAt("elephant",0);
	//above problem can be solved
		combo.setSelectedIndex(0);
		
		combo.removeItem("pig");
		
		combo.removeItemAt(2);
		
		//combo.removeAllItems();
                      
		
		System.out.println(combo.getItemCount());
		this.setSize(250, 150);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
		combo.setBounds(50, 25, 80, 25);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(combo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combo) {
			System.out.println(combo.getSelectedItem());
			//***********OR*************
			System.out.println(combo.getSelectedIndex());
		}
		
	}

}
