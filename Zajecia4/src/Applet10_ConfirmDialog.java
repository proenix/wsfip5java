import java.applet.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Applet10_ConfirmDialog extends JApplet implements ActionListener {

	JFrame frame;
	JButton b1 = new JButton("ShowMessage");
	
	public void init() {
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		b1.addActionListener(this);
		cp.add(b1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int response = JOptionPane.showConfirmDialog(
				this, 
				"Umrzesz?", 
				"Proszę odpowiedzieć", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
		if (response != JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(frame, "No nie wiem...", "Odpowiedź", 1);
		} else {
			JOptionPane.showMessageDialog(frame, "Zgadzam się.", "Odpowiedź", 1);
		}
	}
	
}
