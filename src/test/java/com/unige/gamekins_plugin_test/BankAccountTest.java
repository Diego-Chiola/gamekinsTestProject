package com.unige.gamekins_plugin_test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void BankAccountConstructorWithBalanceNegative(){
        Person person = new Person("Pippo", "Baudo", 18);
        double balance = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(person, balance);
        });
    }
}
