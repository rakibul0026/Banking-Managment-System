
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Fouat", "1026");
        bank1.showMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cName, String cId) {
        customerName = cName;
        customerId = cId;
        balance = 0;
    }

    void deposit(int amount) {
        
            balance = balance + amount;
            previousTransaction = amount;
        
    }

    void withdraw(int amount) {
        if (amount != 0 && amount <= balance) {
            balance = balance - amount;
            previousTransaction = -amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction <0)  {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction has occurred.");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your id is: " + customerId);
        System.out.println();

        do {
            System.out.println("=======================");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            System.out.println("=======================");
            System.out.println("Enter the option");
            System.out.println("=======================");
            option = sc.next().charAt(0);
            option = Character.toUpperCase(option);

            switch (option) {
                case 'A':
                    System.out.println("=======================");
                    System.out.println("Balance is: " + balance);
                    System.out.println("=======================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("=======================");
                    System.out.println("Enter the amount to deposit: ");
                    System.out.println("=======================");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("=======================");
                    System.out.println("Enter the amount to withdraw: ");
                    System.out.println("=======================");
                    int withdrawAmount = sc.nextInt();
                    withdraw(withdrawAmount);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("=======================");
                    getPreviousTransaction();
                    System.out.println("=======================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
        } while (option != 'E');
    }
}
