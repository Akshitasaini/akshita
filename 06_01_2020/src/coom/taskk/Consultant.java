package coom.taskk;

import java.time.LocalDate;

public class Consultant extends Employee {
	private double consultationFee;
	
	public Consultant()
	{
		super();
	}

	public Consultant(String employeeId, String employeeName, LocalDate dateOfJoining,double consultationFee) {
		super(employeeId, employeeName, dateOfJoining);
		// TODO Auto-generated constructor stub
		this.consultationFee = consultationFee;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+"consultation fee:"+consultationFee;
	}
	
	

}
