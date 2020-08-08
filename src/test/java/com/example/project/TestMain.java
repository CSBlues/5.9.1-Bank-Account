package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMain {

   @Test
   public void testBlankConstructor()
   {
     BankAccount acc = new BankAccount();
     assertEquals("",acc.getName(), "Blank constructor should initialize name to a empty string.");
     assertEquals(0,acc.getAccountNum(), "Blank constructor should initialize account to 0.");
     assertEquals(0.0,acc.getBalance(), "Blank constructor should initialize balance to 0.0.");
   }
    @Test
    public void testFullConstructor()
    {
        BankAccount acc = new BankAccount("Scott",12345,1000000.0);
        assertEquals("Scott",acc.getName(), "Expected full constructor to initialize name to 'Scott''");
        assertEquals(12345,acc.getAccountNum(), "Expected full constructor to initialize account to 12345.");
        assertEquals(1000000.0,acc.getBalance(), "Expected full constructor to initialize balance to 1000000.0.");
    }

    @Test
    public void testToString()
    {
        BankAccount acc = new BankAccount("Scott",1, 10.0);
        assertEquals("Scott, 1, 10.0",acc.toString(), "The toString() method should print the name, account number, and balance. Expected 'Scott, 1, 10.0'.");
    }

    @Test
    public void testSetters()
    {
        BankAccount acc = new BankAccount();
        acc.setName("Scott");
        assertEquals("Scott",acc.getName(), "Expected mutator method setName to change name to 'Scott''");
        acc.setAccountNum(1);
        assertEquals("Scott",acc.getAccountNum(), "Expected mutator method setAccountNum to change accountNum to 1");
        acc.setBalance(10.0);
        assertEquals("Scott",acc.getBalance(), "Expected mutator method setBalance to change balance to 10.0");
    }
    @Test
    public void testOverdraw()
    {
        BankAccount acc = new BankAccount();
        acc.withdraw(10.0);
        assertEquals(0.0, acc.getBalance(), "The withdraw method should not withdraw money if the withdrawal amount is greater than the balance.");
    }
    @Test
    public void testWithdraw()
    {
        BankAccount acc = new BankAccount("test",1,100.0);
        acc.withdraw(10.0);
        assertEquals(90.0, acc.getBalance(), "The withdraw method should subtract the withdrawal amount parameter from the balance. Expected 100.0 - 10.0 = 90.0.");
    }
    @Test
    public void testDeposit()
    {
        BankAccount acc = new BankAccount("test",1,100.0);
        acc.deposit(15.0);
        assertEquals(115.0, acc.getBalance(), "The balance method should add the deposit amount parameter to the balance. Expected 100.0 + 15.0 = 115.0.");
    }
}
