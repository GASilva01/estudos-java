package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        while (true){
            System.out.print("Is there an initial deposit (y/n) ? ");
            char op = sc.nextLine().charAt(0);
            if (op == 'n'){
                account = new Account(number, holder);
                break;
            }
            else if (op == 'y'){
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit);
                break;
            }
            else{
                System.out.println("Invalid option.");
            }
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);
        sc.close();
    }
}
