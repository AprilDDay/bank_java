import java.util.Scanner;

public class Account {
    //Class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class constructor
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

    //depositing money
    void deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //withdraw money
    void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Depositied: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred.")
        }
    }

    //calculate interest
    //  SEE IF YOU CAN DO A VARIABLE BALANCE RATE
    //  void calculateInterest(int years, interestRate){
    void calculateInterest(int years){
        double interestRate = 0.0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.print("The current intest rate is: " + (100 * interestRate));
        System.out.print("After " + years + "years, your balance will be " + newBalance);
    }

    //main menu
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");
    }

    do {
        System.out.println();
        System.out.println("Enter an option.");
        char option = scanner.next().charAt(0);
        char option1 = Character.toUpperCase(option);
        System.out.println();

        switch(option1){
            //A = check balance
            case 'A':
                System.out.println("*******************************");
                System.out.println("Balance: $" + balance);
                System.out.println("*******************************");
                System.out.println();
                break;   
            //B = make a deposit
            case 'B':
                System.out.println("Enter an amount to deposit: ");
                int amount1 = scanner.nextInt();
                deposit(amount1);
                System.out.println();
                break;
            //C = make a withdraw
            case 'C':
                System.out.println("Enter an amount to withdraw: ");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println();
                break;
            // D = view previous transaction
            case 'D':
                System.out.println("*******************************");
                getPreviousTransaction();
                System.out.println("*******************************");
                System.out.println();
                break;
            // E = calc int
            case 'E':
                System.out.println("Enter how many years of accrued interest");
                int years = scanner.nextInt();
                calculateInterest(years);
                break;
            // F = Exit 
            case 'F':
                System.out.println("*******************************");
                break;
            //catchall for invalid option chosen by user
            default: 
                System.out.println("Oh! You selected an invalid option. Please section A, B, C, D, E, or F. Thank you.");
                break;
        }

    } while (option != 'F'); 

    System.out.println("Thank you! See you again soon!");

}
