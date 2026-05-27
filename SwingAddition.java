
/*
	Event Deligation Model : 

	EventListeners are all the interfaces, it is used for to listen the event	
*/
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

import javax.swing.JPanel;

class Jframe1 extends JFrame implements ActionListener{
	JTextField jft1,jft2;
	JButton jb1,jb2,jb3,jb4;
	JLabel jl1,jl2;
	Jframe1(){

		setTitle("First Frame Program.");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLayout(new FlowLayout());
		
		jft1 = new JTextField(10); // 10 is the width of the button
		jft2 = new JTextField(10);

		jb1 = new JButton("Addition");
		jb2 = new JButton("Subtraction");
		jb3 = new JButton("Multiplication");
		jb4 = new JButton("Division");

		// as we want to action on this button hence,

		jb1.addActionListener(this); // this is the parent class object
		jb2.addActionListener(this); // this is the parent class object
		jb3.addActionListener(this); // this is the parent class object
		jb4.addActionListener(this); // this is the parent class object

		jl1 = new JLabel("Ans:");
		add(jft1);
		add(jft2);		
		add(jb1);
		add(jb2);	
		add(jb3);
		add(jb4);	
		add(jl1);
		add(jl2);

	}
	// Overriding the abstract method actionPerformed...if not written will give error
	public void actionPerformed(ActionEvent ae){
		
		int num1 = Integer.parseInt(jft1.getText());
		int num2 = Integer.parseInt(jft2.getText());
		if(ae.getSource() == jb1){
			int ans = num1 + num2;
			jl1.setText("Ans:"+ans);
		}
		if(ae.getSource() == jb2){
			int ans = num1 - num2;
			jl1.setText("Ans:"+ans);
		}

		if(ae.getSource() == jb3){
			int ans = num1 * num2;
			jl1.setText("Ans:"+ans);
		}
		if(ae.getSource() == jb4){
			int ans = num1 / num2;
			jl1.setText("Ans:"+ans);
		}
		


	}

}
class SwingAddition{

	public static void main(String args[]){

		// Jframe1 jf = new Jframe1();
		new Jframe1();

		
	}
}


