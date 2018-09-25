package employeeRegistration;
public class EmployeesBusiness extends Employees { // extending Employees class 
	String name;  // variables 
    String department;
    
	public String getName() { //gets and settlers 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}

