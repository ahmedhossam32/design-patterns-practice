# ☕ Flyweight Pattern – Coffee Order System

## 📚 Design Pattern: Flyweight (Structural)

This project demonstrates the **Flyweight Design Pattern** using a real-world example of a **coffee shop order system**. The goal is to efficiently handle a large number of orders while minimizing memory usage by reusing shared objects.

---

## 🧩 Problem

In a busy coffee shop, there are **hundreds or thousands of orders** every day. While each order is made for a specific customer, most orders are for the **same few coffee types** like:
- Espresso
- Latte
- Cappuccino

If we created a new object for every single order, we would waste memory duplicating the same coffee details repeatedly.

---

## ✅ Solution: Flyweight Pattern

Instead of creating a new object for every order, we:

1. Create **one shared object** per coffee type (e.g., `Latte`, `Espresso`)
2. Store it in a **Flyweight Factory**
3. Pass the **customer-specific details** (like name, table number, and size) as **extrinsic data** at runtime

This saves memory while maintaining flexibility and functionality.

---

## 🧠 Core Concepts Applied

| Concept        | Applied As |
|----------------|------------|
| **Intrinsic State** | Coffee name, description |
| **Extrinsic State** | Customer name, table number, cup size |
| **Flyweight Interface** | `Coffee` |
| **ConcreteFlyweight** | `CoffeeType` (e.g., Espresso, Latte, etc.) |
| **Flyweight Factory** | `CoffeeFactory` – stores and reuses coffee objects |
| **Client** | `Main` class – places orders with extrinsic data |

---

## 🧱 Project Structure

flyweight/
├── Coffee.java // Flyweight interface
├── CoffeeType.java // Concrete flyweight
├── CoffeeFactory.java // Factory for managing shared objects
└── Main.java // Client using the pattern


---

## 💻 Sample Output

Creating new Espresso object
Creating new Latte object
Creating new Cappuccino object
Serving Small Espresso to Ahmed at table 1. Description: Strong and rich coffee
Serving Large Latte to Sara at table 2. Description: Smooth with steamed milk
Serving Medium Espresso to Omar at table 4. Description: Strong and rich coffee
Serving Small Latte to Noor at table 3. Description: Smooth with steamed milk
Serving Large Cappuccino to Ali at table 5. Description: Creamy espresso-based drink


---

## 💡 Why Use Flyweight?

### ✅ Use Case Fit
- You have **many similar objects** (coffee types) used in different contexts.
- Their **core state (name/description)** is shared and doesn’t change.
- The **contextual info (customer, table, size)** can be passed at runtime.

### ✅ Benefits
- ✅ **Memory Efficient** – Only one object per coffee type.
- ✅ **Clean Design** – Separates shared data from per-order context.
- ✅ **Scalable** – Can handle 100,000+ orders without memory explosion.

---

## ✍️ Author

Implemented by **Ahmed Hossam** as part of the structural design pattern practice.
