package exceptiondemo;

public class EmployeeNotEligibleException extends Throwable {
	public EmployeeNotEligibleException(String message) {
		super(message);
	}

}
