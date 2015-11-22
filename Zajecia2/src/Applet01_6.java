import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Applet01_6 extends Applet {
	
	boolean isButton1Visible;
	boolean isButton2Visible;
	
	public void init() {
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 1");
		Button button3 = new Button("Button 1");
		
		Font myFont = new Font ("Courier", Font.ITALIC, 12);
		button1.setFont(myFont);
		
		button1.setForeground(Color.black);
		button2.setForeground(Color.blue);
		
		button1.setBackground(Color.red);
		button2.setBackground(Color.green);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		isButton1Visible = button1.isVisible();
		isButton2Visible = button2.isVisible();
	}
	
	public void paint (Graphics g) {
		g.drawString("Is button1 visible " + isButton1Visible, 10, 50);
		g.drawString("Is button2 visible " + isButton2Visible, 10, 70);
	}
}
