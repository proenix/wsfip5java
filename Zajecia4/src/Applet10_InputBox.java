import java.applet.Applet;
import java.awt.TextField;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Applet10_InputBox extends Applet implements ActionListener {
	
	TextField box = new TextField();
	
	public Applet10_InputBox() {
		
		box.setText("Wduś enter");
		
		this.add(box);
		box.addActionListener(this); // użycie enter
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String selected = JOptionPane.showInputDialog("Wpisz tekst tutaj");
		box.setText(selected);
	}

}
