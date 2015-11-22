import java.applet.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class Applet01_2 extends Applet {
	
	public void init() {
		// setBacground color
		setBackground(new Color(0,255,0));
	}
	public void paint (Graphics g) {
		
		Font font = new Font ("SansSerif", Font.BOLD, 36);
		g.setFont(font);
		g.setColor(new Color(255,0,0));
		g.drawString("To je kolorowy napis lel", 100, 100);
		
		Image img;
		img = getImage(getDocumentBase(), "ico.png");
		g.drawImage(img, 0, 0, this);
		
	}
}
