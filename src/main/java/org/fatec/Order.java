package org.fatec;

import javax.swing.JOptionPane;

public class Order {
    float total_value;


    public Order(float total_value) {
        this.total_value = total_value;
    }

    void addProduct(OrderItem orderItem) {
        total_value += orderItem.amount * orderItem.product.salePrice;
    }

    float calculateTotalValue() {
        return this.total_value;
    }

    public static void main(String[] args) {
        Product product = new Product(10, "Product 1", 10.0f, 20.0f, 0);
        Product product2 = new Product(10, "Product 2", 10.0f, 20.0f, 0);
        OrderItem orderItem = new OrderItem(product, 10);
        OrderItem orderItem2 = new OrderItem(product, 10);
        Order order = new Order(0);

        order.addProduct(orderItem);
        order.addProduct(orderItem2);
        System.out.println("Total value: " + order.calculateTotalValue());
        JOptionPane.showMessageDialog(null, "Total value: " + order.total_value);

    }


}
