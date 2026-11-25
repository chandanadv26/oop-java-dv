package reports;

import transaction.Account;

public class Report {
    public void generateReport(Account a) {
        System.out.println("Transaction Report");
        System.out.println("Account Number: " + a.accountNumber);
        System.out.println("Balance: " + a.balance);
    }
}
