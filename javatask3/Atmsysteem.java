package javatask3;
import java.util.Scanner;
class BankAccount{
	private double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount is deposited successfully");
		}
		else {
			System.out.println("Amount entered is invalid to depoosit");
		}
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Amount entered is invalid");
		}
		else if(amount>balance) {
			System.out.println("Amount is insufficient");
		}
		else {
			balance=balance-amount;
			System.out.println("Please collect your cash");
		}
	}
}
class ATM{
	private BankAccount acc;
	public ATM(BankAccount acc) {
		this.acc=acc;
	}
	public void start() {
		Scanner s=new Scanner(System.in);
		int choice;
		do {
			System.out.println("YOUR ATM MENU");
			System.out.println("1.Check balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter choice");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Balance:"+acc.getbalance());
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double dep=s.nextDouble();
				acc.deposit(dep);
				break;
			case 3:
				System.out.println("Enter amount to withdraw:");
				double with = s.nextDouble();
				acc.withdraw(with);
				break;
			case 4:
				System.out.println("Thankyou for accessing ATM machine");
				break;
			default:
				System.out.println("It is invalid choice");
				}
		}while(choice!=4);
	}
}
public class Atmsysteem{
	public static void main(String[] Args) {
		BankAccount userAccount=new BankAccount(1000);
		ATM atm=new ATM(userAccount);
		atm.start();
		
	}
}