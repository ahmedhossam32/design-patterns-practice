# 🏦 Decorator Design Pattern – Bank Account Buff System

## 🧩 Pattern Type: Structural

This project demonstrates the **Decorator Design Pattern** using a **bank account system** where accounts can be dynamically upgraded with additional features like overdraft protection, premium privileges, and international access. These upgrades modify account behavior at runtime without changing the original `BasicAccount` class.

---

## ❓ Problem

Bank customers may request various account features, such as:

- ✅ Overdraft access (allow negative balance up to a limit)
- ✅ Premium membership (higher withdrawal limits, lower transaction fees)
- ✅ International access (extra fees, weekday-only withdrawal)

We want a flexible system that allows us to apply **any combination** of these features **dynamically**, without creating subclasses like:
OverdraftPremiumInternationalAccount


That would lead to **class explosion** and code duplication.

---

## ✅ Solution Using Decorator Pattern

We implement a `BankAccountDecorator` class that wraps around a `BankAccount` object and implements the same interface. This allows us to dynamically layer multiple decorators around a base account.

---

## 📦 Class Structure

| Class                         | Role                                                   |
|------------------------------|--------------------------------------------------------|
| `BankAccount`                | Interface defining account operations                  |
| `BasicAccount`               | Concrete class for basic accounts                      |
| `BankAccountDecorator`      | Abstract base for all decorators                       |
| `OverdraftProtectionDecorator` | Allows balance to go negative up to -1000             |
| `PremiumAccountDecorator`   | Adds features like 50% reduced fee, higher limits       |
| `InternationalAccessDecorator` | Adds $10 fee and limits to weekdays only             |

---

---

## 💻 Sample Output

```text
===== 🧾 Basic Account Only =====
✅ Withdrawn: $400.0 | Fee: $20.0
❌ Insufficient balance to withdraw: 600.0

===== 💳 Premium Account (Decorator) =====
🌟 Premium benefit applied.
✅ Withdrawn: $400.0 | Fee: $10.0
Remaining Balance: $590.0
Transaction Fee: $10.0

===== 🚨 Overdraft Protection =====
✅ Overdraft withdrawal: $1000.0 | Fee: $20.0
❌ Overdraft limit exceeded. You can’t go below $-1000.0

===== 🌍 International Access Only =====
🌍 International fee of $10 applied.
✅ Withdrawn: $400.0 | Fee: $20.0

===== 🏦 Combined: Premium + Overdraft + International =====
🌟 Premium benefit applied.
🌍 International fee of $10 applied.
✅ Overdraft withdrawal: $600.0 | Fee: $10.0

