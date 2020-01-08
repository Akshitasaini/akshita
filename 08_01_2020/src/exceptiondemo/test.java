package exceptiondemo;

public class test {
	public static void main(String[] args) throws InvalidPasswordException
	{
		Password password = new Password();
		try {
        password.checkPassword("happybirthday");
		
		}
		catch(Exception e)
		{System.out.println(password);
			}
}
}