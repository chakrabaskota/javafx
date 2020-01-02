package practice;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer that u would like the multiplication of ");
		int x = input.nextInt();
		
		
		
		for(int i=1; i<11; i++)
		{
			System.out.println(i*x);
		}
	
}
}


