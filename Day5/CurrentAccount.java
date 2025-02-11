package org.example;

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String owner, double initialBalance, String pin, double overdraftLimit) {
        super(owner, initialBalance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + newBalance);
        } else {
            System.out.println("Exceeded overdraft limit.");
        }
    }
}
