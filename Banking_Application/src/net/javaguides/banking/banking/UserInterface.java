package net.javaguides.banking.banking;

import java.util.*;

public class UserInterface {

    private static BankManager manager = new BankManager();

    public static void main(String[] args) {
        startBanking();
    }

    public static void startBanking() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Swizz Bank International");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Display All Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    createAccountUi(scanner);
                    break;
                case 2:
                    depositUi(scanner);
                    break;
                case 3:
                    withdrawUi(scanner);
                    break;
                case 4:
                    transferUi(scanner);
                    break;
                case 5:
                    manager.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("✅ Thank you for banking with us!");
                    return;
                default:
                    System.out.println("❌ Invalid choice! Please choose again.");
            }
        }
    }

    private static void createAccountUi(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter Your Password: ");
        String inputPassword = scanner.nextLine();

        manager.createAccount(accountNumber, accountHolder, inputPassword);
    }

    private static void depositUi(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Your Password: ");
        String inputPassword = scanner.nextLine();
        System.out.print("Enter Amount to Deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        manager.depsoitToAccount(accountNumber, amount, inputPassword);
    }

    private static void withdrawUi(Scanner scanner) {
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Your Password: ");
        String inputPassword = scanner.nextLine();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        manager.withdrawFromAccount(accountNumber, amount, inputPassword);
    }

    private static void transferUi(Scanner scanner) {
        System.out.print("Enter Sender Account Number: ");
        String fromAccount = scanner.nextLine();
        System.out.print("Enter Receiver Account Number: ");
        String toAccount = scanner.nextLine();
        System.out.print("Enter Your Password: ");
        String inputPassword = scanner.nextLine();
        System.out.print("Enter Amount to Transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        manager.transferBetweenAccounts(fromAccount, toAccount, amount, inputPassword);
    }
}
