import java.io.PrintWriter;

public class Program1 {
	
	public static void main (String args[])
	{
		System.out.println("Witaj\nprzybyszu\n");
		
		String s = new String("Jakiś tekst");  // zjebaleeeeeees, zjadles literke s xD
		System.out.println(s);
		
		PrintWriter stdout = new PrintWriter(System.out,true);
		stdout.println(s);
		
		System.out.println(args[0] + " " + args[1]);
	}
	
}
