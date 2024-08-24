package org.fatec;

import java.util.Random;

public class BankAccount {
    private float accountBalance;
    String accountHolder;
    private int accountNumber;
    Random random = new Random();

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    BankAccount openAccount(BankAccount account) {
        account.accountNumber = random.nextInt(100000);
        account.accountBalance = 0.0f;

        return account;
    }

    float deposit(float value, BankAccount account) {
        account.accountBalance += value;

        return value;
    }

    String withdraw(float value, BankAccount account) {
        if (account.accountBalance >= value) {
            account.accountBalance -= value;
            return ("Withdraw: " + value);
        }

        return "Insufficient funds";
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe");

        BankAccount accountCreated = account.openAccount( account);
        System.out.println("Account: " + account.accountHolder + " " + accountCreated.accountBalance + " " + accountCreated.accountNumber);

        float deposit = accountCreated.deposit(500.0f, account);
        System.out.println("Deposit: " + deposit);

        System.out.println("Account Balance: " + accountCreated.accountBalance);

        String withdraw = accountCreated.withdraw(250, account);
        System.out.println(withdraw);

        System.out.println("Account Balance: " + accountCreated.accountBalance);
    }
}
