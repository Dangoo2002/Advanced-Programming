package Lecture4_interfaces_abstract_classes;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        DepositTransaction deposit = new DepositTransaction(500, Calendar.getInstance(), "TX001");
        deposit.printTransactionDetails();
        deposit.apply(account);

        System.out.println("Account balance after amount being deposit: " + account.getBalance());

        WithdrawalTransaction withdrawal = new WithdrawalTransaction(200, Calendar.getInstance(), "TX002");
        withdrawal.printTransactionDetails();
        withdrawal.apply(account);

        System.out.println("Account balance after withdrawal: " + account.getBalance());

        if (withdrawal.reverse(account)) {
            System.out.println("Account balance after reversal: " + account.getBalance());
        } else {
            System.out.println("Reversal failed.");
        }
    }
}
