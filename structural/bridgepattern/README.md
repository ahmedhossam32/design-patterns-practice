# Bridge Pattern - Authentication System Example

## 🧠 Pattern Type
**Structural Design Pattern**

---

## 🎯 Intent
> Decouple an abstraction from its implementation so that both can vary independently.

---

## 📚 Context

In this example, we simulate an **authentication system** that works across **multiple platforms** (e.g., Web, Mobile, Desktop) using various **authentication methods** (e.g., Email/Password, OAuth, Biometrics).

Each platform handles user interaction differently, but should work with any authentication method — and vice versa.

Using the **Bridge pattern**, we separate the platform logic from the authentication logic, allowing us to mix and match platforms and authentication types without creating redundant combinations or tightly coupled code.

---

## 🧩 Structure
Abstraction Implementor
(Platform) (Authentication)
| |
↓ ↓
Refined Abstraction Concrete Implementors
(Web, Mobile, ...) (Email, OAuth, Biometric, ...)


- `Platform` – the high-level abstraction
- `Authentication` – the low-level implementor interface
- `WebPlatform`, `MobilePlatform`, etc. – refined abstractions
- `EmailAuth`, `OAuthAuth`, `BiometricAuth` – concrete implementors

---

## 🛠️ Components

| Class/Interface     | Role                         |
|---------------------|------------------------------|
| `Platform`          | Abstraction                  |
| `WebPlatform`       | Refined Abstraction          |
| `Authentication`    | Implementor Interface        |
| `EmailAuth`         | Concrete Implementor         |
| `OAuthAuth`         | Concrete Implementor         |
| `BiometricAuth`     | Concrete Implementor         |

---

## ✅ Benefits of Using Bridge

- You can add new **platforms** or **authentication types** independently.
- Cleaner, **scalable** code with **minimal duplication**.
- Reduces rigid inheritance trees.

---

## 🚀 Example Output
Authenticating using Email/Password...
Logged in on Web Platform using Email Authentication
Authenticating using OAuth (e.g., Google/Facebook)...
Logged in on Mobile Platform using OAuth Authentication
Authenticating using Biometrics (FaceID/Fingerprint)...
Logged in on Desktop Platform using Biometric Authentication
