package practice;

import java.util.Random;
import java.util.Scanner;

public class fdafsd 
{

	public static void main(String[] args) 
	{
	
	
	String sResponse = null;
	
	do {
		//Scanner
			Scanner in = new Scanner(System.in);
		
		
		//Asking the user for input
			System.out.println("Press A for Harrisburg, B for Carlisle, C for Lancaster");
		//getting the user output
			char input = in.next().charAt(0); 
		
		//Generating random number
			Random fourDigits = new Random();
		
			Random threeDigits = new Random();
		

			//Random for the last 4 digit
		
			int lastDigits = fourDigits.nextInt(1000) + (1000);
		
			//Random for the 3 digit
			int middleDigits = threeDigits.nextInt(100) + (100);

		
			if (input == 'A')
		
			{
		
				System.out.println("(717) " + middleDigits +"-" + lastDigits);

			}
		
			else if (input == 'B')
			{
			System.out.println("(818) " + middleDigits +"-" + lastDigits);
			}
		
			else if (input == 'C')
			{
			System.out.println("(919) " + middleDigits +"-" + lastDigits);
			}
			
			else
			{
				System.out.println("Wrong choice");
			}
		
			
			System.out.println("Type Y if you would like to generate new number");
			sResponse = in.next();
	
			
	}while(sResponse.equals("Y"));
			
	}
}