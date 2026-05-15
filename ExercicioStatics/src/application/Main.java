package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollar_amount = sc.nextDouble();
        double final_amount = CurrencyConverter.toBePaid(dollar, dollar_amount);

        System.out.printf("Amount to be paid in reais = $ %.2f%n ", final_amount);
    }
}
