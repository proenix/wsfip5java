import java.applet.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

public class Applet01_4 extends Applet {
	
	public void init() {
		
		Label label1 = new Label("To jest napis Label", Label.RIGHT);
		
		Color customColor = new Color(10,10,255);
		label1.setForeground(customColor);
		
		Font customFont = new Font("Courier New", Font.ITALIC, 20);
		label1.setFont(customFont);
		
		add(label1);
	}

}
