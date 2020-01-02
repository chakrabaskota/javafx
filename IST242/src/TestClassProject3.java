
//Chakra Baskota
//IST 242
//Professor Whitehouse
//Project 3

import java.util.Scanner;

public class TestClassProject3 
{

	public static void main(String[] args) 
	{
		// Setting up the scanner
		String name, department, salary;
		Scanner in = new Scanner(System.in);

		// Setting up the manager array
		Manager mgrArray[] = new Manager[3];
		mgrArray[0] = new Manager();
		mgrArray[1] = new Manager();
		mgrArray[2] = new Manager();

		// Populate Array Objects
		// This loop populates the Manager last name, department, and salary into the
		// array
		for (int x = 0; x < mgrArray.length; x++)

		{
			System.out.println("Enter the Manager's last name:");
			name = in.next();
			mgrArray[x].setName(name);

			System.out.println("Enter the Department they work in: ");
			department = in.next();
			mgrArray[x].setDepartment(department);

			System.out.println("Enter the salary of : ");
			salary = in.next();
			mgrArray[x].setSalary(salary);

		}
		// Populate Array Objects
		// This loop prints out the Manager last name, Department and the Salary
		for (int x = 0; x < mgrArray.length; x++) 
		{
			name = mgrArray[x].getName();
			System.out.println("The manager Last name is " + name);

			department = mgrArray[x].getDepartment();
			System.out.println("They work in " + department);

			salary = mgrArray[x].getSalary();
			System.out.println("They have a salary of " + salary);
			System.out.println();
		}

	}

}
