# 🌍 Facade Pattern – Travel Booking System (Rome & Barcelona Packages)

## 📚 Design Pattern: Facade (Structural)

This project demonstrates the **Facade Design Pattern** through a real-world example of booking a complete travel package (flight, hotel, car rental) for cities like **Rome** and **Barcelona**. The Facade class provides a simplified interface for the client to interact with a complex set of subsystems.

---

## 🧩 Problem

Booking a trip often involves coordinating multiple subsystems:
- Searching and booking flights
- Reserving a hotel for specific dates
- Renting a car for your stay

Each of these actions requires dealing with individual APIs or services. For the client, this complexity should be hidden.

---

## ✅ Solution

The **`Facade` class** encapsulates all the subsystems (Flight, Hotel, CarRental) and exposes a single method per package, like:
- `DecemberPackageRome(...)`
- `BarcelonaSummerPackage(...)`

This allows the client to request a package in **one line** without worrying about how the internal booking logic works.

---

## 🧠 Core Concepts Applied

- **Facade Pattern**: Provides a unified interface to a set of interfaces in a subsystem.
- **Encapsulation**: Each subsystem class is responsible for its own behavior.
- **Abstraction**: The Facade hides all internal steps from the user.

---

## 📁 Project Structure
FacadePatternProject/
│
├── Flight.java
├── Hotel.java
├── CarRental.java
├── Facade.java
└── Main.java


---

## 🖥️ Console Output (Sample)

```text
=== ROMA PACKAGE ===
Booking Roma Package

🎁 YOUR BOOKING PACKAGE SUMMARY
============================================

✈️  Flight Details:
Flight{departure='Cairo', destination='Roma', date='December', airline='ITA Airways'}

🏨 Hotel Details:
Hotel{hotelName='Grand Roma', city='Roma', nights=4}

🚗 Car Rental Details:
CarRental{city='Roma', carType='SUV', rentalDays=5}

✅ Booking Complete! Have a great trip!

=== BARCELONA PACKAGE ===
Booking Barcelona Summer Package

🎁 YOUR BOOKING PACKAGE SUMMARY
============================================

✈️  Flight Details:
Flight{departure='Cairo', destination='Barcelona', date='July', airline='Vueling'}

🏨 Hotel Details:
Hotel{hotelName='Hotel Barcelona Center', city='Barcelona', nights=3}

🚗 Car Rental Details:
CarRental{city='Barcelona', carType='Compact', rentalDays=4}

✅ Booking Complete! Have a great trip!
