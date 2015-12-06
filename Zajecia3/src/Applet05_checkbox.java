import java.applet.*;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Applet05_checkbox extends Applet implements ItemListener {
	
	public void init() {
		
		Checkbox checkbox1 = new Checkbox("Kaczka", null, false);
		Checkbox checkbox2 = new Checkbox("Kurczak", null, false);
		
		add(checkbox1);
		add(checkbox2);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		System.out.println(e.getItem());
	}
}
