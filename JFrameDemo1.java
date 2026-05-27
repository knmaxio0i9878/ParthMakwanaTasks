import javax.swing.JFrame; // import JFrame class for creating frame 
import javax.swing.JButton; // import JButton class for creating button

// JFrame1 class inherits JFrame
class JFrame1 extends JFrame {

	JFrame1(){
		setTitle("First GUI Frame");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JButton jb1 = new JButton("SUBMIT");
		add(jb1);
		setVisible(true);

	}
}

class JFrameDemo1{
	public static void main(String args[]){
		JFrame1 jf1 = new JFrame1();
/*		jf1.setTitle("First GUI Frame");
		jf1.setSize(300,300);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
*/
	}
}

//frame ka default layout is border layout (if border is not defined then byDefault it is center)
// other layout are flow layout & grid layout
// chatbox,radiobutton,combo(dropdown),textbox,label