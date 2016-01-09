import java.applet.*;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Applet07_Choice1 extends Applet implements ItemListener {

	private Choice kolor = new Choice();

	public void init() {
		kolor.add("Biały"); //0
		kolor.add("Czarny"); //1
		kolor.add("Czerwony"); //2
		kolor.add("Niebieski"); //3
		kolor.add("Szary");//4

		kolor.addItemListener(this);
		add(kolor);
	}

	public void itemStateChanged(ItemEvent e) {

		switch(kolor.getSelectedIndex()) {
			case 0:
				setBackground(Color.white);
				break;
			case 1:
				setBackground(Color.yellow);
				break;
			case 2:
				setBackground(Color.red);
				break;
			case 3:
				setBackground(Color.blue);
				break;
			case 4:
				setBackground(Color.gray);
				break;
		}
	}

	public void paint(Graphics g) {
		int items = kolor.getItemCount();
		g.drawString("Lista zawiera: " + items + " wpisy", 10, 70);
		g.drawString("Ustawiono kolor: " + kolor.getSelectedItem(), 10, 90);
	}
}
