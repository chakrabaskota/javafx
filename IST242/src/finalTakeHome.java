
//Chakra Baskota
//Final exam take home
//Leap Year calculator
import java.util.Scanner;

public class finalTakeHome {

	// main
	public static void main(String[] args) {
		int year;
		// setting up scanner
		Scanner in = new Scanner(System.in);
		// asking the user to enter the year
		System.out.println("Please enter the year: ");
		year = in.nextInt();
		// first condition is if it is divided by 4 and not by a 100 it is a leap year
		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(year + " is a leap year");
		}
		// second condition if the year is divided by 400 it is a leap year
		else if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		}

		// any other answer not a leap year
		else {
			System.out.println(year + " not a leap year");
		}

	}

}
