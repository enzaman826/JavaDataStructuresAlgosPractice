package ch1.generic;

public class CreditCard {


    String customer;
    String bank;
    String account;
    double limit;
    double balance;

    public CreditCard(String customer, String bank, String account,  double limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
    }
    public CreditCard(String customer, String bank, String account, double limit,  double initialBalance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    public boolean charge(double price){
        if (price + balance > limit){
            return false;
        }

        balance += price;
        return true;
    }

    public void makePayment(double amount){
        //Exercise R-1.12, add if condition to check for negatives
        if (amount >= 0)
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Exercise R-1.11
    public void setLimit(double newLimit){
        this.limit = newLimit;
    }

    public void printSummary(){
        System.out.println("\n\nCustomer = " + customer);
        System.out.println("bank = " + bank);
        System.out.println("Account = " + account);
        System.out.println("Balance = " + balance);
        System.out.println("Limit = " + limit + "\n\n");
    }

}
