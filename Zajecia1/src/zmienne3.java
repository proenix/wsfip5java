import java.util.Scanner;

public class zmienne3 {
	
	public static void main (String args[]) {
		
		double a;
		double b;
		
		// Stworzenie strumienia wejścia
		Scanner odczyt = new Scanner(System.in);
		
		// Odczyt pierwszej zmiennej poprzez strumień
		System.out.println("Podaj pierwszą liczbę ");
		a = odczyt.nextDouble();
		
		// Odczyt drugiej zmiennej poprzez strumień
		System.out.println("Podaj drugą liczbę ");
		b = odczyt.nextDouble();
		
		// Dodanie otrzymanych zmiennych
		System.out.println(a + " + " + b + " = " + (a+b));
		
		// Zamknięcie strumienia wejścia
		odczyt.close();
	}
}
