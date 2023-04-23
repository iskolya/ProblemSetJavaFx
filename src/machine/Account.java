package machine;
public class Account{
    private int accountNumber;
    private double balance = 0.0;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
    public void credit(double amount) {
        this.balance += amount;
    }
    public void debit(double amount) {
        if (amount> balance){
            System.out.println( "amount withdrawn exceeds the current balance!");
        }else{
            this.balance -= amount;
        }

    }
    public void print() {
        System.out.println("A/C no: " + accountNumber + " Balance="+ balance);
    }

    @Override
    public String toString() {
        return "A/C no: " + accountNumber + " Balance="+ balance;
    }
}
