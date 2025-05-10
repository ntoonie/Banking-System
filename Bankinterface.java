package PRACTICEJAVA.bankprac;
import java.util.Scanner;

//child class
public class Bankinterface extends BankOperations{
     Scanner sc = new Scanner(System.in);
     String loginname;
     String loginpin;
        
    private Accounts[] accounts;
    
        public Bankinterface(){
           accounts = new Accounts[]{
                new Accounts("Hope", "1234", 3000.00),
                new Accounts("Mark", "1232", 1220.3)
            };
        }
        
    public void menu(){
            while (true) {
            System.out.println("==============================");
            System.out.println("WELCOME TO BANKING SYSTEM 101");
            System.out.println("1. LOGIN");
            System.out.println("2. EXIT");
            System.out.println("CHOOSE A COMMAND: ");
            System.out.println("==============================");
            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                System.out.println("==============================");
                System.out.println("WELCOME TO THE LOGIN PROMPT");
                System.out.println("ENTER YOUR ACCOUNT NAME: ");
                sc.nextLine();
                loginname = sc.nextLine().trim();
                System.out.println("ENTER YOUR ACCOUNT PIN: ");
                loginpin = sc.nextLine().trim();
                Accounts accexists = searchAccount(loginname, loginpin);
                System.out.println("==============================");
                if(accexists != null){
                    System.out.println("Account Found!");
                    secondinterface(accexists);
                } else {
                    System.out.println("Account not Found!");
                    return;
                }
                break;
                case 2:
                System.exit(1);
            }
        } 
    }

    public Accounts searchAccount(String name, String pin){
        for(Accounts acc: accounts){
            if(acc.getName().equals(name)&& acc.getPin().equals(pin)){
                return acc;
            }
        }
        return null;
    }

    public void secondinterface (Accounts accounts){
        System.out.println("==============================");
        System.out.println("1. WITHDRAW");
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.println("==============================");
        int select = sc.nextInt();

        switch(select) {
            case 1:
            withdraw(accounts);
            break;
            case 2:
            deposit(accounts);
            break;
            case 3:
            checkbalance(accounts);
            break;
            case 4:
            System.exit(1);
        }
    }


}
