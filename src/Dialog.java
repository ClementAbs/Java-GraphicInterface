import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Dialog extends JDialog {
	
	public JButton btn;
	public JTextField jtf;
	

	public Dialog(JFrame fen) {
		
		setTitle("Dialogue");
		setSize(180,180);
		
		btn = new JButton("Bouton");
		jtf= new JTextField(5);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		contenu.add(btn);
		contenu.add(jtf);
		
	}

}
