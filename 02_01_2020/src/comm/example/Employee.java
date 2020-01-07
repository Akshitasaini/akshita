package comm.example;

public class Employee {
private int employeeId;
private String employeeName;
private double salary;
//default constructor
public Employee() {
	
}
//parametrised constructor
public Employee(int employeeId, String employeeName, double salary) {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
}
//create a new employee
public static Employee createEmployee(int employeeId,String employeeName,double salary) {
       return new Employee(employeeId,employeeName,salary);
}
public String displayEmployeeDetails()
{
return "employeeId:"+employeeId + "employeeName:"+employeeName + "salary:"+salary;

}
}