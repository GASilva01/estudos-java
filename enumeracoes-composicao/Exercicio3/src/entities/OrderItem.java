package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = product.getPrice();

    }

    public Integer getQuantity() {
        return quantity;
    }


    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());

    }
}
