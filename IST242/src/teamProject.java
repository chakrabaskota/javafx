
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.ImageIcon;

public class teamProject extends JFrame implements ActionListener {

	
	JButton button1 = new JButton("Find Information");
	JButton button2 = new JButton("Clear");

	JRadioButton radioButton1 = new JRadioButton("Item 1: Pizza");
	JRadioButton radioButton2 = new JRadioButton("Item 2: Burrito");
	JRadioButton radioButton3 = new JRadioButton("Item 3: Bowl");
	JRadioButton radioButton4 = new JRadioButton("Item 4: Subs");
	
	JLabel name = new JLabel("Item Number: ");
	JLabel fooditems = new JLabel("Food Items");
	JLabel star = new JLabel("***************");
	JLabel image = new JLabel();
	
	
	JTextField textf = new JTextField(10);
	double cheese, pepperoni, supreme, vegetarian, total;

	// setting up the text area
	private JTextArea taArea = new JTextArea("           Nutrition Calculator"+ "\n" +"**************************************" , 20, 20);
	
	
	ButtonGroup group = new ButtonGroup();

	public teamProject() {
	
		initUI();
		
		

	}

	public final void initUI() {
		//creating panels
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(6, 1));
		JPanel panel5 = new JPanel();

		// assigning the panels to location
		getContentPane().add(panel1, "North");
		getContentPane().add(panel2, "West");
		getContentPane().add(panel3, "Center");
		getContentPane().add(panel4, "East");
		getContentPane().add(panel5, "South");
		
		
		image.setIcon(new ImageIcon("C:\\Users\\Chakra\\Desktop\\food.png"));
		panel4.add(fooditems);
		panel4.add(star);
		
		panel2.add(image);
		validate();
		
		panel5.add(taArea);
		
		
		


		// adding Action listener

		button2.addActionListener(this);
		panel5.add(button2);
		
		button1.addActionListener(this);
		panel5.add(button1);

		

		ButtonGroup G1 = new ButtonGroup();
		panel3.add(taArea);

		;

		group.add(radioButton1);
		radioButton1.addActionListener(this);
		panel4.add(radioButton1);

		group.add(radioButton2);
		radioButton2.addActionListener(this);
		panel4.add(radioButton2);
		
		group.add(radioButton3);
		radioButton3.addActionListener(this);
		panel4.add(radioButton3);
		
		group.add(radioButton4);
		radioButton4.addActionListener(this);
		panel4.add(radioButton4);
		G1.add(radioButton1);
		G1.add(radioButton2);
		G1.add(radioButton3);
		G1.add(radioButton4);

		panel5.add(name);

		
		panel5.add(textf);

		setSize(800, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		taArea.setEditable(false);
		
		Color c = new Color(255, 0, 0, 100); 
		
		panel5.setBackground(c);
		
	}
	



	public void actionPerformed(ActionEvent action) {
		
		// If statement helps show the text in taArea as well as adds the price

		if (action.getActionCommand().equals("Item 1: Pizza")) {
			taArea.append("\n" + "Pizza Nutrition Information");
			taArea.append("\n" + "____________________________");

		}

		if (action.getActionCommand().equals("Item 2: Burrito")) {
		
			taArea.append("\n" + "Burrito Nutrition Information");
			taArea.append("\n" + "____________________________");

		}
		if (action.getActionCommand().equals("Item 3: Bowl")) {
			
			taArea.append("\n" + "Chicken Bowl Nutrition Information");
			taArea.append("\n" + "____________________________");

		}
		if (action.getActionCommand().equals("Item 3: Subs")) {
			
			taArea.append("\n" + "Sub Nutrition Information");
			taArea.append("\n" + "____________________________");

		}
		


		// Place Order Button Setup
		if (action.getActionCommand().equals("Clear")) {
			taArea.setText(null);
			radioButton1.setSelected(false);
			radioButton2.setSelected(false);
			radioButton3.setSelected(false);
			radioButton4.setSelected(false);
			
			textf.setText(null);

		}
		if (action.getActionCommand().equals("Find Information")) {

			
		}

		
	}

	
	public static void main(String[] args) {
		teamProject ex = new teamProject();
		ex.setVisible(true);
		ex.setTitle("Nutrition Calculator");
		
		
	}

}