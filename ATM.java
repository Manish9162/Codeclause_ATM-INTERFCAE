import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; // Initial account balance

    public static void main(String[] args) {
        // ATM interface
        System.out.println("Welcome to the ATM!");
        System.out.println("-------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("-------------------");

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
            System.out.println();
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }
}
