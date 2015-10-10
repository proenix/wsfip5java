
public class zmienne7 {
	public static void main (String args[]) {
		
		String dayString;
		int day = 5;
		
		switch(day){
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4: 
				dayString = "Thursday";
				break;
			case 5: 
				dayString = "Friday";
				break;
			case 6:
				dayString = "Saturday";
				break;
			case 7:
				dayString = "Sunday";
				break;
			default:
				dayString = "Nie ma tekiego dnia";
				break;
		}
		System.out.println(dayString);
	}
}
