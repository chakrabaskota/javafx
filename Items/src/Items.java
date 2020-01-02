
/**********************************************************
 *Filename:			Items.java
 *Package:
 *Project:			07-2-Items
 *Author:			Chakra Baskota
 *Section:			IST 242
 *Assignment:		Wk3 - Read and Write text
 *Description:		
 *Date Created:		1/24/2018
 *Date Modified:	1/24/2018
 *Modifier:			Fexit Felix 
 *Changes:				
 *Note:				Input cannot have a return after the last item
*********************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

/**
   This program reads a file whose lines contain items and prices,
   like this:
   item name 1, price 1,qty1
   item name 2, price 2,qty2
   item name 3, price 3,qty3
   
   ...
   Each item name and price is terminated with a comma, except last one
   The program writes a file in which the items are left-aligned
   and the prices are right-aligned. The last line has the total
   of the prices.
*/
public class Items
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names

      Scanner console = new Scanner(System.in);
      String newLine = System.getProperty("line.separator");
      
//      System.out.print("Input file: ");
//      String inputFileName = console.next();
//      System.out.print("Output file: ");
//      String outputFileName = console.next();
      //File inputFile = new File(inputFileName);

      // Construct the Scanner and PrintWriter objects for reading and writing
	 JFileChooser chooser = new JFileChooser();
		if( (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION))
		{	
			File inputFile = chooser.getSelectedFile();
		
		    Scanner in = new Scanner(inputFile);
//		      System.out.print("Output file: ");
//		      String outputFileName = console.next();
		      String outputFileName; 
		      outputFileName  = JOptionPane.showInputDialog("Enter Output File Name");
		      
		      PrintWriter out = new PrintWriter(outputFileName);
		      in.useDelimiter(",");
 // Read the input and write the output
		
		      double total = 0;
		      String[] strProduct = new String[3];
		      double[] dPrice = new double[3];
		      int[] nQty = new int[3];
		      double dLineTotal[] = new double[3];
		      
		      int x = 0; 
// read a line at a time since there may be spaces in the item names

		      while(in.hasNext())
		      {
		    	  strProduct[x] = in.next();
		    	  dPrice[x] = Double.parseDouble(in.next());
		    	  nQty[x] = Integer.parseInt(in.next());
		    	  dLineTotal[x] = dPrice[x]*nQty[x];
		    	  x++;
		      }
		      for(x=0; x<nQty.length; x++)
		      {
		    	  System.out.println(strProduct[x] + " " +dPrice[x]) ;
		    	  total += dLineTotal[x];
		    	  out.printf("%-25s%10.2f * %d = %10.2f", strProduct[x],dPrice[x],nQty[x],dLineTotal[x]);
		      }
		      
		      
		      
		      out.printf(newLine);
		      out.printf("%-25s%10.2f\n", "Total:", total);
		      
		      in.close();
		      out.close();
		      console.close();
		      System.out.println("Processing Complete");
		}
   }
}
