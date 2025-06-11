package docr;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class InternationalAccessDecorator extends BankAccountDecorator {

    public InternationalAccessDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void withdraw(double amount) {
        DayOfWeek today = LocalDate.now().getDayOfWeek();

        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("❌ Withdrawals not allowed on weekends.");
            return;
        }

        double total = amount + getTransactionFee() + 10; // $10 intl fee

        if (amount > getDailyWithdrawalLimit()) {
            System.out.println("❌ Amount exceeds daily withdrawal limit.");
            return;
        }

        if (total > getBalance()) {
            System.out.println("❌ Insufficient balance for international withdrawal.");
            return;
        }

        // Withdraw with extra international fee
        decoratedAccount.withdraw(amount + 10); // Add extra fee directly
        System.out.println("🌍 International fee of $10 applied.");
    }
}

