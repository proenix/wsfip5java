import java.applet.Applet;
import java.awt.Graphics;

public class Applet01_1 extends Applet {
	
	public void paint (Graphics g) {	
		// wywietlanie napisu w oknie apletu
		g.drawString("Witaj", 20, 20);
		g.drawString("To jest pierwszy aplet", 20, 50);
	}
}
