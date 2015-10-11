import java.util.Arrays;

public class tablice2 {
	public static void main (String args[]) {
		
		int array[] = new int[] {2, 5, 8, -3, 0 , 4, 9};
		
		// Metoda sort do sortowania tablicy
		Arrays.sort(array);
		// Wyplucie posortowanej tablicy
		System.out.println(Arrays.toString(array));
		
	}
}
