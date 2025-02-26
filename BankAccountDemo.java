class BankAccount {
    public String accountHolder;
    public double balance;
    protected String accountType;

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
    public class BankAccountDemo {
        public static void main (String[] args){
            
            BankAccount myAccount = new BankAccount();
        
            myAccount.deposit(250.0);
            myAccount.withdraw(100.0);
            System.out.println("Account Holder: "+ myAccount.accountHolder);
            System.out.println("Account Type: " + myAccount.accountType);
            System.out.println("Current Balance: $" + myAccount.getBalance());

        }
    }