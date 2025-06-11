package docr;

public class OverdraftProtectionDecorator extends BankAccountDecorator {
    private final double overdraftLimit = -1000.0;

    public OverdraftProtectionDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + getTransactionFee();

        if (amount <= 0) {
            System.out.println("❌ Withdrawal must be greater than zero.");
            return;
        }

        if (amount > getDailyWithdrawalLimit()) {
            System.out.println("❌ Amount exceeds daily withdrawal limit.");
            return;
        }

        double projectedBalance = getBalance() - total;

        if (projectedBalance < overdraftLimit) {
            System.out.println("❌ Overdraft limit exceeded. You can’t go below $" + overdraftLimit);
            return;
        }

        // withdraw manually
        decoratedAccount.withdraw(0); // this does nothing, but keeps structure
        System.out.println("✅ Overdraft withdrawal: $" + amount + " | Fee: $" + getTransactionFee());
        // update balance manually if necessary
        ((BasicAccount) decoratedAccount).deposit(-total);  // simulate deduction
    }
}
