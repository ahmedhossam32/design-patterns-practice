🔒 Singleton Pattern – Logger Example

📌 Overview  
This project demonstrates the **Singleton Design Pattern** using a simple `Logger` class. It ensures that only one instance of the logger exists throughout the application lifecycle, providing a global point of access for logging.

🧱 Structure

| Component   | Description |
|-------------|-------------|
| `Logger`    | Singleton class that controls its own instance. It exposes `getInstance()` to ensure only one object is ever created. |
| `Main`      | Demonstrates accessing the singleton instance and logging from different references. Validates that all references point to the same object. |

🧰 Key Features
- Lazy Initialization (`instance` is created only when needed)
- Private constructor prevents direct instantiation
- Global access method `getInstance()`
- Used for logging, configuration, or shared services

🧪 Output
Logger initialized
[LOG] App started
[LOG] App running
✅ logger1 and logger2 are the SAME instance.
