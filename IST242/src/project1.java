//Chakra Baskota
//IST 242
//Project1

import java.util.Random;
import java.util.Scanner;

public class project1 
{

	public static void main(String[] args) 
	{

		String sResponse = null;
		
		do {
			//Setting up the Scanner
				Scanner in = new Scanner(System.in);
			
			
			//Outputting the question
				System.out.println("Enter A for a Harrisburg phone number");
				System.out.println("Enter B for a Philadelphia phone number");
				System.out.println("Enter C for a Pittsburgh phone number");
				System.out.println("Enter D for a Allentown phone number");
				System.out.println("Please make your selection here --> ");
				
				
				
			//getting the user input
				char input = in.next().charAt(0); 
			
			//Generating random number
				Random fourDigits = new Random();
			
				Random threeDigits = new Random();
			

				//Random for the last 4 digit
			
				int lastDigits = fourDigits.nextInt(1000) + (1000);
			
				//Random for the 3 digit
				int middleDigits = threeDigits.nextInt(100) + (100);

			//This will print out the phone # for Harrisburg
				if (input == 'A')
				{
					System.out.println("Your new phone number is: (717) " + middleDigits +"-" + lastDigits);
				}
				
			//This will print out the phone # for Philadelphia
				else if (input == 'B')
				{
					System.out.println("Your new phone number is: (267) " + middleDigits +"-" + lastDigits);
				}
				
			//This will print out the phone # for Pittsburgh
				else if (input == 'C')
				{
					System.out.println("Your new phone number is: (412) " + middleDigits +"-" + lastDigits);
				}
				
			//This will print out the phone # for Allentown
				else if (input == 'D')
				{
					System.out.println("Your new phone number is: (610) " + middleDigits +"-" + lastDigits);
				}
				
			//When the user inputs incorrect choice
				else
				{
					System.out.println("Wrong choice");
				}
			
			//Asking user whether they would like to generate new number
				System.out.println("Type Y if you would like to generate new number.");
				sResponse = in.next();
		
				
		}while(sResponse.equals("Y"));

	}

}
