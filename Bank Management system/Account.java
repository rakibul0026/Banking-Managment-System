import java.util.Scanner;

public abstract class Account {
    protected int balance;
    protected int previousTransaction;
    protected String customerName;
    protected String customerId;

    public Account(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.balance = 0;
        this.previousTransaction = 0;
    }

    // Encapsulation with getter
    public int getBalance() {
        return balance;
    }

    // Abstract methods for subclasses
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction has occurred.");
        }
    }

    // Method overloading example
    public void deposit(int amount, String note) {
        deposit(amount);
        System.out.println(note);
    }

    public abstract void showMenu();
}
