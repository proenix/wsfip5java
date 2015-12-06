import java.applet.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet03_Calc1 extends Applet implements ActionListener {
	
	public TextField iBoxA, iBoxB, iBoxC;
	
	public void init() {
		
		
		
		iBoxA = new TextField("0");
		iBoxA.setColumns(10);
		iBoxB = new TextField("0");
		iBoxB.setColumns(10);
		
		iBoxC = new TextField();
		iBoxC.setColumns(20);
		iBoxC.setEditable(false);
		
		add(iBoxA);
		add(iBoxB);
		add(iBoxC);
		
		Button button = new Button("Wduś");
		this.add(button);
		
		button.addActionListener((ActionListener) this);
		button.setActionCommand("1");		
	}
	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action == "1") {
			int a = 0;
			int b = 0;
			try {
				a = Integer.parseInt(iBoxA.getText());
				b = Integer.parseInt(iBoxB.getText());
				iBoxC.setText(Integer.toString(a*a+b*b));
			} catch(NumberFormatException e1) {
				iBoxC.setText("You cannot into numbers");
			}
		}
	}
}
