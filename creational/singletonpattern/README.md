# 🔒 Singleton Pattern – Logger Example

## 📌 Overview  
This project demonstrates the **Singleton Pattern** by implementing a `Logger` class.  
The Singleton ensures that only **one instance** of the logger exists across the entire application,  
providing a **global access point** for logging activities.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `Logger` | Singleton class with private constructor and static `getInstance()` |
| `Main` | Demonstrates usage and validates that all logger instances are the same |

---

## ✅ Features

- **Lazy Initialization** – Instance is created only when requested
- **Private Constructor** – Prevents external instantiation
- **Static getInstance()** – Provides global access
- Useful for **logging**, **config management**, **resource control**

---

## 💻 Sample Code

```java
Logger logger1 = Logger.getInstance();
Logger logger2 = Logger.getInstance();

logger1.log("App started");
logger2.log("App running");

System.out.println(logger1 == logger2 ? "✅ SAME INSTANCE" : "❌ DIFFERENT INSTANCES");
