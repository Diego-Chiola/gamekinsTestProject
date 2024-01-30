package com.unige.gamekins_plugin_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void changeOwnerTest() throws Exception{
        Person person1 = new Person("Pippo", "Baudo", 18);
        Person person2 = new Person("Pluto", "Baudo", 18);
        BankAccount account = new BankAccount(person1);
        Person expected = new Person("Pluto", "Baudo", 18);
        account.changeOwner(person2);
        assertEquals(expected.getFirstname(), account.getOwner().getFirstname());
    }
}
