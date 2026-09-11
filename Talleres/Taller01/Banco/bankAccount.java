package Banco;

public class bankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public bankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}