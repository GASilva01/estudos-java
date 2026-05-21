package models.entities;

import models.exceptions.DomainException;

public class Account {
    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(Integer number, String name, Double balance, Double withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void deposit(double amount){
        this.balance += amount;

    }

    public void withdraw(double amount){
        if (amount > withdrawLimit){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        else if (amount > balance) {
           throw new DomainException("Withdraw error: Not enough balance");
        }
        else {this.balance -= amount;
        }
    }
}
