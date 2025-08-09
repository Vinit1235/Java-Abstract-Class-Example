# Java Abstract Class Example - Employee Management

![Java](https://img.shields.io/badge/Java-Abstract%20Class-blue)
![License](https://img.shields.io/badge/License-MIT-green)

## 📌 Overview
This project demonstrates the use of **abstract classes** in Java through a simple **Employee Management System**.  
It covers the concepts of **abstraction, method overriding, and concrete methods**, showing how abstract classes can be extended to create reusable and maintainable code.

---

## ✨ Features
- **Abstract Class Implementation**  
  - `Company` class contains abstract methods `name()` and `salary()`  
  - Concrete method `sal()` for a fixed salary message

- **User-Friendly Structure**  
  - The `Empldet` class implements abstract methods with placeholder values  
  - Can easily be modified to accept user input

- **Clear Output Format**  
  - Displays employee details in a readable manner

---

## 📂 Project Structure
```
Java-Abstract-Class-Example/
│── src/
│   ├── Company.java     # Abstract class
│   ├── Empldet.java     # Subclass implementing abstract methods
│   ├── Abstcode.java    # Main method
│
├── README.md            # Documentation
└── .gitignore           # Ignored files for Git
```

---

## 🚀 How to Run
### **1. Clone the Repository**
```bash
git clone https://github.com/YOUR_USERNAME/Java-Abstract-Class-Example.git
cd Java-Abstract-Class-Example/src
```

### **2. Compile the Code**
```bash
javac Abstcode.java
```

### **3. Run the Program**
```bash
java Abstcode
```

---

## 💻 Example Execution
### **Output**
```
Employee Name: [Enter Name Here]
150000
Fixed Salary
```

---

## 📚 Concepts Learned
- Abstract classes and methods in Java
- Method overriding
- Mixing abstract and concrete methods
- Java program structure with multiple classes

---

## 🔮 Future Improvements
- Take employee name and salary as **user input**
- Store multiple employees in a list
- Add department information
- Implement salary bonuses

---

## 📜 License
This project is licensed under the **MIT License** - you are free to use and modify it.

---

## 🏆 Author
Created as a Java learning exercise to strengthen understanding of **Object-Oriented Programming (OOP)** concepts.
