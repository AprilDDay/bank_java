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
            System.out.print("Depositied: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.print("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.print("No transaction occurred.")
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

}
