
public class zmienne6 {

	public static void main (String args[]) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String userName;
		final int MIN = 6; // final <-- zdefiniowanie stałej
		System.out.print("Podaj swoje imie: ");
		userName = input.nextLine();
		
		// Sprawdz dlugość imienia 
		//if (userName.length() < MIN) {
		//	System.out.println("Za krótkie imie :D");
		//}
		
		// Pytaj do skutku :)
		while(userName.length() < MIN) {
			System.out.print("Podaj swoje imie, tamto bylo za krotkie: ");
			userName = input.nextLine();
		}
		
		System.out.println("Twoje imię to " + userName);
		
		// Zamknięcie wejścia
		input.close();
	}
}
