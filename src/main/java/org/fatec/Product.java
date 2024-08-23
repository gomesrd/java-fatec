package org.fatec;

public class Product {
    int code;
    String description;
    float costPrice;
    float salePrice;
    int stock;

    public Product(int code, String description, float costPrice, float salePrice, int stock) {
        this.code = code;
        this.description = description;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.stock = stock;
    }

    void buy(int code, int quantity, Product product) {
        if (product.code == code) {
            product.stock += quantity;
        }

    }

    void sale(int code, int quantity, Product product) {
        if (product.code == code) {
            product.stock -= quantity;
        }

    }

     public static void main(String[] args) {
        Product product = new Product(10, "Product 1", 10.0f, 20.0f, 0);

        System.out.println("Product" + product.description + " stock: " + product.stock);
        product.buy(10, 10, product);
        System.out.println("Product" + product.description + " stock: " + product.stock);
        product.sale(10, 5, product);
        System.out.println("Product" + product.description + " stock: " + product.stock);
     }


}
