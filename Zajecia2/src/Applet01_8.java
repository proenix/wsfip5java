import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Applet01_8 extends JApplet implements ActionListener {
	
	JFrame frame;
	
	JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");
	
	int b1Count = 0;
	int b2Count = 0;
	
	public void init() {
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b1.setActionCommand("1");
		b2.setActionCommand("2");
		
		cp.add(b1);
		cp.add(b2);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action = arg0.getActionCommand();
		if (action == "1") {
			b1Count++;
			JOptionPane.showMessageDialog(frame, b1Count);	
		}
		if (action == "2") {
			b2Count++;
			JOptionPane.showMessageDialog(frame, b2Count);
		}
	}
}
