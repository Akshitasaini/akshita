package exceptiondemo;

public class InvalidPasswordException extends Throwable {
public InvalidPasswordException(String message) {
	super(message);

}
}
