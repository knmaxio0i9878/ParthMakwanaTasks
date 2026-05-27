import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

class JFrame2 extends JFrame{

	JFrame2(){
		setTitle("FlowLayout");
		setSize(300,300);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	JButton jb1 = new JButton("B1");
	add(jb1);
	JButton jb2 = new JButton("B2");
	add(jb2);
	setVisible(true);

	}
}

class JFrameDemo2{
	public static void main(String args[]){
	JFrame2 jf1 = new JFrame2();
		}
}


//  jb1.setFocusPainted(false);  (focus box disappears for B1 but not for this concept)