
public class zmienne1 {

	public static void main (String args[]) {
		
		String s1, s2;
		s1 = new String ("Jakiś tekst");
		s2=s1; // nie przepisuje zmiennej tylko sam wskaźnik do zmiennej!
		s1=null;
		System.out.println(s1);
	}
}
