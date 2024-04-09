package org.example;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder
        Product product = Product.builder()
                .name("Laptop")
                .description("Powerful laptop with high performance specifications.")
                .price(1500.0)
                .build();

        // Ürün bilgileri
        System.out.println("Product Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: €" + product.getPrice());
    }
}
