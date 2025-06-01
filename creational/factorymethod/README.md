
# 🏭 Factory Method Pattern – Cleaning Service Example

## 📌 Overview

This project demonstrates the **Factory Method** design pattern using a real-world example of a cleaning service platform.

Instead of instantiating cleaning service types directly, the program uses an abstract creator to encapsulate object creation, adhering to the Factory Method principle.

---

## 🧱 Structure

| Component | Description |
|----------|-------------|
| `CleaningService` | Interface representing a cleaning task. |
| `HomeCleaning`, `OfficeCleaning`, `DeepCleaning` | Concrete implementations of `CleaningService`. |
| `CleaningServiceCreator` | Abstract class that defines the `createService()` factory method. |
| `HomeCleaningCreator`, `OfficeCleaningCreator`, `DeepCleaningCreator` | Concrete creators that instantiate specific cleaning services. |
| `Main` | Demonstrates usage of the factory creators. |

---

## 🧪 Output

When running `Main.java`, the output will be:
Home Cleaning
Office cleaning
Performing Deep cleaning !!
