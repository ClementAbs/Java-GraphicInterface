import javax.swing.JDialog;
import javax.swing.JFrame;

public class InterfaceGraphique extends JFrame {

	
	public InterfaceGraphique() {
		
		setTitle("Boîte de dialogue");
		setSize(300,200);
	}
	
	
	
	public static void main (String []args) {
		JFrame fen = new InterfaceGraphique();
		fen.setVisible(true);
		JDialog jd = new Dialog(fen);
		jd.setVisible(true);
		
	}
}
