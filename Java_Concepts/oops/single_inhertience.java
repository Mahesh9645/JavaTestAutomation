/*
 IS-a== class to class     Has-a== interface to class
 
Single inhertience=One class acquiring the properties of another class is called as
Inheritance.
extends is a keyword which indicates that we are creating a new
class from an existing class
*/

package oops;
//if  u mention public it is main class
public class single_inhertience {

	public static void main(String[] args) {
	 
		deposite obj = new deposite();
		obj.bank_details();
		obj.deposite_amount();
		
		
	}

}
class Hdfc_bank{
	String name="navya";
	int  account_number=123456;
	double account_balance=15000;
	
	public void bank_details() {
		System.out.println("account_name : " + name + "\naccount_number : " + account_number);
	}
	
	public void avalibale_balance() {
		System.out.println("present_account_balance"+account_balance);
	}
	
}


class deposite extends Hdfc_bank{
	double salary= 20000;
	
	public void deposite_amount() {
	 double total_balance = salary+account_balance;
	 
	 System.out.println("total balance after balance "+total_balance);
	 
	}
}
