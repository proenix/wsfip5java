import java.util.InputMismatchException;
import java.util.Scanner;

public class zmienne4 {
	
	public static void main (String args[]) {
		
		String a;
		String b;
		
		// Stworzenie strumienia wejścia
		Scanner odczyt = new Scanner(System.in);
		
		// Łapanie błędów:
		try {
			// Odczyt pierwszej zmiennej poprzez strumień
			System.out.println("Podaj pierwszy ciąg znaków ");
			a = odczyt.next();
			
			// Odczyt drugiej zmiennej poprzez strumień
			System.out.println("Podaj drugi ciąg znaków ");
			b = odczyt.next();

			// Złaczenie otrzymanych Stringów
			System.out.println(a + " + " + b + " = " + (a+b));
		} catch(InputMismatchException e) {
			System.out.println("Wpisałeś złą wartość.");
		}
		
		// Zamknięcie strumienia wejścia
		odczyt.close();
	}
}
