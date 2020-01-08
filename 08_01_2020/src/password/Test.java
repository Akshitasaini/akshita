package password;

public class Test {

	public static void main(String[] args) throws invalidpassword {
		
		chechpassword ch = new chechpassword("HAPPYBIRTHDAY$");
		ch.checkpassword("HAPPYBIRTHDAY");
		
		System.out.println(ch);
		

	}
}
