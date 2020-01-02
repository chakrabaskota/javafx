import java.awt.event.*;
import java.awt.event.*;

import javax.swing.*;



public class projpractice extends JFrame implements ActionListener {

	
	
	 JButton button1 = new JButton("Place Order");
	 JButton button2 = new JButton("Clear");
	 JCheckBox checkBox1 = new JCheckBox("cheese Pizza");
	 JCheckBox checkBox2 = new JCheckBox("Pepperoni pizza");
	 JCheckBox checkBox3 = new JCheckBox("Supreme Pizza");
     JCheckBox checkBox4 = new JCheckBox("Vegetarian Pizza");
     JRadioButton radioButton1 = new JRadioButton("Pick Up");
     JRadioButton radioButton2 = new JRadioButton("Delivery");
     JLabel name = new JLabel("Name: ");
     double cheese,pepperoni,supreme,vegetarian,total;
     
      JTextArea textarea = new JTextArea();
      
      
      
	private JTextArea taArea = new JTextArea("Place Order", 20, 20);
	ButtonGroup group = new ButtonGroup();
	
    public projpractice() {
        initUI();
        
    }

    public final void initUI() 
    {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
       
        getContentPane().add(panel1, "North");
        getContentPane().add(panel2, "West");
        getContentPane().add(panel3, "Center");
        getContentPane().add(panel4, "East");
        getContentPane().add(panel5, "South");
        
        
        panel5.add(taArea);
        
        
        
        
        JButton button1 = new JButton("Place Order");
        button1.addActionListener(this);
        panel5.add(button1);
        
        JButton button2 = new JButton("Clear");
        button2.addActionListener(this);
        panel5.add(button2);
        
   
        ButtonGroup G1 = new ButtonGroup(); 
        panel3.add(taArea);        
       
  
        ;
        
      
        JCheckBox checkBox1 = new JCheckBox("cheese Pizza");
        checkBox1.addActionListener(this); 
        panel4.add(checkBox1);
        
        JCheckBox checkBox2 = new JCheckBox("Pepperoni pizza");
        checkBox2.addActionListener(this); 
        panel4.add(checkBox2);

        JCheckBox checkBox3 = new JCheckBox("Supreme Pizza");
        checkBox3.addActionListener(this); 
        panel4.add(checkBox3);
        
        JCheckBox checkBox4 = new JCheckBox("Vegetarian Pizza");
        checkBox4.addActionListener(this); 
        panel4.add(checkBox4);
      
        
        
        JRadioButton radioButton1 = new JRadioButton("Pick Up");
        group.add(radioButton1);
        radioButton1.addActionListener(this);
        panel1.add(radioButton1);
        
        JRadioButton radioButton2 = new JRadioButton("Delivery");
        group.add(radioButton2);
        radioButton2.addActionListener(this);
        panel1.add(radioButton2);
        G1.add(radioButton1);
        G1.add(radioButton2);
        
        panel5.add(name);
        
        JTextField textarea = new JTextField(10);
        textarea.addActionListener(this);
        panel5.add(textarea);
       
        
	  
        
        setSize(800, 300);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


	public void actionPerformed(ActionEvent action) 
	{
		if (action.getActionCommand().equals("cheese Pizza"))
		{
			 cheese =10;
			taArea.append("\n" + "Cheese Pizza");
			
		}

		if (action.getActionCommand().equals("Pepperoni pizza"))
		{
			 pepperoni =11;
			taArea.append("\n" + "Pepperoni pizza");
			
		}
		if (action.getActionCommand().equals("Supreme Pizza"))
		{
			 supreme =12;
			taArea.append("\n" + "Supreme Pizza");
			
		}
		if (action.getActionCommand().equals("Vegetarian Pizza"))
		{
			 vegetarian =13;
			taArea.append("\n" + "Vegetarian Pizza");
			
		}
		
		if (action.getActionCommand().equals("Pick Up"))
		{
			taArea.append("\n" + "Pick Up");
		}

		if (action.getActionCommand().equals("Delivery"))
		{
			taArea.append("\n" + "Delivery");
		}
		
		total = cheese + supreme + pepperoni + vegetarian;
		
		if (action.getActionCommand().equals("Place Order"))
	       {
	       //adding additional price for each of the selected Topping 
			
			taArea.append("\n" + "Total Price: ");
			 taArea.append(Double.toString(total)); 
			 taArea.append(textarea.getText()); 
	       }
		if (action.getActionCommand().equals("Clear"))
		{
			taArea.setText("");
		}
	}
	 public static void main(String[] args) 
	 {
	         projpractice ex = new projpractice();
	         ex.setVisible(true);
	         ex.setTitle("Pizza Order");
	 }
	 
 
}