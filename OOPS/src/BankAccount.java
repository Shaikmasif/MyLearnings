
public class BankAccount {
	static int amount = 10000;
	private int pin = 4816;
	public void withdraw(int money,int password) {
		if(password==pin) {
			amount = amount-money;
			System.out.println("Withdrawal amount = "+money);
			System.out.println("Balance Amount = "+amount);
		}else {
			System.out.println("Please enter correct pin");
		}
	}
}
