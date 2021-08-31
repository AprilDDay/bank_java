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

    void getPreviousAmount(){
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
    // SEE IF YOU CAN PUT THIS IN ANOTHER CLASS
    // SEE IF YOU CAN ADD A PICK LANGUAGE OPTION BEFORE THIS...
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
        

    }

}
