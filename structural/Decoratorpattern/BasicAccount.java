package docr;

public class BasicAccount implements BankAccount {
    private String accountHolderName;
    private double balance;
    private double dailyWithdrawalLimit;
    private double transactionFee;

    public BasicAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.dailyWithdrawalLimit = 5000.0; // default daily limit
        this.transactionFee = 20.0;         // default fee per transaction
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    @Override
    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("✅ Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal must be greater than zero.");
            return;
        }

        if (amount > dailyWithdrawalLimit) {
            System.out.println("❌ Amount exceeds daily withdrawal limit of $" + dailyWithdrawalLimit);
            return;
        }

        double total = amount + transactionFee;
        if (total > balance) {
            System.out.println("❌ Insufficient balance. You need $" + total + " including fee.");
            return;
        }

        balance -= total;
        System.out.println("✅ Withdrawn: $" + amount + " | Fee: $" + transactionFee);
    }
}
