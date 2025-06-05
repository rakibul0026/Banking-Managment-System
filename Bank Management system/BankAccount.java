import java.util.Scanner;

public class BankAccount extends Account {

    public BankAccount(String customerName, String customerId) {
        super(customerName, customerId);  // constructor chaining
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            previousTransaction = -amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID: " + customerId);
        System.out.println();

        do {
            System.out.println("===========================");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            System.out.println("===========================");
            System.out.print("Enter an option: ");
            option = scanner.next().toUpperCase().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Balance: " + getBalance());
                    break;
                case 'B':
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    break;
                case 'C':
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 'D':
                    getPreviousTransaction();
                    break;
                case 'E':
                    System.out.println("Thank you for banking with us. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
            System.out.println();

        } while (option != 'E');

        scanner.close();
    }
}
