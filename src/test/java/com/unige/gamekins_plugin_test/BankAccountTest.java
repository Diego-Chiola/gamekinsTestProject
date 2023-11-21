package com.unige.gamekins_plugin_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void BankAccountConstructorWithBalanceNegative(){
        Person person = new Person("Pippo", "Baudo", 18);
        double expected = -100;
        BankAccount b = new BankAccount(person, -100);
        assertEquals(expected, b.getBalance());
    }
}
