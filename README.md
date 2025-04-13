# 🏦 Swizz Bank International - Console-Based Banking Application

Welcome to **Swizz Bank International**, a simple yet functional console-based banking system developed in **Java**. This application allows users to perform common banking operations such as creating accounts, deposits, withdrawals, and fund transfers — all secured with password hashing using **SHA-256**.

---

## ✨ Features

- 🔐 Password-protected accounts (SHA-256 hashed)
- 🧾 Create new bank accounts
- 💰 Deposit and withdraw money
- 🔁 Transfer funds between accounts
- 📋 View all account details
- 🔄 Continuous operation loop until user exits

---

## 📁 Project Structure

```
net.javaguides.banking.banking
💼 BankAccount.java       # Represents a bank account
💼 BankManager.java       # Manages operations on multiple accounts
💼 UserInterface.java     # Console-based UI to interact with the user
```

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher installed
- A Java IDE (e.g., IntelliJ, Eclipse) or terminal

### Steps
1. Clone the repository or download the source code.
2. Navigate to the project directory.
3. Compile the code:
   ```bash
   javac net/javaguides/banking/banking/*.java
   ```
4. Run the application:
   ```bash
   java net.javaguides.banking.banking.UserInterface
   ```

---

## 🖥️ User Menu

```
Welcome to Swizz Bank International
1. Create New Account
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Display All Account Details
6. Exit
```

---

## 🔐 Security

- Passwords are stored securely using **SHA-256** hashing.
- Every sensitive operation (deposit, withdrawal, transfer) requires password verification.

---

## 💠 Technologies Used

- Java
- Java Collections (ArrayList)
- Java Security (MessageDigest)

---

## 🌱 Future Enhancements

- 🧾 Transaction history log
- 📁 File-based or database persistence
- 🧑‍💼 Admin functionalities
- 📈 Interest calculation on savings
- 🌐 Web interface (Spring Boot or JavaFX GUI)

---

## 🤝 Contribution

Pull requests are welcome! If you find a bug or have a feature request, feel free to open an issue.

---

## 📄 License

This project is for educational purposes and is **open for modifications**.

---

## 🙌 Acknowledgments

Developed as a part of Java learning. Inspired by real-world banking systems, made simple for students and beginners.