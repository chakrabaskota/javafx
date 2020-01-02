//********************************************
//Chakra Baskota
//IST 242
//Project 2
//******************************************
import java.io.*;
import java.util.*;


public class secondProject 
{
	// setting up the scanner
	Scanner inFile;
	PrintWriter outFile;

	// initializing variables
	double score;
	String lastName;
	String firstName;
	String gradeInLetter;

	// this is for catching errors
	{
		try 
		{
			inFile = new Scanner(new File("scores.txt"));
			outFile = new PrintWriter(new FileWriter("report.txt"));
			reader();
			inFile.close();
			outFile.close();

		} 
		catch (Exception e) 
		{

			if (e instanceof FileNotFoundException) {
				System.out.println("Error, the file couldn't be found");
				System.exit(1);
			}

		}

	}

	public void reader() throws IOException 
	{
		inFile.useDelimiter(",|\r\n");
		int count = 0;
		double sum = 0;
		int[] grade = new int[5];
		// for calendar
		Calendar today = Calendar.getInstance();
		// Displays the header
		outFile.print("\t\t\tExam Results Report ");
		outFile.println("\t\t\t\t" + today.getTime());
		outFile.println();
		outFile.print("Student Name \t Letter Grade \t Score \n");
		outFile.print("************  \t ************* \t ***** \n");
		outFile.println();
		// getting information from .txt file
		while (inFile.hasNext()) {

			score = inFile.nextInt();
			lastName = inFile.next();
			firstName = inFile.next();

			count++;
			sum += score;
			// if statement for letter grade
			if (score >= 90 && score <= 100) {
				gradeInLetter = "A";
				grade[0]++;
			} else if (score >= 80 && score <= 89) {
				gradeInLetter = "B";
				grade[1]++;
			} else if (score >= 70 && score <= 79) {
				gradeInLetter = "C";
				grade[2]++;
			} else if (score >= 60 && score <= 69) {
				gradeInLetter = "D";
				grade[3]++;
			} else {
				gradeInLetter = "F";
				grade[4]++;
			}

			// output file
			outFile.print(firstName + " ");
			outFile.print(lastName + " \t\t");
			outFile.print(gradeInLetter + " \t");
			outFile.println(score);

		}

//outputting the number of exams and numbers of letter grades
		outFile.println();
		outFile.println();
		outFile.println("=================================================");
		outFile.println("Total number of exams: " + count);
		outFile.println("Total number of A's    " + grade[0]);
		outFile.println("Total number of B's    " + grade[1]);
		outFile.println("Total number of C's    " + grade[2]);
		outFile.println("Total number of D's    " + grade[3]);
		outFile.println("Total number of F's    " + grade[4]);
		outFile.println("Average Exam Score:    " + sum / count);
		outFile.println("=================================================");

	}

	public static void main(String args[]) 
	{
		//main method
		secondProject z = new secondProject();
	}
}
