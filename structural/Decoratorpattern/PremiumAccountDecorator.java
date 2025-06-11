package docr;

public class PremiumAccountDecorator extends BankAccountDecorator {

    public PremiumAccountDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public double getDailyWithdrawalLimit() {
        return decoratedAccount.getDailyWithdrawalLimit() + 5000;
    }

    @Override
    public double getTransactionFee() {
        return decoratedAccount.getTransactionFee() * 0.5;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("🌟 Premium benefit applied.");
        super.withdraw(amount);
    }
}
