import java.io.*;
import java.text.DateFormat;
import java.util.*;
public class Project2 {

	public static void main(String[] args) {
		try {
			Project2.createStudentReport();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createStudentReport() throws IOException {

		BufferedReader reader;
		BufferedWriter writer;

		reader = new BufferedReader(new FileReader("scores.txt"));
		writer = new BufferedWriter(new FileWriter("report.txt"));

		String line = reader.readLine();
		String format = "%-20s %-15s %-15s%n";
		double totalScore = 0.0;
		int[] gradeCount = new int[5];
		int examNum = 0;
		
		
		writer.write(String.format("%50s%30s%n%n", "Exam Result Report"));
		writer.write(String.format("%-20s %-15s %-15s%n", "Student Name", "Letter Grade", "Score"));
		writer.write(String.format("%-20s %-15s %-15s%n", "================", "=============", "========"));

		while (line != null) {
			
			String[] scoreArr = line.split(",");
			String lastname = scoreArr[1];
			String firstname = scoreArr[2];
			
			double score = Double.parseDouble(scoreArr[0]);
			String letterGrade = "";
			
			if (score >= 90) {
				letterGrade = "A";
				gradeCount[0]++;
			}
			else if (score >= 80 && score <= 89) {
				letterGrade = "B";
				gradeCount[1]++;
			}
			else if (score >= 70 && score <= 79) {
				letterGrade = "C";
				gradeCount[2]++;
			}
			else if (score >= 60 && score <= 69) {
				letterGrade = "D";
				gradeCount[3]++;
			}
			else {
				letterGrade = "F";
				gradeCount[4]++;
			}
			
			writer.write(String.format(format, firstname + " " + lastname, letterGrade, score));
			totalScore += score;
			examNum++;
			line = reader.readLine();
		}
		

		writer.write(String.format("%n%nTotal number of exams %d%n%n%n", examNum));
		writer.write(String.format("Total number of A's %d%n", gradeCount[0]));
		writer.write(String.format("Total number of B's %d%n", gradeCount[1]));
		writer.write(String.format("Total number of C's %d%n", gradeCount[2]));
		writer.write(String.format("Total number of D's %d%n", gradeCount[3]));
		writer.write(String.format("Total number of F's %d%n%n%n", gradeCount[4]));
		writer.write(String.format("Average Exam Score: %.2f%n", totalScore / examNum));
		
		
		reader.close();
		writer.close();
	}
}

