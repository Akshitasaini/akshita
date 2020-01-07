package comm.create;
 import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

	private String accNo;
	private AccountType accType;
	private double amount;
	private LocalDate opeingDate;
	private static Account account;
	 static
	 {
		 account = new Account();
	 }

	
	public static Account createAccount(AccountType accType,double amount)
	{
	account.setAccNo(UUID.randomUUID().toString());
	account.setAccType(accType);
	account.setAmount(amount);
	account.setOpeingDate(LocalDate.now());
	return account;
	
}

public String displayAccount()
{
return "accountName:"+getAccNo()+"accountType:"+getAccType()+"amount:"+getAmount();	
}
}