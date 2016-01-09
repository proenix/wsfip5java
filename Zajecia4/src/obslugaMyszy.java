import java.applet.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class obslugaMyszy extends Applet implements MouseListener {
	
	private int x,y;
	String str;
	
	public void init() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawString("Klikniecie w punkt o wspolrzednych: x=" + x + " / y=" + y, 10, 10);
	}
	
	public void mouseClicked(MouseEvent evt) {
		// Metoda wywolywana, gdy nastepuje kklikniecie, czyli wcisniecie i zwolnienie przycisku
		// Uwaga, obie te operacje musza zajsc w jednym polozeniu
	}
	
	public void mousePressed(MouseEvent evt) {
		// Metoda wywoływana, gdy zostaje wciśnięty przycisk myszy
		x = evt.getX();
		y = evt.getY();
		repaint();
	}
	
	public void mouseExited(MouseEvent evt) {
		// Metoda wywolywana, gdy kursor opuszcza obszar nasluchujacy zdarzenia
	}
	
	public void mouseEntered(MouseEvent evt) {
		// Metoda wywyolywana, gdy kursor pojawia sie w obszarze nasluchujacym na zdarzenia na przyklad panelu
	}
	
	public void mouseReleased(MouseEvent evt) {
		// Metoda wywolywana, gdy nastepuje zwolnienie przycisku
	}
}
