import java.util.Scanner;

public class simpleBankingApplication {
    // Initialize balance to 0
    private static double balance = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Main loop to display menu and perform operations
        while (running) {
            System.out.println("\nWelcome to My Bank");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            
            int choice = scanner.nextInt(); // Get user's choice

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using My Bank. Have a nice day!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.println("\nYour current balance is: $" + balance);
    }

    // Method to deposit amount into account
    public static void deposit(Scanner scanner) {
        System.out.print("\nEnter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to withdraw amount from account
    public static void withdraw(Scanner scanner) {
        System.out.print("\nEnter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}
