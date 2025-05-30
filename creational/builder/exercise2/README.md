 
# 🧳 Exercise 2: Travel Package using Builder Pattern

This exercise demonstrates the **Builder Design Pattern** by constructing a customizable `TravelPackage` object. This object includes optional fields like flight class, hotel rating, excursions, and insurance — all built step-by-step using a fluent builder interface.

---

## 🧠 Problem

In real-world scenarios like travel booking, objects often have **many optional parameters**. Using constructors with too many parameters makes the code hard to read, error-prone, and inflexible.

---

## ✅ Solution

The Builder Pattern helps:
- Avoid telescoping constructors
- Support optional parameters cleanly
- Improve readability using **method chaining**
- Keep the `TravelPackage` class immutable once built

---

## 🧩 Features Implemented

- Fluent interface with chained `.setX()` and `.addY()` methods
- Optional fields (excursions, airport transfer, insurance, etc.)
- Automatic cost calculation based on selected options
- `toString()` to print the final package summary

---

## 📂 Files

| File                | Purpose                          |
|---------------------|----------------------------------|
| `TravelPackage.java` | Main class with nested Builder   |
| `BuilderPattern.java` | Sample `main()` usage            |

---

## 💻 Sample Code

```java
TravelPackage trip = new TravelPackage.Builder()
    .setDestination("Paris")
    .setNumberOfDays(7)
    .setHotelClass(5)
    .setFlightClass("business")
    .setAirportTransfer(true)
    .setMealPlan("full-board")
    .addExcursion("Eiffel Tower Tour")
    .addExcursion("Seine River Cruise")
    .setTravelInsurance(true)
    .setLocalGuide(true)
    .build();

System.out.println(trip);

example output:
TravelPackage {
  Destination: 'Paris'
  Days: 7
  Hotel: 5-star
  Flight: business
  Airport Transfer: true
  Meal Plan: full-board
  Excursions: [Eiffel Tower Tour, Seine River Cruise]
  Insurance: true
  Local Guide: true
  Total Cost: $2930.0
}
