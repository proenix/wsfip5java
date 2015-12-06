import java.applet.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Applet06_CheckboxGroup extends Applet implements ItemListener {

	public void init() {
		
		CheckboxGroup cbg = new CheckboxGroup();
		
		Checkbox checkbox3 = new Checkbox("one", cbg, false);
		Checkbox checkbox4 = new Checkbox("two", cbg, false);
		Checkbox checkbox5 = new Checkbox("three", cbg, true);
		
		add(checkbox3);
		add(checkbox4);
		add(checkbox5);
		
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		System.out.println(e.getItem());
	}
}
