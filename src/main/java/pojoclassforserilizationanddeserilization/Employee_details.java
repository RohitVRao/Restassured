package pojoclassforserilizationanddeserilization;

public class Employee_details {
	
	
	String employeeid;
	String employeename;
	int employeephonenumber;
	
	public Employee_details(String employeeid, String employeename, int employeephonenumber) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeephonenumber = employeephonenumber;
	}
	
	public Employee_details()
	{
		
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeephonenumber() {
		return employeephonenumber;
	}

	public void setEmployeephonenumber(int employeephonenumber) {
		this.employeephonenumber = employeephonenumber;
	}
	
	
	
	
	
	

}
