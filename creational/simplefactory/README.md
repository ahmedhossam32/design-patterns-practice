
# Simple Factory Pattern – Notification System

This example demonstrates the Simple Factory Pattern in Java using a Notification System.

## 💡 Pattern Summary

The factory returns different types of notifications (Email, SMS, Push) based on input.
This decouples the creation logic from the client code.

## 📁 Classes

- `Notification` – interface
- `EmailNotification`, `SMSNotification`, `PushNotification` – implementations
- `NotificationFactory` – simple factory that returns the right object
- `Main` – client code using the factory

## ✅ Output Example
Sending an Email Notification
Sending an SMS Notification
Sending a Push Notification
