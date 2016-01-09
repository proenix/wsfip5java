import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements ChangeListener {

	private JLabel lCelsius, lFahrenheit;
	private JSlider sCelsius, sFahrenheit;
	private int tempCelsius, tempFahrenheit;
	
	public Slider() {
		
		setSize(400,450);
		setTitle("Przeliczanie stopni Celsiusza na Fahrenheita");
		setLayout(null);
		
		sCelsius = new JSlider(0, 100, 0);
		sCelsius.setBounds(120, 50, 50, 300);
		sCelsius.setMajorTickSpacing(20);
		sCelsius.setMinorTickSpacing(5);
		sCelsius.setPaintTicks(true);
		sCelsius.setPaintLabels(true);
		sCelsius.addChangeListener(this);
		sCelsius.setOrientation(JSlider.VERTICAL);
		add(sCelsius);
		
		sFahrenheit = new JSlider(30, 212, 30);
		sFahrenheit.setBounds(220, 50, 50, 300);
		sFahrenheit.setMajorTickSpacing(20);
		sFahrenheit.setMinorTickSpacing(5);
		sFahrenheit.setPaintTicks(true);
		sFahrenheit.setPaintLabels(true);
		sFahrenheit.setEnabled(false);
		sFahrenheit.setOrientation(JSlider.VERTICAL);
		add(sFahrenheit);
		
		lCelsius = new JLabel("Celsius: ");
		lCelsius.setBounds(120, 10, 300, 50);
		add(lCelsius);
		
		lFahrenheit = new JLabel("Fahrenheit: ");
		lFahrenheit.setBounds(220, 10, 300, 50);
		add(lFahrenheit);
	}

	public static void main(String[] args) {
		Slider appMenu = new Slider();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appMenu.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent arg0) {
		
		tempCelsius = sCelsius.getValue();
		lCelsius.setText("Celsius: " + tempCelsius);
		
		tempFahrenheit = (int) Math.round(32 + (9.0/5.0) * tempCelsius);
		lFahrenheit.setText("Fahrenheit: " + tempFahrenheit);
		
		sFahrenheit.setValue(tempFahrenheit);
	}
	
	
}
