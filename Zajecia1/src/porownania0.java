
public class porownania0 {
	public static void main (String args[]) {
		String s1 = "Przykładowy tekst";
		String s2 = new String("Przykładowy tekst");
		String s3 = "Przykładowy " + "tekst";
		String s4a = new String("Przykładowy");
		String s4 = s4a.concat(" tekst");
		
		System.out.println("Teksty s1, s2, s3, s4: " + s1 + ", " + s2 + ", " + s3 + ", " + s4);
		
		
		System.out.println("Błędne porównywanie po wskaźnikach");
		System.out.println(s1==s2); // porównanie wskaźnika do zmiennej
		System.out.println(s1==s3); // zienna do zmiennej
		System.out.println(s1==s4);
		
		// Porównanie stringów metodą equals
		System.out.println("Porownywanie metodą equals");
		System.out.println(s1.equals(s2)); // porównanie zawartości zmiennych
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
