import java.applet.*;
import java.awt.Choice;

public class Applet07_Choice1 extends Applet {
	
	private Choice kolor = new Choice();
	
	public void init() {
		kolor.add("Biały"); //0
		kolor.add("Czarny"); //1
		kolor.add("Czerwony"); //2
		kolor.add("Niebieski"); //3
		kolor.add("Przezroczysty");//4
		
		add(kolor);
	}
}
