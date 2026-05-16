package application;

import entities.Room;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.println();
            rooms[roomNumber] = new Room(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }

        }
        sc.close();
    }

}
