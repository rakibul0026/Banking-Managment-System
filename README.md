# 💳 Banking Application (Java Console-Based)

This is a simple console-based Java application that simulates basic banking operations such as checking balance, depositing, withdrawing, and viewing the previous transaction. This project is ideal for beginners looking to understand core Java and Object-Oriented Programming (OOP) principles.

---
# BankingApplication
   │
   ├── Account.java
   ├── BankAccount.java
   ├── SavingsAccount.java
   └── BankingApplication.java

## 🔧 Features

- Check current account balance
- Deposit funds
- Withdraw funds (with validation)
- View previous transaction
- Simple text-based menu interface

---

## 📌 OOP Concepts Used

| Concept           | Implementation Details |
|------------------|-------------------------|
| **Class**        | `BankAccount` class encapsulates the bank account's data and operations |
| **Object**       | An object `bank1` is created from `BankAccount` in `main()` |
| **Encapsulation**| All data members are kept within the class, accessible only through methods |
| **Abstraction**  | Internal logic (e.g., balance update, transaction tracking) is hidden from the user interface |
| **Constructor**  | Used to initialize customer name, ID, and starting balance |
| **Method Overloading/Inheritance** | Not used directly here but can be extended for future versions (e.g., SavingsAccount/CurrentAccount subclasses) |

---

## 🧠 How It Works

1. Program starts and creates a `BankAccount` object with a customer name and ID.
2. Displays a text-based menu:
    - `A`: Check Balance
    - `B`: Deposit Money
    - `C`: Withdraw Money
    - `D`: View Last Transaction
    - `E`: Exit Application
3. Based on user input, appropriate method is called.
4. Transactions are stored using the `previousTransaction` variable.

---

## 🖥️ Sample Output

