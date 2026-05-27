
/*
	1. import javax.swing;
	
*/
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
class Jframe1 extends JFrame{
	Jframe1(){

		// If you want to give some title then the method is setTitle.
		setTitle("First Frame Program.");

		// if you wan tot giver the size of the frame then the method is setSize.
		setSize(300,400);
		
		// used for to visible the javaframe.
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// change layout from default then
		// by default center if you want left right then in constructor pass this.
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		

		// rows , colums
		//setLayout(new GridLayout(2,1));

		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel();

		// create a button;
		JButton jb1 = new JButton("Save");
		jp.add(jb1);
		JButton jb2 = new JButton("Cancel");
		jp1.add(jb2);

		add(jp,BorderLayout.SOUTH);	
		add(jp1,BorderLayout.NORTH);		

		// Setting a Layouts..1 Border Layout (By Default),  2. Grid Layout, 3. Flow Layout
		// Border Layout divided into: North,South,East,West,Center.
		// Grid Layout is divided in grid suppose 5,3 then 5 rows 3 columns
		// Flow Layout ...the controls will be added as per the components come.



	}
}
class Swing1{

	public static void main(String args[]){

		// Jframe1 jf = new Jframe1();
		new Jframe1();
		// Create a button
		
	}
}


//Alternate Code

/*

class Swing1{

	public static void main(String args[]){

		JFrame jf = new JFrame();
		jf.setTitle("The Alternate way");
//		jf.setSize(500,200);
		jf.setVisible(true);
		jf.setBounds(34,90,500,500); //1. X axis, 2. Y-axis, 3,4 height,width...no need to use setSize.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // if not using this we have oto use CTRL+c to break down the code.
		
	}
}

*/