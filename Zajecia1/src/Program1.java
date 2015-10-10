import java.io.PrintWriter;

public class Program1 {
	
	// G³ówny cz³on programu z którego uruchamia siê reszte funkcji 
	// Zbiera zmienne startowe w postaci tablicy stringów
	public static void main (String args[])
	{
		// Wyswietla do konsoli tekst.
		// \n - znak nowej linii
		System.out.println("Witaj\nprzybyszu\n");
		
		// Tworzy nowa zmienna s o typie string
		String s = new String("Jakiœ tekst");
		// Wyswietla do konsoli zmienna s
		System.out.println(s);
		
		// TODO Jakieœ dziwne cudo 
		PrintWriter stdout = new PrintWriter(System.out,true);
		stdout.println(s);
		
		// Wyswietla na konsole zmienne startowe programu
		System.out.println(args[0] + " " + args[1]);
	}
	
}
