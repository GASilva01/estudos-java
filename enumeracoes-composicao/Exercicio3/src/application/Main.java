package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dateFormatter);
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(orderStatus, client);

        System.out.print("How many items to this order? ");
        int itemsAmount = sc.nextInt();

        for (int i = 0; i < itemsAmount; i++) {
            System.out.printf("Enter #%d item data: %n", (i + 1));
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment().format(dateTimeFormatter));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client);
        System.out.println("Order items: ");

        for (int i= 0; i < order.getOrderItems().size();  i++) {
            System.out.println(order.getOrderItems().get(i));
        }

        System.out.printf("Total price: $%.2f", order.total());
    }
}

