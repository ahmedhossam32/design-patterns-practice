# 🏭 Simple Factory Pattern – Notification System

## 📌 Overview  
This project demonstrates the **Simple Factory Pattern** through a basic notification system.  
A central factory method creates different types of notifications (Email, SMS, Push) based on input,  
decoupling the creation logic from the client code.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `Notification` | Interface representing a general notification |
| `EmailNotification`, `SMSNotification`, `PushNotification` | Concrete notification types |
| `NotificationFactory` | Simple factory class that returns appropriate notification |
| `Main` | Client code that uses the factory to send notifications |

---

## ✅ Features

- Centralized object creation logic
- **Reduces coupling** between client and concrete classes
- Easily extendable for new types of notifications
- Simple and practical design for real-world systems

---

## 💻 Sample Code

```java
Notification email = NotificationFactory.createNotification("EMAIL");
Notification sms = NotificationFactory.createNotification("SMS");
Notification push = NotificationFactory.createNotification("PUSH");

email.send();
sms.send();
push.send();
