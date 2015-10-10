
public class zmienne {
	
	int i;
	static int j;
	
	public static void main (String args[]) {
		nonStaticMethod();
		//StaticMethod();
	}
	
	// metoda nie statyczna nie zadziala
	public void nonStaticMethod(){
		System.out.println("Brak dostepu");
	}
	
	// metoda statyczna zadziala
	public static void StaticMethod(){
		System.out.println("Jest dostep");
	}
	
}
