package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem orderItem){
    orderItems.add(orderItem);

    }
    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);

    }

    public Double total(){
         double sum = 0;
         for (OrderItem item : orderItems){
             sum+= item.subTotal();
         }
         return sum;
    }
}
