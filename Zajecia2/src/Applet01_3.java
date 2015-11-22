import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Applet01_3 extends Applet {
	
	public void paint (Graphics g) {
		
		g.drawString("Mój string.", 10, 20);
		
		// rysuje linie zmienne x1, y1, x2, y2
		g.drawLine(165, 120, 165, 200); 
		
		// rysuje prostokat zmienne x1, y1, width, height
		g.drawRect(40, 50, 70, 70);
		
		// rysuje wypelniony prostokat x1, y1, width, height
		g.fillRect(60, 70, 30, 30);
		
		// rysuje owal
		g.drawOval(130, 50, 70, 70);
		g.setColor(Color.green);
		g.fillOval(145, 65, 40, 40);
		
		
	}

}
