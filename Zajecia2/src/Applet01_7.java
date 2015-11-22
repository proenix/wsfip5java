import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet01_7 extends Applet implements ActionListener {
	
	String actionMessage = "";
	
	public void init() {
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 1");
				
		this.add(button1);
		this.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		button1.setActionCommand("1");
		button2.setActionCommand("2");
	}
	
	public void paint (Graphics g) {
		g.drawString(actionMessage, 10, 50);
	}
	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		actionMessage = "Wduszono przycisk - " + action;
		repaint();
	}
}
