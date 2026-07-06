package ATM_Banking_System;
import java.util.*;
public class BankSystem{
    public static void displayMenu(){
        System.out.println("=======ATM=======");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");                    
    }

    public static void checkBalance(int balance){
        System.out.println("Current Balance: "+balance);
    }

    public static int depositMoney(int amount, int balance){
        if(amount<=0){
            System.out.println("Deposit amount should be greater than 0");
        }else{
            balance = balance + amount;
            System.out.println("Amount deposited successfully");
        }
        return balance;
    }

    public static int withdrawMoney(int amount, int balance){
        if(amount > balance){
            System.out.println("Withdrawal amount should be less than or equal to balance");
        }else if(amount <= 0){
            System.out.println("Withdrawal amount should be greater than 0");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
        return balance;
    }

    public static void exitATM(){
        System.out.println("Thank you for using our ATM");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        while(true){
            displayMenu();
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    checkBalance(balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int damount = sc.nextInt();
                    balance = depositMoney(damount, balance);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    int wamount = sc.nextInt();
                    balance = withdrawMoney(wamount, balance);
                    break;
                case 4:
                    exitATM();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            if(choice >= 4){
                break;
            }
        }
        sc.close();
    }
}