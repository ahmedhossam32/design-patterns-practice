package docr;

public interface BankAccount {
    double getBalance();
    void withdraw(double amount);
    void deposit(double amount);
    double getTransactionFee();
    double getDailyWithdrawalLimit();
    String getAccountHolderName();
}
