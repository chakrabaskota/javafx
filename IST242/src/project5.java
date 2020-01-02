
//Chakra Baskota
//IST 242
//Project 5

import java.io.*;
import java.sql.*;
import java.util.*;

public class project5 {

	public void partFromDB() throws SQLException, ClassNotFoundException {

		String ptName = null;
		String ptDescription = null;
		String ptPrice = null;

		//Loading the Driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		//This establishes the connection between the database and eclipse
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "SBA2019");
		System.out.println("Database connected");

		// Creating a statement
		Statement statement = connection.createStatement();
		
		// Executing the statement
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the part number: ");
		int ptNumber = in.nextInt();

		ResultSet result = statement.executeQuery("select * from Inventory WHERE partNumber = " + ptNumber + ";");
		while (result.next()) {
			ptName = result.getString(2); 
			ptDescription = result.getString(3); 
			ptPrice = result.getString(4);

			System.out.println("The Part Name: " + ptName);
			System.out.println("The Part Description: " + ptDescription);
			System.out.println("The price of the Part is: " + ptPrice);

			ptName = result.getString(2);
			ptDescription = result.getString(3);
			ptPrice = result.getString(4);
		}
		// Close the connection
		connection.close();
	}

	public static void main(String[] args) throws IOException {

		project5 x = new project5();
		try {
			x.partFromDB();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
