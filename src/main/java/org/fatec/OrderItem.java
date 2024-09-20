package org.fatec;

public class OrderItem {
    float amount;
    Product product;


    public OrderItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
}
