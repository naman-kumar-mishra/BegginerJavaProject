package BankingSystem;

import java.util.Scanner;

public class BankingApplication
{
    public static void main(String[] args)
    {
        bankaccount obj = new bankaccount("Naman","BA0111" );
        obj.showMenu();
    }
}

class bankaccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    bankaccount(String cname, String cid)
    {
        cname = customerName;
        cid   = customerId;
    }

    void deposit (int amount)
    {
        if (amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw ( int amount)
    {
        if ( amount != 0)
        {
            balance = balance - amount  ;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println(" Deposited :" + previousTransaction);
        }
        else  if(previousTransaction < 0)
        {
            System.out.println("Withdrawn :" + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println(" NO Transaction ocurred!!");
        }
    }
    void showMenu()
    {
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome :"+customerName);
        System.out.println("Your ID :"+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("=========================================================================================");
            System.out.println("Enter an option");
            System.out.println("=========================================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option)
            {
                case 'A':
                    System.out.println("-----------------------------------");
                    System.out.println("Balnce:"+balance);
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to deposit:");
                    System.out.println("-----------------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to withdraw:");
                    System.out.println("-----------------------------------");
                    amount = sc.nextInt();
                    withdraw(amount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("***********************************");
                    break;

                default:
                    System.out.println("Invalid option!! Please enter again");
                    break;

            }

        }
        while ( option != 'E');
        System.out.println("Thank for using our service");

    }
}
