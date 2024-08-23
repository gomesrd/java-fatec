package org.fatec;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product product = new Product(10, "Product 1", 10.0f, 20.0f, 100);

        System.out.println("Product code: " + product);
    }
}