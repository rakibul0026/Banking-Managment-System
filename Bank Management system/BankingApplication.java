public class BankingApplication {
    public static void main(String[] args) {
        // Polymorphism: BankAccount reference can point to SavingsAccount
        Account bankAccount = new BankAccount("Fouat", "1026");
        bankAccount.showMenu();

        // Uncomment below to test SavingsAccount with interest
        /*
        Account savings = new SavingsAccount("Fouat", "1026", 5.0);
        savings.showMenu();
        */
    }
}
