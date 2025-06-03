# 🏭 Factory Method Pattern – Cleaning Service Platform

## 📌 Overview  
This project demonstrates the **Factory Method Pattern** using a real-world cleaning service platform.  
Instead of creating service objects directly, it uses abstract creators to instantiate the right cleaning service, promoting flexibility and code scalability.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `CleaningService` | Interface representing a general cleaning task |
| `HomeCleaning`, `OfficeCleaning`, `DeepCleaning` | Concrete cleaning service implementations |
| `CleaningServiceCreator` | Abstract class that declares the factory method `createService()` |
| `HomeCleaningCreator`, `OfficeCleaningCreator`, `DeepCleaningCreator` | Concrete creators returning specific service types |
| `Main` | Demonstrates creation and usage of different cleaning services |

---

## ✅ Features

- Encapsulates object creation in subclasses
- Supports **Open/Closed Principle** (easily extendable)
- Decouples client code from specific product classes
- Encourages use of polymorphism and interfaces

---

## 💻 Sample Code

```java
CleaningServiceCreator homeCreator = new HomeCleaningCreator();
CleaningServiceCreator officeCreator = new OfficeCleaningCreator();
CleaningServiceCreator deepCreator = new DeepCleaningCreator();

homeCreator.createService().performCleaning();
officeCreator.createService().performCleaning();
deepCreator.createService().performCleaning();
