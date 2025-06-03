
🧬 Prototype Pattern – Game Character Cloning

📌 Overview  
This project demonstrates the **Prototype Design Pattern** through a game character cloning system. Instead of creating new objects from scratch, characters are cloned from existing ones — either by shallow or deep copy.

🧱 Structure

| Component        | Description |
|------------------|-------------|
| `GameCharacter`  | Represents a character with a name and a weapon. Supports both shallow and deep cloning methods. |
| `Weapon`         | Nested object inside `GameCharacter` representing the weapon type. |
| `Main`           | Demonstrates both shallow and deep copy scenarios and their effect on shared or independent state. |

🔁 Cloning Methods:
- `shallowCopy()` uses `super.clone()` → shares weapon reference.
- `deepCopy()` manually creates a new `Weapon` object → copies fully.

🧪 Output
```text
Ahmed with weapon: Bow
Hossam with weapon: Bow
Ali with weapon: Axe


This output confirms that:

shallowCopy() caused shared weapon reference (Ahmed and Hossam).
deepCopy() created an independent copy (Ali).
sql
Copy
Edit


---

## 🔒 `creational/singletonpattern/README.md`

```markdown
🔒 Singleton Pattern – Logger Example

📌 Overview  
This project demonstrates the **Singleton Design Pattern** using a simple `Logger` class. It ensures that only one instance of the logger exists throughout the application.

🧱 Structure

| Component   | Description |
|-------------|-------------|
| `Logger`    | Singleton class that provides a global access point through `getInstance()`. |
| `Main`      | Demonstrates usage of the singleton instance and validates that all references point to the same object. |

🔧 Features:
- Lazy initialization
- Private constructor
- Static `getInstance()` method
- Global shared instance

🧪 Output
```text
Logger initialized
[LOG] App started
[LOG] App running
✅ logger1 and logger2 are the SAME instance.


