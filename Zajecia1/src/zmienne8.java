
public class zmienne8 {
	
	// Zadeklarowany licznik.
	static private int licznik = 1;
	
	public static void main (String args[]) {
		
		for(int i=0; i<10; i++) 
		{
			// A to podstawia licznik pod licznik.
			// I będzie liczyć od zera :)
			licznik = i;
			
			// Wywolanie funkcji
			wyswietl_licznik();
		}
	}
	
	static public void wyswietl_licznik() {
		
		// Wypluwa na ekran aktualny licznik
		System.out.println("Licznik to " + licznik);
		
	}
}
