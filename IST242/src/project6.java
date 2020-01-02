
//Chakra Baskota
//IST 242
//Project 6

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class project6 extends JFrame implements ActionListener {

	String userInput;
	int ptNumber;
	String ptName = null;
	String ptDescription = null;
	String ptPrice = null;
	JTextField name;
	JTextField number;
	JTextField description;
	JTextField price;

	public project6() {
		buildGUI();
	}

	public final void buildGUI() {
		// setting up the panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(4, 1));
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// assigning the panels
		getContentPane().add(panel1, "North");
		getContentPane().add(panel2, "West");
		getContentPane().add(panel3, "Center");
		getContentPane().add(panel4, "East");
		getContentPane().add(panel5, "South");

		// creating Jlabel
		JLabel ptNumber = new JLabel("Part number: ");
		panel3.add(ptNumber);

		number = new JTextField("", 10);
		panel3.add(number);

		JLabel partNameLabel = new JLabel("Name: ");
		panel3.add(partNameLabel);

		name = new JTextField("", 10);
		panel3.add(name);

		JLabel partDescription = new JLabel("Description: ");
		panel3.add(partDescription);

		description = new JTextField("", 15);
		panel3.add(description);

		JLabel partPrice = new JLabel("Price: ");
		panel3.add(partPrice);

		price = new JTextField("", 10);
		panel3.add(price);

		JButton read = new JButton("Read");
		read.addActionListener(this);
		panel5.add(read);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void getPartName() throws SQLException, ClassNotFoundException {

		// getting data from mysql
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		// connecting to the database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

		System.out.println("Database connected");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * from Inventory WHERE partNumber = " + ptNumber + ";");

		// getting information from the database
		while (resultSet.next()) {
			ptName = resultSet.getString(2);
			ptDescription = resultSet.getString(3);
			ptPrice = resultSet.getString(4);

		}

		connection.close();

	}

	public void actionPerformed(ActionEvent action) {

		// This will execute when user hits read button
		if (action.getActionCommand().equals("Read")) {
			try {
				userInput = number.getText();
				ptNumber = Integer.parseInt(userInput);
				getPartName();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			name.setText(ptName);
			description.setText(ptDescription);
			price.setText(ptPrice);
		}

	}

	// main
	public static void main(String[] args) {
		project6 ex = new project6();
		ex.pack();
		ex.setVisible(true);

	}

}
