package PRACTICEJAVA.bankprac;

public class Accounts{
    public Accounts[] accounts;
        //individual accounts
        private String name;
        private String pin;
        private double balance;
    
        public Accounts(String name, String pin, double balance){
            this.name = name;
            this.pin = pin;
            this.balance = balance;
        }
    
        public String getName(){
            return name;
        }
    
        public String getPin(){
            return pin;
        }
    
        public double getBalance(){
            return balance;
        }

        public void setBalance(double balance){
            this.balance = balance;
        }

}
