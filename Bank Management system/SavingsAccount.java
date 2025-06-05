import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String customerName, String customerId, double interestRate) {
        super(customerName, customerId);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        int interest = (int)(balance * interestRate / 100);
        deposit(interest, "Interest Applied");
    }

    @Override
    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Savings Account, " + customerName + "!");
        System.out.println("Your ID: " + customerId);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();

        do {
            System.out.println("===========================");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("F. Apply Interest");
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
                case 'F':
                    applyInterest();
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
