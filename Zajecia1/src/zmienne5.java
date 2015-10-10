import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class zmienne5 {
	
	public static void main (String args[]) {
		
		String a;
		
		// Odczytywanie z wejścia za pomocą BufferedReader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter stdout = new PrintWriter(System.out, true);
		stdout.println("Wprowadź tekst");
		
		try {
			a = stdin.readLine();
			stdout.println("preczytalem " + a);
		} catch(IOException e) {
			// Wypluwanie błędu z kodem błędu
			stdout.println("Bład odczytu" + e);
		}
	}
}
