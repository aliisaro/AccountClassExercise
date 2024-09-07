package com.example.accountclassexercise;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return amount;
        } else {
            return 0.0;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}