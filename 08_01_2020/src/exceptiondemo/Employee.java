package exceptiondemo;

public class Employee {
private String employeeId;
private String employeeName;
private String address;
private double experience;
private Employee employee=null;
public Employee(String employeeId, String employeeName, String address) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.address = address;
	
	
}

/*@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
			+ ", experience=" + experience + "]";
}


@Override
public  hashCode() {
	
}*/


public String getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public double getExperience() {
	return experience;
}

public void setExperience(double experience) {
	this.experience = experience;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public  Employee createEmployee(String employeeName,double experience) throws EmployeeNotEligibleException

{
	employee = new Employee(employeeName,employeeId,address);
	if(employee.getExperience()<2.0)
	{
		
		throw new EmployeeNotEligibleException("employee not eligible");
		
	}
	return employee;
}

public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address
			+ ", experience=" + experience + "]";
}

}

