public class Account{
    private String accountNumber;
    private String ownerName;
    private double balance;

    private static int totalAccounts = 0;

    public Account(String accountNumber, String ownerName, double balance){
        this.setAccountNumber(accountNumber);
        this.setOwnerName(ownerName);
        this.setBalance(balance);
        totalAccounts++;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }

    public void setBalance(double balance){
        this.balance = balance;
        if(balance < 0){
            this.balance = 0;
        }
    }
    public double getBalance(){
        return this.balance;
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            this.balance -= amount;
        }else{
            System.out.println("Not Enough Money!!! ");
        }
    }

    public void displayAccountInfo(){
        System.out.printf("%s %5s %8.2f\n", this.accountNumber, this.ownerName, this.balance);
    }

}
