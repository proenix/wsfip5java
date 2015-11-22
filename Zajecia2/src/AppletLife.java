import java.awt.*;
import java.awt.Graphics;

public class AppletLife extends java.applet.Applet 
{
	public void init() {
		System.out.println("Jestem w metodzie init");
	}
	
	public void start() {
		System.out.println("Jestem w metodzie start");
	}
	
	public void stop() {
		System.out.println("Jestem w metodzie stop");
	}
	
	public void paint(Graphics g) {
		System.out.println("Jestem w metodzie paint");
	}
	
	public void destroy() {
		System.out.println("Jestem w metodzie destroy");
	}

}
