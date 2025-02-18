package day8;
/**
 * This program shows the rate of interest in different banks
 * @author chandrashekar
 * @apiNote ROI program
 */
class Bank{
	int balance=0;
	public void deposit(int dep) {
		
		balance=balance+dep;
	    System.out.println("Balance after deposit : "+balance+"\n");
	}
	public void withdraw(int with)
	{
		int remaining=balance-with;
		System.out.println("Balance after withdraw : "+remaining+"\n");
	}
}
class Sbi extends Bank{
	public void transaction() {
		System.out.println("SBI bank ROI : 2.5%");
		System.out.println("SBI bank ROI : "+((balance*(2.5/100))+balance)+"\n");
	}
}
class Idbi extends Bank{
	public void transaction() {
		System.out.println("IDBI bank ROI : 3.5%");
		System.out.println("IDBI bank ROI : "+((balance*(3.5/100))+balance)+"\n");
	}
}
public class OverRiding {
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		Bank sbi=new Sbi();
		Bank idbi=new Idbi();
		bank.deposit(200);
		bank.withdraw(100);
		sbi.deposit(10000);
		((Sbi) sbi).transaction();
		idbi.deposit(5000);
		((Idbi) idbi).transaction();
	}
}
