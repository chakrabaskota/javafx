//Chakra Baskota
//IST 242
//Professor Whitehouse
//Project 3

//Manager Class

//Manager class extends to the Employee
public class Manager extends Employee 
{
	String departmentStr;

	// set Department
	public void setDepartment(String Department) 
	{
		departmentStr = Department;

	}

	// get Department
	public String getDepartment() 
	{
		return this.departmentStr;
	}
}