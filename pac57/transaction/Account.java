

package transaction;

public class Account {
    public int accountNumber;
    public double balance;

    public Account(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
