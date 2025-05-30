 
# 🧱 Exercise 1: Resume Builder using Builder Pattern

## 📌 Pattern Type
Creational Design Pattern

## 📚 Scenario
This exercise demonstrates the use of the **Builder Design Pattern** to create a customizable `Resume` (CV) object.

In real-world scenarios, resumes often include many **optional fields** such as:
- Phone number
- Education
- Work experience
- Skills
- LinkedIn, Summary, Certifications (future extensions)

Traditional constructors would require all fields to be passed, even when some are not needed. This makes the code hard to read and maintain.

---

## 🎯 Problem
We needed a way to:
- Avoid telescoping constructors
- Flexibly create objects with **some or all** fields
- Improve code readability and maintainability

---

## ✅ Solution
We implemented the Builder Pattern to:
- Use a **nested static Builder class**
- Add **fluent method chaining** like `.setEmail()` and `.addSkill()`
- Enforce **immutability** for the `Resume` object
- Generate a fully assembled `Resume` using `.build()`

---

## 🔧 Technologies Used
- Java
- Object-Oriented Programming
- NetBeans (initial development)
- GitHub (version control)

---

## 💻 Sample Usage

```java
Resume resume = new Resume.Builder()
    .setFullName("Ahmed Hossam")
    .setEmail("ahmed@example.com")
    .setPhone("01012345678")
    .setEducation(new Education("B.Sc. in CS", "Cairo University", 2019, 2023))
    .setWorkExperience(new WorkExpercience("Software Engineer", "Google", 2020, 2023))
    .addSkill("Java")
    .addSkill("Spring Boot")
    .addSkill("Git")
    .build();

System.out.println(resume);
