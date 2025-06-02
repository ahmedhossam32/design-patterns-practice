
# 🏗️ Abstract Factory Pattern - Insurance Claim Processing (Java)

This project demonstrates the **Abstract Factory Design Pattern** using a real-world scenario: **Insurance Claim Processing** for different insurance types like Health and Vehicle.

The Abstract Factory pattern allows the system to create **families of related objects** (like `Submission` and `Approval`) **without specifying their concrete classes** — promoting flexibility, scalability, and clean separation between logic and instantiation.

---

## 📌 Scenario

The company processes different types of insurance claims:
- **Health Insurance**
- **Vehicle Insurance**

Each type has its own logic for:
- Submitting a claim
- Approving a claim

This pattern enables switching between insurance types without changing the claim processing logic.

---

## 🚀 How to Run

1. Open the project in NetBeans or your preferred Java IDE.
2. Navigate to `AbstractFactory.java` — this contains the `main()` method.
3. Run the file to see how both **Health** and **Vehicle** claims are processed using abstract factories.

---

## 🧱 Structure

| Component                  | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| `Submission`               | Abstract interface for submitting insurance claims.                         |
| `Approval`                 | Abstract interface for approving insurance claims.                          |
| `HealthSubmission`         | Concrete submission implementation for health insurance.                    |
| `VehicleSubmission`        | Concrete submission implementation for vehicle insurance.                   |
| `HealthApproval`           | Concrete approval implementation for health insurance.                      |
| `VehicleApproval`          | Concrete approval implementation for vehicle insurance.                     |
| `InsuranceClaimFactory`    | Abstract factory interface declaring creation methods for Submission & Approval. |
| `HealthInsuranceFactory`   | Concrete factory that produces health-specific submission and approval.     |
| `VehicleInsuranceFactory`  | Concrete factory that produces vehicle-specific submission and approval.    |
| `ClaimProcessor`           | Client class that processes claims using the abstract factory.              |
| `AbstractFactory`          | Main runner class containing `main()` to demonstrate factory switching.     |

---

## ✅ Design Pattern Highlights

- **Pattern**: Abstract Factory
- **Intent**: Create families of related objects without depending on their concrete classes.
- **Benefits**:
  - Promotes loose coupling between client code and actual implementations.
  - Makes adding new product families easy.
  - Supports consistency among related objects.

---

## 📁 Directory Structure

creational/
└── abstractfactory/
├── AbstractFactory.java
├── ClaimProcessor.java
├── InsuranceClaimFactory.java
├── Submission.java
├── Approval.java
├── HealthSubmission.java
├── HealthApproval.java
├── VehicleSubmission.java
├── VehicleApproval.java
├── HealthInsuranceFactory.java
└── VehicleInsuranceFactory.java



---

## 🧠 Example Output

---- Health Insurance ----
Submitting a health insurance claim.
Approving a health insurance claim.

---- Vehicle Insurance ----
Submitting a vehicle insurance claim.
Approving a vehicle insurance claim.



## 📚 References

- Gang of Four (GoF) – *Design Patterns: Elements of Reusable Object-Oriented Software*
- Java SE 8+

---
