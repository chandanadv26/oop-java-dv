import transaction.Account;
import reports.Report;

class Main {
    public static void main(String[] args) {

        Account a = new Account(101, 5000);

        a.deposit(1000);
        a.withdraw(500);

        Report r = new Report();
        r.generateReport(a);
    }
}
