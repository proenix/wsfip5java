
public class porownania1 {
	public static void main (String args[]) {
		
		String searchMe = "Kubuś szedł przez stumilowy last szukając grzybów. I znalazł Puchatka. Grzybki też.";
		char szukaj='e';
		
		int max = searchMe.length();
		int numerPozycji = 0;
		for(int i=0; i<max; i++) {
			if(searchMe.charAt(i)!=szukaj)
				continue;
			numerPozycji++;
		}
		System.out.println("Znaleziono znak: " + szukaj + " w stringu " + numerPozycji + " razy.");
	}
}
