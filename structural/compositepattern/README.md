# 👥 Composite Pattern – Company Hierarchy Example

## 📚 Design Pattern: Composite (Structural)

This project demonstrates the **Composite Design Pattern** by modeling a realistic **company structure**, where `Manager` objects can contain other employees (like `Developers`, `Interns`, or even other `Managers`), and **all employee types are treated uniformly**.

---

## 🧩 Problem

In a company management system, we need to represent the structure of an organization:
- A **Manager** supervises employees (which could be developers, interns, or other managers).
- A **Developer** or **Intern** doesn’t manage anyone.
- We want to **treat all employees uniformly**, whether they are a single person or a group manager.
- The client code (e.g., `Main.java`) should **only interact with the base `Employee` type**.

---

## ✅ Solution

We use the **Composite Pattern** to solve this.

### 🏗️ Structure

- `Employee` (abstract class) – the **Component**
  - Contains common fields (`name`, `position`, `salary`) and the `displayDetails()` method.
- `Manager` – the **Composite**
  - Maintains a list of `Employee` objects (can be other managers, developers, or interns).
  - Implements `addEmployee()`, `removeEmployee()`, and recursive `displayDetails()`.
- `Developer`, `Intern` – the **Leaf nodes**
  - Implement the `displayDetails()` method only.
  - `Developer` includes a `developing` field.
  - `Intern` includes a `duration` field.

---

## 🧠 Core Concepts Applied

- **Composite Pattern**: Allows treating **individual objects and composites of objects uniformly**.
- **Recursion**: Used in `Manager.displayDetails()` to print subordinates hierarchically.
- **Abstraction**: Client (`Main`) only uses the `Employee` type to interact with the system.
- **Clean Object-Oriented Design**: Each class has a clear responsibility.

---

## 🏁 Output

When running `Main`, the output will show the full structure starting from the CEO:

Employees managed by Mr. Alice are:
Employees managed by Mr. Bob are:
Developer Name: Charlie
Position: Developer
Salary: 120000.0
Developer Details: Backend - Java
Developer Name: David
Position: Developer
Salary: 110000.0
Developer Details: Frontend - React
Intern Details:
Name: Eve
Position: Intern
Salary: 50000.0
Intern Duration: 6
Employees managed by Mr. Frank are:
Intern Details:
Name: Grace
Position: Intern
Salary: 40000.0
Intern Duration: 3


---

## 💡 Why Composite Pattern?

✅ Without the Composite Pattern:
- The client would have to check if an object is a Manager or a Developer/Intern.
- There would be branching logic (`if instanceof`) scattered across code.

✅ With Composite Pattern:
- The structure is clean and extendable.
- You can add new employee types without changing the client code.
- **Everything is treated as an `Employee`**, reducing complexity and improving scalability.

---

## 🗂️ Project Structure

composite/
├── Developer.java
├── Employee.java
├── Intern.java
├── Manager.java
└── Main.java


---

## 🧪 How to Run

1. Compile the Java files.
2. Run `Main.java`.
3. Observe the recursive, tree-like output of the employee hierarchy.

---

## ✍️ Author

Pattern implemented and structured by **Ahmed Hossam** as part of the design patterns practice project.
