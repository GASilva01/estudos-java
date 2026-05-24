package application;

import application.services.PrintService;
import application.services.PrintServiceObject;
import application.services.PrintServiceString;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

       application.services.PrintServiceObject ps = new PrintServiceObject();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        ps.addValue("Maria");

        for (int i = 0; i < n ; i++) {
           Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = (Integer)ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
