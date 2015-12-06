import java.applet.*;
import java.awt.Color;
import java.awt.TextField;

public class Aplet03_TextField2 extends Applet{
	
	public Aplet03_TextField2() {
		
		TextField box = new TextField();
		box.setText("Default Text");
		this.add(box);
		
		TextField tf1, tf2, tf3, tf4;
		
		tf1 = new TextField();
		tf1.setColumns(10);
		tf1.setEnabled(false);
		tf1.setText("tf1.Enable(false)");
		
		tf2 = new TextField("", 20);
		tf2.setBackground(new Color(240,150,30));
		
		tf3 = new TextField("tf3.setEditable(false)");
		tf3.setEditable(false);
		
		tf4 = new TextField("tf4", 30);
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
	}
}
