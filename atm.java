import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Current Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Money Deposited Successfully");
                System.out.println("Updated Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw > balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance);
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}