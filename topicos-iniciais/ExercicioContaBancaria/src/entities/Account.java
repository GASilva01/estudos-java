package entities;

public class Account {
    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;

    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double quantity){
        this.balance += quantity;
    }

    public void withdraw(double quantity){
        double tax = 5.0;
        double final_quantity = this.balance - quantity;
        this.balance = final_quantity - tax;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
}


