package docr;

public class Main {
    public static void main(String[] args) {
                System.out.println("===== 🧾 Basic Account Only =====");
                BankAccount basic = new BasicAccount("Ahmed", 1000);
                basic.withdraw(400); // OK
                basic.withdraw(600); // Should fail (fee makes it exceed balance)

                System.out.println("\n===== 💳 Premium Account (Decorator) =====");
                BankAccount premium = new PremiumAccountDecorator(new BasicAccount("Lina", 1000));
                premium.withdraw(400); // Lower fee, higher limit
                System.out.println("Remaining Balance: $" + premium.getBalance());
                System.out.println("Transaction Fee: $" + premium.getTransactionFee());

                System.out.println("\n===== 🚨 Overdraft Protection =====");
                BankAccount overdraft = new OverdraftProtectionDecorator(new BasicAccount("Omar", 500));
                overdraft.withdraw(1000); // Should use overdraft
                overdraft.withdraw(600);  // Should exceed -1000 and fail

                System.out.println("\n===== 🌍 International Access Only =====");
                BankAccount intl = new InternationalAccessDecorator(new BasicAccount("Sara", 1000));
                intl.withdraw(400); // Only works on weekdays, adds $10 fee

                System.out.println("\n===== 🏦 Combined: Premium + Overdraft + International =====");
                BankAccount full = new InternationalAccessDecorator(
                        new OverdraftProtectionDecorator(
                                new PremiumAccountDecorator(
                                        new BasicAccount("Ziad", 300))));
                full.withdraw(600);  // Should allow: increased limit, reduced fee, overdraft + intl fee

                System.out.println("\n===== ✅ Test Finished =====");

    }
}