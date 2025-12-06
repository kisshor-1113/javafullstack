package Mypackage;
 class BankAccount{
	 private int accountnumber;
	 private int balance;
	  
	 public int getAccountnumber() {
		 return accountnumber;
	 }
	 
	 public int getBalance() {
		 return balance;
	 }
	 
	 public void setAccountnumber(int newAccountnumber) {
     	
	this.accountnumber=newAccountnumber;	 
     }
	 
	 public void setBalance(int newBalance) {
		 this.balance=newBalance;
	 }	 
	 }
public class Banking {

	public static void main(String[] args) {
		BankAccount obj=new  BankAccount();
		obj.setAccountnumber(454545);
		obj.setBalance(20579);
		System.out.println("The Account number is "+""+obj.getAccountnumber());
		System.out.println("The balance available is "+""+obj.getBalance());
	}
}
