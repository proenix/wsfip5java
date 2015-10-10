import java.io.PrintWriter;

public class Program1 {
	
	// Główny człon programu z którego uruchamia się reszte funkcji 
	// Zbiera zmienne startowe w postaci tablicy stringów
	public static void main (String args[])
	{
		// Wyswietla do konsoli tekst.
		// \n - znak nowej linii
		System.out.println("Witaj\nprzybyszu\n");
		
		// Tworzy nowa zmienna s o typie string
		String s = new String("Jakiś tekst");
		// Wyswietla do konsoli zmienna s
		System.out.println(s);
		
		// TODO Jakieś dziwne cudo 
		PrintWriter stdout = new PrintWriter(System.out,true);
		stdout.println(s);
		
		// Wyswietla na konsole zmienne startowe programu
		System.out.println(args[0] + " " + args[1]);
	}
	
}
