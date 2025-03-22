/*
 * one super class and two child class
 */
/*package oops;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Withdraw wd = new Withdraw();
        wd.bankDetails();
        wd.availableBalance();
        wd.debitedAmount();
        
        Deposit dp = new Deposit();
        dp.depositAmount();
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
    double totalBalance;

    public void depositAmount() {
        totalBalance = salary + accountBalance;
        System.out.println("Total Balance after deposit: " + totalBalance);
    }
}

class Withdraw extends HdfcBank {
    double debited = 25000;

    public void debitedAmount() {
        double presentAmount = accountBalance - debited;
        System.out.println("After debit, present amount: " + presentAmount);
    }
}

	
	*/
	
	
	  
	  package oops;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Withdraws wd = new Withdraws();
        wd.bankDetails();
        wd.availableBalance();
        wd.depositAmount(20000);
        wd.debitAmount(25000);
        wd.availableBalance();
    }
}

class HdfcBanks {
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

class Deposits extends HdfcBanks {
    public void depositAmount(double salary) {
        accountBalance += salary; // Updating the actual account balance
        System.out.println("Total Balance after Deposit: " + accountBalance);
    }
}

class Withdraws extends Deposits {
    public void debitAmount(double debited) {
        if (debited <= accountBalance) {
            accountBalance -= debited;
            System.out.println("After Debited, Present Amount: " + accountBalance);
        } else {
            System.out.println("Insufficient balance! Transaction failed.");
        }
    }
}

	 
