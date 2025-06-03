# 🧬 Prototype Pattern – Game Character Cloning

## 📌 Overview  
This project demonstrates the **Prototype Pattern** through a game character cloning system.  
Rather than creating new objects from scratch, this pattern allows cloning existing characters  
using shallow or deep copy techniques — useful for performance and object reuse.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `GameCharacter` | Represents a game character with name and weapon, implements cloning |
| `Weapon` | Nested object that the character holds |
| `Main` | Demonstrates both shallow and deep copy behavior |

---

## ✅ Features

- Supports both **shallow** and **deep** copying
- Demonstrates how object references behave in each case
- Highlights use of `Cloneable` and custom copy logic

---

## 💻 Sample Code

```java
Weapon bow = new Weapon("Bow");
GameCharacter original = new GameCharacter("Ahmed", bow);

// Shallow copy
GameCharacter shallowCopy = original.shallowCopy();
shallowCopy.setName("Hossam");

// Deep copy
GameCharacter deepCopy = original.deepCopy();
deepCopy.setName("Ali");
deepCopy.getWeapon().setType("Axe");

System.out.println(original);
System.out.println(shallowCopy);
System.out.println(deepCopy);
