package com.unige.gamekins_plugin_test;

import java.time.LocalDate;

public class BankAccount {
    private Person owner;
    private double balance;
    private LocalDate creationDate;

    public BankAccount(Person owner, double balance){
        if(balance < 0)
            throw new IllegalArgumentException("balance can't be negative");
        this.owner = owner;
        this.balance = balance;
        this.creationDate = LocalDate.now();
    }

    public BankAccount(Person owner) {
        this.owner = owner;
        this.balance = 0;
        this.creationDate = LocalDate.now();
    }


    
    public BankAccount(){}

    
    public double deposit(double amount) {
        return this.balance += amount;
    }

    /**
     *
     * @param amount
     * @return
     * @throws Exception
     */
    public double withdraw(double amount) throws Exception {

        if(this.balance - amount < 0)
            throw new Exception("Invalid operation");
        this.balance -= amount;
        return this.balance; 
    }

    public void changeOwner(Person newOwner) throws Exception{
        if(newOwner == null)
            throw new Exception("The new owner can't be null");
        this.owner = newOwner;
    }

    public double getBalance() { return balance; }

    public Person getOwner() { return owner; }

    public LocalDate getCreationDate() { return creationDate; }
}
