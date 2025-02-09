package org.example;

import java.util.UUID;

class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;
    private String pin;

    // 1. Конструктор без параметров
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.owner = "Unknown";
        this.balance = 0.0;
        this.pin = "0000"; // дефолтный PIN
    }

    // 2. Конструктор с одним параметром
    public BankAccount(String owner) {
        this.accountNumber = generateAccountNumber();
        this.owner = owner;
        this.balance = 0.0;
        this.pin = "0000";
    }

    // 3. Конструктор с несколькими параметрами
    public BankAccount(String owner, double initialBalance, String pin) {
        this.accountNumber = generateAccountNumber();
        this.owner = owner;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Метод для генерации случайного номера счета
    private String generateAccountNumber() {
        return UUID.randomUUID().toString().substring(0, 10);
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Метод для снятия денег
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Метод для смены PIN-кода
    public void changePin(String newPin) {
        if (newPin.length() == 4) {
            this.pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("PIN must be 4 digits.");
        }
    }

    // Метод для просмотра баланса
    public double getBalance() {
        return balance;
    }

    // Метод для получения информации о счете
    public void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}