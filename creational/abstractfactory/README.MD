# 🏭 Abstract Factory Pattern – Insurance Claim Processing

## 📌 Overview  
This project demonstrates the **Abstract Factory Pattern** using an insurance claim processing system.  
The system handles families of related objects (submissions and approvals) for different insurance types  
without tightly coupling the code to their concrete classes.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `Submission`, `Approval` | Abstract product interfaces |
| `HealthSubmission`, `VehicleSubmission` | Concrete submission classes |
| `HealthApproval`, `VehicleApproval` | Concrete approval classes |
| `InsuranceClaimFactory` | Abstract factory interface |
| `HealthInsuranceFactory`, `VehicleInsuranceFactory` | Concrete factories |
| `ClaimProcessor` | Client that uses factories |
| `AbstractFactory` | Main class demonstrating the pattern |

---

## ✅ Features

- Supports creating **related objects** without specifying concrete classes
- Enables **switching product families** at runtime
- Promotes **loose coupling** and **scalability**

---

## 🧪 Example Output

---- Health Insurance ----
Submitting a health insurance claim.
Approving a health insurance claim.

---- Vehicle Insurance ----
Submitting a vehicle insurance claim.
Approving a vehicle insurance claim.
