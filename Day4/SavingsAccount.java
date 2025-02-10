package org.example;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Конструктор с процентной ставкой
    public SavingsAccount(String owner, double initialBalance, String pin, double interestRate) {
        super(owner, initialBalance, pin);
        this.interestRate = interestRate;
    }

    // Метод для начисления процентов
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}