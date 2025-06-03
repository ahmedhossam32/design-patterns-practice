# 🏗️ Builder Pattern – Resume Builder

## 📌 Overview  
This project demonstrates the **Builder Pattern** by assembling a customizable `Resume` object.  
It uses a fluent builder interface to handle optional fields without relying on telescoping constructors.

---

## 🧱 Structure

| Component | Description |
|-----------|-------------|
| `Resume` | Immutable object representing a resume (CV) |
| `Builder` | Nested static builder class supporting method chaining |
| `Education`, `WorkExperience` | Supporting classes for optional resume fields |
| `Main` | Demonstrates building a resume with selected fields |

---

## ✅ Features

- Avoids constructor overloading and telescoping
- Supports **optional fields** cleanly with method chaining
- Creates **immutable** Resume objects
- Great for objects with many optional fields (real-world use case)

---


##🧪 Example Output
Full Name: Ahmed Hossam
Email: ahmed@example.com
Phone: 01012345678
Education: B.Sc. in CS, Cairo University (2019–2023)
Experience: Software Engineer at Google (2020–2023)
Skills: [Java, Spring Boot, Git]
----
## 💻 Sample Code

```java
Resume resume = new Resume.Builder()
    .setFullName("Ahmed Hossam")
    .setEmail("ahmed@example.com")
    .setPhone("01012345678")
    .setEducation(new Education("B.Sc. in CS", "Cairo University", 2019, 2023))
    .setWorkExperience(new WorkExperience("Software Engineer", "Google", 2020, 2023))
    .addSkill("Java")
    .addSkill("Spring Boot")
    .addSkill("Git")
    .build();

System.out.println(resume);

