package application;

import entities.Account;
import entities.SavingsAccount;

public class Main {
    static void main(String[] args) {

        Account account1 = new Account(1020, "Maria", 1000.0);
        Account account2 = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        account1.withdraw(50.0);
        account2.withdraw(50.0);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());


    }
}
