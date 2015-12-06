import java.applet.*;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Applet04 extends Applet implements TextListener {
	
	public TextArea textA;
	public TextArea textB;
	
	public Applet04() {
		
		textA = new TextArea(5, 30);
		textB = new TextArea(5, 30);
		
		textA.addTextListener((TextListener) this);
		textB.setEditable(false);
		
		add(textA);
		add(textB);
		
		setBackground (Color.blue);
		textA.setBackground(Color.green);
	}
	
	public void textValueChanged(TextEvent e) {
		String Entry;
		Entry = textA.getText();
		textB.setText(Entry);
	}
}
