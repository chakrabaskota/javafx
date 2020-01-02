package lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.text.DecimalFormat;

 



public class Lab4
{

	private String firstName;		//1
	private String lastName;
  	private Character maritalStatus;
	private Double monthlyGrossPay;
	private Integer dependents;
	private double SalaryCalculator;		//2
	
	
	public Lab4()
	{
				  
	}

public Lab4(String firstName, String lastName, Character maritalStatus, Double monthlyGrossPay,Integer dependents)
{
	this.firstName = firstName;

	this.lastName = lastName;

	this.maritalStatus = maritalStatus;

	this.monthlyGrossPay = monthlyGrossPay;

	this.dependents = dependents;

	}


	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName()
	{
	return lastName;
	}

	public Character getMaritalStatus() {
	return maritalStatus;
	}

	public Double getMonthlyGrossPay() {
	return monthlyGrossPay;
	}

	public Integer getDependents() {
	return dependents;
	}
	

	

		 
	private Lab4[] employees;

	 

	public int[] SalaryCalculator() {

	this.employees = new Lab4[5];
	return null;

	}

	 

	public Lab4[] getEmployees() {

	return employees;

	}

	 

	public void addEmployeeData(Lab4 emp) {

	 

	for (int i = 0; i < employees.length; i++) {

	if (employees[i] == null) {

	employees[i] = emp;

	return;

	}

	}

	 

	Lab4[] newEmployeeArray = new Lab4[employees.length + 1];

	for (int i = 0; i < employees.length; i++) {

	newEmployeeArray[i] = employees[i];

	}

	newEmployeeArray[newEmployeeArray.length - 1] = emp;

	this.employees = newEmployeeArray;

	 

	
	}

	 

	public double calculateFederaltax(Lab4 emp)
	{
		Double federalTax = null;
		Double monthlyGrossPay=0.0;
		Character maritalStatus=0 ;
		Double yearlyGrossPay = monthlyGrossPay * 12;

		switch (maritalStatus) 
		{
		case 'S':

		if (yearlyGrossPay <= 9275) {

		federalTax = 0.1 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 9276 && yearlyGrossPay <= 37650) {

		federalTax = 0.15 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 37651 && yearlyGrossPay <= 91150) {

		federalTax = 0.25 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 91151 && yearlyGrossPay <= 190150) {

		federalTax = 0.28 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 190151 && yearlyGrossPay <= 413350) {

		federalTax = 0.33 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 413351 && yearlyGrossPay <= 415050) {

		federalTax = 0.35 * monthlyGrossPay;

		} else {

		federalTax = 0.396 * monthlyGrossPay;

		}

		break;

		case 'M':

		if (yearlyGrossPay <= 18550) {

		federalTax = 0.1 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 18551 && yearlyGrossPay <= 75300) {

		federalTax = 0.15 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 75301 && yearlyGrossPay <= 151900) {

		federalTax = 0.25 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 151901 && yearlyGrossPay <= 231450) {

		federalTax = 0.28 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 231451 && yearlyGrossPay <= 413350) {

		federalTax = 0.33 * monthlyGrossPay;

		} else if (yearlyGrossPay >= 413351 && yearlyGrossPay <= 466950) {

		federalTax = 0.35 * monthlyGrossPay;

		} else {

		federalTax = 0.396 * monthlyGrossPay;

		}
		break;
	}
	
	DecimalFormat df = new DecimalFormat("#.00");

	 

	return Double.parseDouble(df.format(federalTax));

	}

	 

	public double FICA(Lab4 emp) {

	DecimalFormat df = new DecimalFormat("#.00");

	return Double.parseDouble(df.format(emp.getMonthlyGrossPay() * 0.0765));

	}

	 

	public double stateTax(Lab4 emp) {

	DecimalFormat df = new DecimalFormat("#.00");

	return Double.parseDouble(df.format(emp.getMonthlyGrossPay() * 0.0307));

	}

	 

	public double medical(Lab4 emp) {

	DecimalFormat df = new DecimalFormat("#.00");

	return Double.parseDouble(df.format(emp.getDependents() * 150));

	}
	

	
	public static void main(String[] args) throws FileNotFoundException
	{
		Lab4 salaryCalculator = new Lab4();

		 

		try (BufferedReader br = new BufferedReader(new FileReader(new File("Payroll.TXT")))) {

		 

		String line = "";

		 

		while ((line = br.readLine()) != null) {

		 

		String[] split = line.split(",");

		salaryCalculator.addEmployeeData(new Lab4(split[0], split[1], split[2].charAt(0),

				Double.parseDouble(split[4]), Integer.parseInt(split[3])));
		}
		 

		} catch (FileNotFoundException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		 

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("PayReport.txt")))) {

		 

			Lab4[] employees = salaryCalculator.getEmployees();

		bw.write("Name\tGrossPay\tNetPay\tTotalDeduction\tFederal\tFICA\tState\tMedical");

		bw.write("\n");

		 

		for (Lab4 emp : employees) {

		DecimalFormat df = new DecimalFormat("#.00");

		Double totalDeduction = Double.parseDouble(df.format(emp.getMonthlyGrossPay() - salaryCalculator.calculateFederaltax( emp)

		- salaryCalculator.FICA(emp) - salaryCalculator.stateTax(emp) - salaryCalculator.medical(emp)));

		Double netpay = Double.parseDouble(df.format(emp.getMonthlyGrossPay() - totalDeduction));

		bw.write(emp.getFirstName() + " " + emp.getLastName() + "\t" + emp.getMonthlyGrossPay() + "\t" + netpay

		+ "\t" + totalDeduction + "\t" + salaryCalculator.calculateFederaltax( emp) + "\t"

		+ salaryCalculator.FICA(emp) + "\t" + salaryCalculator.stateTax(emp) + "\t"

		+ salaryCalculator.medical(emp));

		bw.write("\n");

		}

		 

		} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();
		
		}
		
	      System.out.println("Processing Complete");
		}

		}

		 

			




	  	 
 


	
