import java.io.PrintWriter;

public class Program1 {
	
	// G��wny cz�on programu z kt�rego uruchamia si� reszte funkcji 
	// Zbiera zmienne startowe w postaci tablicy string�w
	public static void main (String args[])
	{
		// Wyswietla do konsoli tekst.
		// \n - znak nowej linii
		System.out.println("Witaj\nprzybyszu\n");
		
		// Tworzy nowa zmienna s o typie string
		String s = new String("Jaki� tekst");
		// Wyswietla do konsoli zmienna s
		System.out.println(s);
		
		// TODO Jakie� dziwne cudo 
		PrintWriter stdout = new PrintWriter(System.out,true);
		stdout.println(s);
		
		// Wyswietla na konsole zmienne startowe programu
		System.out.println(args[0] + " " + args[1]);
	}
	
}
