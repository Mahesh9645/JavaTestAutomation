/*
  two super class and two child class like grand father , father ,son
 
 */
package oops;
public class Multilevel_Inheritance {

    public static void main(String[] args) {
        Withdraw wd = new Withdraw();
        wd.bankDetails();
        wd.availableBalance();
        wd.depositAmount();
        wd.debitedAmount();
    }
}

class HdfcBank {
    String name = "Navya";
    int accountNumber = 123456;
    double accountBalance = 15000;

    public void bankDetails() {
        System.out.println("Account Name: " + name + "\nAccount Number: " + accountNumber);
    }

    public void availableBalance() {
        System.out.println("Present Account Balance: " + accountBalance);
    }
}

class Deposit extends HdfcBank {
    double salary = 20000;
    double totalBalance;  // Now a class-level variable

    public void depositAmount() {
        totalBalance = salary + accountBalance;
        System.out.println("Total Balance after deposit: " + totalBalance);
    }
}

class Withdraw extends Deposit {
    double debited = 25000;

    public void debitedAmount() {
        // Ensure depositAmount() is called first, or use inherited accountBalance
        totalBalance = salary + accountBalance;  // Ensure total balance is correctly set
        double presentAmount = totalBalance - debited;
        System.out.println("After debit, present amount: " + presentAmount);
    }
}
