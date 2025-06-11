package docr;

public abstract class BankAccountDecorator implements BankAccount{
   protected BankAccount decoratedAccount;

        public BankAccountDecorator(BankAccount decoratedAccount) {
            this.decoratedAccount = decoratedAccount;
        }

        @Override
        public String getAccountHolderName() {
            return decoratedAccount.getAccountHolderName();
        }

        @Override
        public double getBalance() {
            return decoratedAccount.getBalance();
        }

        @Override
        public double getDailyWithdrawalLimit() {
            return decoratedAccount.getDailyWithdrawalLimit();
        }

        @Override
        public double getTransactionFee() {
            return decoratedAccount.getTransactionFee();
        }

        @Override
        public void deposit(double amount) {
            decoratedAccount.deposit(amount);
        }

        @Override
        public void withdraw(double amount) {
            decoratedAccount.withdraw(amount);
        }
}


