
public class porownania2 {
	public static void main (String args[]) {
		
		String searchMe = "Kubuś szedł przez stumilowy last szukając grzybów. I znalazł Puchatka. Grzybki też";
		String substring = "low";
		boolean found = false; // Zmienna do zapamiętania czy tekst znaleziono
		
		int max = searchMe.length() - substring.length(); // Długość tekstu pomniejszona o dlugość wyszukiwanego tekstu, żeby nie wyjść za string
		
		test: 
			// Sprawdzanie pokolei czy początek się zgadza
			for(int i=0; i<=max; i++) {
				int n = substring.length();
				int j = i;
				int k = 0;
				// Sprawdzanie czy początkowe i kolejne literki się zgadzają, jeśli nie to idź kontynuować wykonywanie pętli for
				while(n-- != 0) {
					if(searchMe.charAt(j++) != substring.charAt(k++))
						continue test;
				}
				// Jak znalazło to dojdzie tutaj i zmieni found na true i przerwie pętlę
				found = true;
				break test;
			}
		// Wypluje wynik czy znalazło czy nie
		System.out.println(found ? "Znalazłem" : "Nie znalazłem");
	}
}
