# Adapter Pattern – Legacy SMS Notification Example

## 📚 Design Pattern: Adapter (Structural)

This project demonstrates the **Adapter Design Pattern** using a real-world example of integrating a **legacy SMS notification system** into a modern backend application that expects a common `Notifier` interface.

---

## 🧩 Problem

Our system already uses a `Notifier` interface to send notifications (e.g. email). A new requirement is to add **SMS support** using an old, legacy class `LegacySMS`, which has a different interface and cannot be modified.

The goal is to **adapt** the legacy class so it can be used just like any other `Notifier`, without changing the existing system.

---

## ✅ Solution

We created an **`SMSAdapter`** class that implements the `Notifier` interface and internally uses an instance of `LegacySMS`.

This allows `LegacySMS` to behave like a `Notifier`, making it compatible with the existing system.

---

## 🧠 Core Concepts Applied

- **Adapter Pattern (Object Adapter)**: We used **composition**, not inheritance.
- **Interface Translation**: We converted the `send(to, message)` call into two separate calls to the legacy system:
  - `configureConnection(to)`
  - `push(message)`

---

## 🔧 Classes

| Class               | Description                                         |
|--------------------|-----------------------------------------------------|
| `Notifier`          | Target interface expected by the system            |
| `EmailNotifier`     | Existing class that implements `Notifier`          |
| `LegacySMS`         | Unmodifiable third-party or legacy class           |
| `SMSAdapter`        | Adapter class that makes `LegacySMS` compatible    |
| `NotificationService` | Client code that tests both email and SMS cases |

---

## 💻 Example Usage

In the `NotificationService` class:

```java
Notifier emailNotifier = new EmailNotifier();
emailNotifier.send("user@example.com", "Your order has been shipped.");

Notifier smsNotifier = new SMSAdapter();
smsNotifier.send("0123456789", "Your OTP code is 543210.");

