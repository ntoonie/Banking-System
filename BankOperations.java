package PRACTICEJAVA.bankprac;
import java.util.Scanner;

//parent class
abstract class BankOperations {
    Scanner sc = new Scanner(System.in);

    //operations like deposit, withdraw, checkbalance

    public Accounts deposit(Accounts accounts){
        double amount = 0;

        while(true){
            System.out.println("==============================");
            System.out.println("Enter the amount to deposit: ");
            amount = sc.nextDouble();
            if(amount > 0){
                accounts.setBalance(accounts.getBalance() + amount);
                System.out.println("Withdraw Successful!");
                System.out.println("New Balance is: " + accounts.getBalance());
                break;
            } else {
                System.out.println("Invalid!");
            }
        } 
        return accounts;
    }

    public Accounts withdraw(Accounts accounts){
        double amount = 0;

        while(true){
            System.out.println("==============================");
            System.out.println("Enter the amount to withdraw: ");
            amount = sc.nextDouble();
            if(amount <= 0){
               System.out.println("Invalid amount!");
            } else if (amount > accounts.getBalance()){
                System.out.println("Not Enough Balance!");
            } else {
                accounts.setBalance(accounts.getBalance() - amount);
                System.out.println("Withdraw Successful!");
                System.out.println("New Balance is: " + accounts.getBalance());
                break;
            }
        } 
        return accounts;
    }

    public Accounts checkbalance(Accounts accounts){
        System.out.println("==============================");
        System.out.println("Your Current Balance: " + accounts.getBalance());
        return accounts;
    }

}
