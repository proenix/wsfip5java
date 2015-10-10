import java.io.IOException;
/**
 * 
 * @author Proenix
 *
 */
public class zmienne2 {
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		/**
		 * Program do czegoś, a tak na prawde test dokumentacji :)
		 * Chyba zadziała.
		 * Powinno się ją wywołać poprzez javadoc.exe z jdk javy i podaniu sciezki do pliku .java
		 */
		int inChar;
		System.out.println("Podaj jakiś znak:");
		try {
			inChar = System.in.read();
			System.out.print("Napisano znak ");
			System.out.print(inChar);
		} catch(IOException e) {
			System.out.println("Błąd odczytu");
		}
	}
}
