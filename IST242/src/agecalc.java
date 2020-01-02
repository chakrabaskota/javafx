
//Chakra Baskota
//IST 242 
//Exam 2 Part I take home Assignment
import java.util.*;
import java.text.*;


public class agecalc {

	public static void main(String[] args) {
		// Initializing the variables
		double earthAge, calcDays, marAge = 88, venAge = 225, JupAge = 4380, SatAge = 10767;

		// Decimal formatter for two decimal places
		DecimalFormat df = new DecimalFormat("0.00");

		// Setting up a Scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your age on Earth: ");
		earthAge = in.nextDouble();

		// Calculating
		calcDays = earthAge * 365;

		// Prints out the answer
		System.out.println("Your age on Mercury is " + df.format(calcDays / marAge));
		System.out.println("Your age on Venus is " + df.format(calcDays / venAge));
		System.out.println("Your age on Jupiter is " + df.format(calcDays / JupAge));
		System.out.println("Your age on Saturn is " + df.format(calcDays / SatAge));

	}
}
